package projekt_zaliczeniowy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dodaj_ksiazke_controller 
{
	private Dodaj_ksiazke_view view;
	private Dodaj_ksiazke_model model;
	Dodaj_ksiazke_controller (Dodaj_ksiazke_view view,Dodaj_ksiazke_model model)
	{
		this.view=view;
		this.model=model;
		this.view.dodaj_listener(new dodajListener());
		this.view.anuluj_lister(new anulujListener());
	}


class dodajListener implements ActionListener
{

	public void actionPerformed(ActionEvent e) 
	{
		model.dodaj_ksiazke(view.get_tytul(), view.get_autor(), view.get_rok_wydania(), view.get_wydawnictwo(), view.get_kategoria(),view.get_ilosc());
	}

}

class anulujListener implements ActionListener
{

	public void actionPerformed(ActionEvent e) 
	{
		new Okno_admin();
		view.dispose();
		
	}

}

}