package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Okno_info_user extends JFrame {

	private JPanel contentPane;
	JLabel tab[];
	JButton tablica[];
	int nr;
	int nr2;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 */
	public Okno_info_user() throws ClassNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		tab=new JLabel[4];
		tablica=new JButton[4];
JButton btnNewButton = new JButton("Zwr\u00F3c\r\n");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
	}
});
btnNewButton.setVisible(false);
		JButton btnZwrc = new JButton("Zwr\u00F3c");
		btnZwrc.setVisible(false);
		JButton btnZwrc_1 = new JButton("Zwr\u00F3c");
		btnZwrc_1.setVisible(false);
		JButton btnZwrc_2 = new JButton("Zwr\u00F3c");
		btnZwrc_2.setVisible(false);
		tablica[0]=btnNewButton;
		tablica[1]=btnZwrc;
		tablica[2]=btnZwrc_1;
		tablica[3]=btnZwrc_2;
		JLabel lblTwojePozyczoneKsiazki = new JLabel("Twoje pozyczone ksiazki");
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setVisible(false);
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setVisible(false);
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setVisible(false);
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setVisible(false);
		JLabel lblNewLabel_4 = new JLabel("New label");
		tab[0]=lblNewLabel;
		tab[1]=lblNewLabel_1;
		tab[2]=lblNewLabel_2;
		tab[3]=lblNewLabel_3;
		for(int i=0;i<Biblioteka.getInstance().lista_uzytkownikow.get(Logowanie_bazowe.aktualnie_zalogowany).lista_wypozyczen.size();i++)
		{
			nr=Biblioteka.getInstance().lista_uzytkownikow.get
					(Logowanie_bazowe.aktualnie_zalogowany).lista_wypozyczen.get(i);
			nr2=i;
			String tyt=Biblioteka.getInstance().lista_ksiazek.get(nr).get_tytul();
			tab[i].setText(tyt);
			tab[i].setVisible(true);
			tablica[i].setVisible(true);
			tablica[i].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					try 
					{
						//Biblioteka.getInstance().lista_ksiazek.get(nr).ilosc--;
						Biblioteka.getInstance().lista_ksiazek.get(nr).Aktualizuj_plik(nr+1);
						Biblioteka.getInstance().lista_uzytkownikow.get(Logowanie_bazowe.aktualnie_zalogowany).lista_wypozyczen.remove(nr2);
						Biblioteka.getInstance().lista_uzytkownikow.get(Logowanie_bazowe.aktualnie_zalogowany).Aktualizuj(Logowanie_bazowe.aktualnie_zalogowany+1);
						dispose();
						new Dialog_zwrocono();
					} 
					catch (ClassNotFoundException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
		}
		JLabel lblZalogowanyJako = new JLabel("Zalogowany jako:");
		String zalogowany;
		try {
			zalogowany = Biblioteka.getInstance().lista_uzytkownikow.get(Logowanie_bazowe.aktualnie_zalogowany).email;
			lblNewLabel_4.setText(zalogowany);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JButton btnPowrotDoPoprzedniego = new JButton("Powrot do poprzedniego okna");
		btnPowrotDoPoprzedniego.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new Okno_uzytkownik();
				dispose();
			}
		});
		
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(42)
							.addComponent(lblTwojePozyczoneKsiazki))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(61)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnZwrc_2)
								.addComponent(btnZwrc_1)
								.addComponent(btnZwrc)
								.addComponent(btnNewButton))))
					.addGap(54)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addComponent(lblZalogowanyJako)
						.addComponent(btnPowrotDoPoprzedniego))
					.addContainerGap(202, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblZalogowanyJako)
						.addComponent(lblTwojePozyczoneKsiazki))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_4)
						.addComponent(btnNewButton))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(btnZwrc))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(btnZwrc_1))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(btnZwrc_2)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addComponent(btnPowrotDoPoprzedniego)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
