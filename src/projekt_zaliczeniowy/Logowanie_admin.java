package projekt_zaliczeniowy;

public class Logowanie_admin extends Logowanie_bazowe
{
	public Logowanie_admin() 
	{
		super();
		kto_loguje=new String("administrator");	
		setTitle("Logowanie admin");
		setVisible(true);
	}

	@Override
	public void otworz_okno() 
	{
		new Okno_admin();	
	}
}
