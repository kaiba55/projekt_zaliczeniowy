package projekt_zaliczeniowy;

public class Simple_factory 
{
	Simple_factory()
	{
		;
	}
	public User create_product (String imie,String nazwisko,String miejsce_zamieszkania,String nr_mieszkania,String email,String telefon,String haslo) 
	{
		User product;
		product=new User(imie,nazwisko,miejsce_zamieszkania,nr_mieszkania,email,telefon,haslo,"uzytkownik");
		return product;
	}	
	
}
