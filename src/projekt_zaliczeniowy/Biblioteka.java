package projekt_zaliczeniowy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class Biblioteka implements Obserwowany
{
    private static volatile Biblioteka instance = null;
    ArrayList<Obserwator> obserwatorzy;
    ArrayList<Ksiazka> lista_ksiazek=new ArrayList<Ksiazka>();
    ArrayList<User> lista_uzytkownikow=new ArrayList<User>();
    public void wczytaj_ksiazki() throws ClassNotFoundException
    {

    	for(int i=1;i<Ksiazka.numer_ksiazki;i++)
    	{
    		Ksiazka temp=new Ksiazka();
    		temp.Odczyt_plik(i);
    		lista_ksiazek.add(temp);
    	}
    }
    
    public void wczytaj_userow() throws ClassNotFoundException
    {

    	for(int i=1;i<User.nr_usera;i++)
    	{
    		User temp2=new User();
    		temp2.Odczyt_plik(i);
    		System.out.println(temp2.email);
    		System.out.println(temp2.haslo);
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
                	instance = new Biblioteka();
                  
               
                	User.nr_usera=User.odczytaj_ilosc_userow();
                	instance.wczytaj_userow();
                	Ksiazka.numer_ksiazki=Ksiazka.odczytaj_ilosc_ksiazek();
                 	instance.wczytaj_ksiazki();
                	if(instance.lista_uzytkownikow.size()==0)
                	{
                		User administrator=new User("Wojciech","Ksiazek","Chrzastowice","84","wojtekksiazekk@gmail.com","1312312","wojtek123","administrator");
                		administrator.Zapisz_plik();
                	}  
                  
                    instance.obserwatorzy = new ArrayList<Obserwator>();               
                }
                else
                	System.out.println("problem"); 
            }
        }
        return instance;
    }
    public void dodajObserwatora(Obserwator o)
    {
    	obserwatorzy.add(o);
    }
    	 
    public void usunObserwatora(Obserwator o)
    {
    	int index = obserwatorzy.indexOf(o);
    	obserwatorzy.remove(index);
    }
    	 
    public void powiadamiajObserwatorow() throws ClassNotFoundException
    {
    	for(Obserwator o : obserwatorzy)
    	{
    		o.update();
    	}
    }
    private Biblioteka() 
    {
    	
    }

}


