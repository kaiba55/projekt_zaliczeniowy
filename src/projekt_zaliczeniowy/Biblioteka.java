package projekt_zaliczeniowy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class Biblioteka 
{
	//lista uzytkownikow i lista ksiazek, wczytanie ksiazek do bazy
	//jtable do usuwania ksiazek
    private static volatile Biblioteka instance = null;
    ArrayList<Ksiazka> lista_ksiazek=new ArrayList<Ksiazka>();
    ArrayList<User> lista_uzytkownikow=new ArrayList<User>();
    //przydala by sie jakas struktura danych do przechowywania par email i haslo+ panel logowania
    public void wczytaj_ksiazki() throws ClassNotFoundException
    {

    	for(int i=1;i<Ksiazka.numer_ksiazki;i++)
    	{
    		Ksiazka temp=new Ksiazka();
    		temp.Odczyt_plik(i);
    		/*System.out.println(temp.tytul);
    		System.out.println(temp.autorzy);*/
    		lista_ksiazek.add(temp);
    	}
    }
    public void wczytaj_userow() throws ClassNotFoundException
    {

    	for(int i=0;i<User.nr_usera;i++)
    	{
    		User temp2=new User();
    		temp2.Odczyt_plik(i);
    		/*System.out.println(temp.imie);
    		System.out.println(temp.nazwisko);*/
    		lista_uzytkownikow.add(temp2);
    	}
    }
    
    
    public static Biblioteka getInstance() throws ClassNotFoundException 
    {
        if (instance == null) 
        {
            synchronized (Biblioteka.class) 
            {
                if (instance == null) 
                {
                	String numeryksiazek="numery_userow";	
                	User administrator=new User("Wojciech","Ksiazek","Chrzastowice","84","wojtekksiazekk@gmail.com","1312312","wojtek123","administrator");
                	administrator.Zapisz_plik();
                    instance = new Biblioteka();//zrob w try zamiast if
                    Ksiazka.numer_ksiazki=Ksiazka.odczytaj_ilosc_ksiazek();
                    User.nr_usera=User.odczytaj_ilosc_userow();
                    System.out.println(Ksiazka.numer_ksiazki);
                    instance.wczytaj_ksiazki();
                    instance.wczytaj_userow();
                }
                else
                	System.out.println("problem"); //i to w catch
            }
        }
        return instance;
    }
    
    private Biblioteka() 
    {
    	
    }

 
}


