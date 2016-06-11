package projekt_zaliczeniowy;

public class Dodaj_ksiazke_model 
{
	User temp=new User();
	void dodaj_ksiazke(String tytul,String autorzy, String data_wydania,String wydawnictwo,String kategoria, int ilosc)
	{
		Ksiazka temp=new Ksiazka(tytul,autorzy,data_wydania,wydawnictwo,kategoria,ilosc);
		temp.Zapisz_plik();
	}
}
