package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Okno_szukaj_ksiazki extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel[] tab;
	protected JButton[] tablica;
	int nr_ksiazki;
	int nr_labela;

	
	public Okno_szukaj_ksiazki() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 473);
		contentPane = new JPanel();
		setVisible(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblWpiszTytuKsiki = new JLabel("Wpisz tytu\u0142 ksi\u0105\u017Cki:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnSzukaj = new JButton("Szukaj ");
	
		JLabel lblZnalezione = new JLabel("Znalezione:");
		JLabel lblNewLabel_1 = new JLabel("New label"); 
		lblNewLabel_1.setVisible(false);
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setVisible(false);
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setVisible(false);
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setVisible(false);
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setVisible(false);
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setVisible(false);
		tab=new JLabel[6];
		tablica=new JButton[6];
		tab[0]=lblNewLabel;
		tab[1]=lblNewLabel_1;
		tab[2]=lblNewLabel_2;
		tab[3]=lblNewLabel_3;
		tab[4]=lblNewLabel_4;
		tab[5]=lblNewLabel_5;
		
		JButton btnNewButton = new JButton("Wypozycz");

		btnNewButton.setVisible(false);
		JButton btnNewButton_1 = new JButton("Wypozycz");
	
		btnNewButton_1.setVisible(false);
		JButton btnNewButton_2 = new JButton("Wypozycz");

		btnNewButton_2.setVisible(false);
		JButton btnNewButton_3 = new JButton("Wypozycz");

		btnNewButton_3.setVisible(false);
		JButton btnNewButton_4 = new JButton("Wypozycz");
	
		btnNewButton_4.setVisible(false);
		JButton btnNewButton_5 = new JButton("Wypozycz");
	
		btnNewButton_5.setVisible(false);
		tablica[0]=btnNewButton;
		tablica[1]=btnNewButton_1;
		tablica[2]=btnNewButton_2;
		tablica[3]=btnNewButton_3;
		tablica[4]=btnNewButton_4;
		tablica[5]=btnNewButton_5;
		
		JButton btnPowrotDoPoprzedniego = new JButton("Powrot do poprzedniego okna");
		btnPowrotDoPoprzedniego.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				new Okno_uzytkownik();
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(87)
							.addComponent(btnSzukaj, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3)
										.addComponent(lblNewLabel_4)
										.addComponent(lblNewLabel_5))
									.addGap(49)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_5)
										.addComponent(btnNewButton_4)
										.addComponent(btnNewButton_3)
										.addComponent(btnNewButton_2)
										.addComponent(btnNewButton_1)
										.addComponent(btnNewButton)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblWpiszTytuKsiki)
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblZnalezione)
									.addPreferredGap(ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
									.addComponent(btnPowrotDoPoprzedniego)
									.addPreferredGap(ComponentPlacement.RELATED)))))
					.addContainerGap(28, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(49)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWpiszTytuKsiki)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnSzukaj)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblZnalezione)
						.addComponent(btnPowrotDoPoprzedniego))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(btnNewButton_2))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(btnNewButton_3))
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(btnNewButton_4))
							.addGap(31)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5)
								.addComponent(btnNewButton_5)))
						.addComponent(btnNewButton_1))
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		btnSzukaj.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				//algorytm szukania
				String temp=textField.getText();
				nr_labela=0;
	
				for(int i=0;i<tab.length;i++)
				{
					tab[i].setVisible(false);
					tablica[i].setVisible(false);
				}
				try {
				
					for(int i=0;i<Biblioteka.getInstance().lista_ksiazek.size();i++)
					{
						if(Biblioteka.getInstance().lista_ksiazek.get(i).get_tytul().equals(temp) && Biblioteka.getInstance().lista_ksiazek.get(i).get_ilosc()!=0)
						{	
							nr_ksiazki=i;
							tab[nr_labela].setText(temp);
							tab[nr_labela].setVisible(true);
							tablica[nr_labela].setVisible(true);
							tablica[nr_labela].addActionListener(new ActionListener() 
							{
								public void actionPerformed(ActionEvent e) 
								{
									try {
										if(Biblioteka.getInstance().lista_uzytkownikow.get(Logowanie_bazowe.aktualnie_zalogowany).lista_wypozyczen.size()==4)
										{
											new Dialog_za_duzo_ksiazek();
											dispose();											
										}
										else
										{
											dispose();
											try 
											{
												System.out.println("sprawdzamy zalogowanego"+Logowanie_bazowe.aktualnie_zalogowany);
												int a=nr_ksiazki;
												Biblioteka.getInstance().lista_uzytkownikow.get(Logowanie_bazowe.aktualnie_zalogowany).lista_wypozyczen.add(a);
												Biblioteka.getInstance().lista_uzytkownikow.get(Logowanie_bazowe.aktualnie_zalogowany).Aktualizuj(Logowanie_bazowe.aktualnie_zalogowany+1);
												System.out.println(a);
												System.out.println(Biblioteka.getInstance().lista_uzytkownikow.get(Logowanie_bazowe.aktualnie_zalogowany).lista_wypozyczen.size())	;
												System.out.println("dodano");;
												Biblioteka.getInstance().lista_ksiazek.get(a).Aktualizuj_plik(a+1);										
											} 
											catch (ClassNotFoundException e1) 
											{
												// TODO Auto-generated catch block
												//e1.printStackTrace();
											}
											new Dialog_wypozyczone();
										}
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									
									
								}
							});
							nr_labela++;
						}
					}
				} catch (ClassNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		panel.setLayout(gl_panel);
	}
}
