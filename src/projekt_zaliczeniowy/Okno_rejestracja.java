package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Okno_rejestracja extends JFrame 
{

	private JPanel contentPane;
	private JTextField txtImie;
	private JTextField txtNazwisko;
	private JTextField txtMiejscezamieszkania;
	private JTextField txtNrMieszkania;
	private JTextField txtEmail;
	private JTextField txtTelefon;
	private JTextField txtHaslo;
	private Simple_factory factory;

	public Okno_rejestracja(Simple_factory factory) 
	{
		this.factory = factory;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		txtImie = new JTextField();
		txtImie.setText("imie");
		txtImie.setColumns(10);
		
		txtNazwisko = new JTextField();
		txtNazwisko.setText("nazwisko");
		txtNazwisko.setColumns(10);
		
		txtMiejscezamieszkania = new JTextField();
		txtMiejscezamieszkania.setText("miejsce_zamieszkania");
		txtMiejscezamieszkania.setColumns(10);
		
		txtNrMieszkania = new JTextField();
		txtNrMieszkania.setText("Nr mieszkania");
		txtNrMieszkania.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("email");
		txtEmail.setColumns(10);
		
		txtTelefon = new JTextField();
		txtTelefon.setText("telefon");
		txtTelefon.setColumns(10);
		
		txtHaslo = new JTextField();
		txtHaslo.setText("haslo");
		txtHaslo.setColumns(10);
		
		JButton btnZarejestruj = new JButton("Zarejestruj");
		btnZarejestruj.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//algorytm rejestracji
				produkuj(txtImie.getText(),txtNazwisko.getText(),txtMiejscezamieszkania.getText(),txtNrMieszkania.getText(),
						txtEmail.getText(),txtTelefon.getText(),txtHaslo.getText());
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(55)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtNazwisko, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtImie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(txtNrMieszkania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtMiejscezamieszkania, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtTelefon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(94)
									.addComponent(btnZarejestruj))
								.addComponent(txtHaslo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addComponent(txtImie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtNazwisko, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtMiejscezamieszkania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtNrMieszkania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtTelefon, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtHaslo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(154)
							.addComponent(btnZarejestruj)))
					.addContainerGap(145, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
	
	public void produkuj(String imie,String nazwisko,String miejsce_zamieszkania,String nr_mieszkania,String email,String telefon,String haslo)
	{
		User us=factory.create_product(imie, nazwisko, miejsce_zamieszkania, nr_mieszkania, email, telefon, haslo);
		us.Zapisz_plik();
		System.out.print(us.imie);
		dispose();
		new Dialog_zarejestrowany();
	}

}
