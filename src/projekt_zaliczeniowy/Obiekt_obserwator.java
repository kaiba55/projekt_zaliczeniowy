package projekt_zaliczeniowy;

public class Obiekt_obserwator implements Obserwator
{
	Obiekt_obserwator()
	{
		
	}
	public void update() throws ClassNotFoundException
	{
			int pom2=Ksiazka.odczytaj_ilosc_ksiazek();
			int pom=Biblioteka.getInstance().lista_ksiazek.size();
			if((pom+1)!=pom2)
			{
		    	for(int i=pom+1;i<pom2;i++)
		    	{
		    		Ksiazka temp=new Ksiazka();
		    		temp.Odczyt_plik(i);
		    		Biblioteka.getInstance().lista_ksiazek.add(temp);
		    	}
			}
	}
}
