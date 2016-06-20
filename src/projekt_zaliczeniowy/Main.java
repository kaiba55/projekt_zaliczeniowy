package projekt_zaliczeniowy;

public class Main 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		//Biblioteka biblioteka=Biblioteka.getInstance();//biblioteka singleton
		
		Biblioteka.getInstance();
		//User.odczytaj_ilosc_userow();
		//System.out.print("tutej"+User.nr_usera);
		//Biblioteka.getInstance().wczytaj_userow();
		//System.out.println("rozmiar a:"+Biblioteka.getInstance().lista_uzytkownikow.get(1).lista_wypozyczen.size());
		//System.out.println("rozmiar b:"+Biblioteka.getInstance().lista_uzytkownikow.get(2).lista_wypozyczen.size());
		//Biblioteka.getInstance().fun();
		//System.out.println("adsa"+Ksiazka.numer_ksiazki);
		new Logowanie();
		Aktualizuj_Biblioteke akt=new Aktualizuj_Biblioteke();
		Thread thread=new Thread(akt);
		thread.start();
		//biblioteka.fun();
	}
}
