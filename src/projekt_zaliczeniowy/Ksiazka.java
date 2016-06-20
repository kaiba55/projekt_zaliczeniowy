package projekt_zaliczeniowy;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ksiazka implements Serializable
{
	static int numer_ksiazki=1;
	private static final long serialVersionUID = -3484649703683444406L;
	private String tytul;
	private String autorzy;
	private String data_wydania;
	private String wydawnictwo;
	private int ilosc;
	private String kategoria;
	private int id;
	
	public String get_tytul()
	{
		return tytul;
	}
	
	public String get_autorzy()
	{
		return autorzy;
	}
	
	public String get_data_wydania()
	{
		return data_wydania;
	}
	
	public String get_wydawnictwo()
	{
		return wydawnictwo;
	}
	
	public int get_ilosc()
	{
		return ilosc;
	}
	
	public String get_kategoria()
	{
		return kategoria;
	}
	
	public int get_id()
	{
		return id;
	}
	
	public Ksiazka()
	{
		;
	}
	public Ksiazka(String tytul,String autorzy, String data_wydania,String wydawnictwo,String kategoria,int ilosc)
	{
		this.tytul=tytul;
		this.autorzy=autorzy;
		this.data_wydania=data_wydania;
		this.wydawnictwo=wydawnictwo;
		this.kategoria=kategoria;
		this.id=numer_ksiazki;
		this.ilosc=ilosc;
		numer_ksiazki++;	
	}
	public void Zapisz_plik()
	{
		String nazwa_pliku=Integer.toString(this.id);
		String numeryksiazek="numery";
		try(ObjectOutputStream plik=new ObjectOutputStream(new FileOutputStream(nazwa_pliku));
				ObjectOutputStream plik2=new ObjectOutputStream(new FileOutputStream(numeryksiazek))
				)
		{
			plik.writeObject(this);
			plik2.writeObject(Ksiazka.numer_ksiazki);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void Aktualizuj_plik(int p)
	{
		String nazwa_pliku=Integer.toString(p);
		try(ObjectOutputStream plik=new ObjectOutputStream(new FileOutputStream(nazwa_pliku)))

		{
			plik.writeObject(this);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void Odczyt_plik(int i) throws ClassNotFoundException
	{
		String nazwa_pliku=Integer.toString(i);
		Ksiazka temp=new Ksiazka();
		try(ObjectInputStream we=new ObjectInputStream(new FileInputStream(nazwa_pliku)))
		{
			temp=(Ksiazka) we.readObject();
			this.tytul=temp.tytul;
			this.autorzy=temp.autorzy;
			this.data_wydania=temp.data_wydania;
			this.wydawnictwo=temp.wydawnictwo;
			this.kategoria=temp.kategoria;
			this.id=i;
			this.ilosc=temp.ilosc;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	static public int odczytaj_ilosc_ksiazek() throws ClassNotFoundException
	{
		int temp;
		String numeryksiazek="numery";
		try(ObjectInputStream we=new ObjectInputStream(new FileInputStream(numeryksiazek)))
		{
			temp=(int) we.readObject();
			return temp;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return 1;
	}
	
	public int dodaj(int a, int b)
	{
		return a+b;
	}
}
