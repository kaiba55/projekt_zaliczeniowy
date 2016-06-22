package projekt_zaliczeniowy;

public class Main 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		//Biblioteka biblioteka=Biblioteka.getInstance();//biblioteka singleton
		
		Biblioteka.getInstance();
		new Logowanie();
		Aktualizuj_Biblioteke akt=new Aktualizuj_Biblioteke();
		Thread thread=new Thread(akt);
		thread.start();
	}
}
