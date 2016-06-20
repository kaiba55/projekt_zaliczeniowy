package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Okno_szukaj2 extends Okno_szukaj_ksiazki {

	private JPanel contentPane;

	public Okno_szukaj2() 
	{
		super();
		for(int i=0;i<4;i++)
		{
			tablica[i].setText("");
			tablica[i].setEnabled(false);
		}
	}

}
