package projekt_zaliczeniowy;

public class Obiekt_obserwator implements Obserwator
{
	Obiekt_obserwator()
	{
		
	}
	public void update() throws ClassNotFoundException
	{
			//int pom=Ksiazka.temp;
			int pom2=Ksiazka.odczytaj_ilosc_ksiazek();
			int pom=Biblioteka.getInstance().lista_ksiazek.size();
			System.out.println("ilosc ksiazek w bibliotece:"+pom);
			System.out.println("ilosc ksiazek w pliku:"+pom2);
			//Ksiazka.numer_ksiazki=Ksiazka.odczytaj_ilosc_ksiazek();
			if((pom+1)!=pom2)
				Biblioteka.getInstance().wczytaj_ksiazki(pom+1,pom2);
	}
}
