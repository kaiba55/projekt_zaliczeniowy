package projekt_zaliczeniowy;

public class Main 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		//Biblioteka biblioteka=Biblioteka.getInstance();//biblioteka singleton
		Biblioteka.getInstance().wczytaj_ksiazki();
		Biblioteka.getInstance().wczytaj_userow();
		//Biblioteka.getInstance().fun();
		//System.out.println("adsa"+Ksiazka.numer_ksiazki);
		new Logowanie();
		//biblioteka.fun();
	}
}
