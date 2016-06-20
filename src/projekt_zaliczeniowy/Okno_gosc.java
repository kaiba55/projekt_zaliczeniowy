package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Okno_gosc extends Okno_uzytkownik 
{

	private JPanel contentPane;
	void otworz_okno()
	{
		new Okno_szukaj2();
	}
	public Okno_gosc() {
		super();
		setVisible(true);	
	}

}
