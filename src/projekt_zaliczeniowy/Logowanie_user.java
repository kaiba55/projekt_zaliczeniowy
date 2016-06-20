package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Logowanie_user extends Logowanie_bazowe {

	public Logowanie_user() 
	{
		super();
		kto_loguje=new String("uzytkownik");	
		setTitle("Logowanie user");
		setVisible(true);
		
	}

	@Override
	public void otworz_okno() 
	{
		new Okno_uzytkownik();	
	}

}
