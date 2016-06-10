package projekt_zaliczeniowy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable
{
	static int nr_usera=1;
	String imie;
	String nazwisko;
	String miejsce_zamieszkania;
	String nr_mieszkania;
	String email;
	String telefon;
	String haslo;
	String typ; //uzytkownik, administrator
	int id_usera;
	User()
	{
		;
	}
	User(String imie,String nazwisko,String miejsce_zamieszkania,String nr_mieszkania,String email,String telefon,String haslo,String typ)
	{
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.miejsce_zamieszkania=miejsce_zamieszkania;
		this.nr_mieszkania=nr_mieszkania;
		this.email=email;
		this.telefon=telefon;
		this.haslo=haslo;
		this.id_usera=nr_usera;
		this.typ=typ;
		nr_usera++;
	}
	public void Zapisz_plik()
	{
		String nazwa_pliku="user"+Integer.toString(this.id_usera);
		String numeryksiazek="numery_userow";
		try(ObjectOutputStream plik=new ObjectOutputStream(new FileOutputStream(nazwa_pliku));
				ObjectOutputStream plik2=new ObjectOutputStream(new FileOutputStream(numeryksiazek))
				)
		{
			plik.writeObject(this);
			plik2.writeObject(User.nr_usera);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public void Odczyt_plik(int i) throws ClassNotFoundException
	{
		String nazwa_pliku="user"+Integer.toString(i);
		User temp=new User();
		try(ObjectInputStream we=new ObjectInputStream(new FileInputStream(nazwa_pliku)))
		{
			temp=(User) we.readObject();
			this.imie=temp.imie;
			this.nazwisko=temp.nazwisko;
			this.miejsce_zamieszkania=temp.miejsce_zamieszkania;
			this.nr_mieszkania=temp.nr_mieszkania;
			this.email=temp.email;
			this.telefon=temp.telefon;
			this.haslo=temp.haslo;
			this.id_usera=temp.id_usera;
			this.typ=temp.typ;
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	static public int odczytaj_ilosc_userow() throws ClassNotFoundException
	{
		int temp;
		String numeryuserow="numery_userow";
		try(ObjectInputStream we=new ObjectInputStream(new FileInputStream(numeryuserow)))
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
}

