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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

abstract public class Logowanie_bazowe extends JFrame {

	public JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblNiepoprawneDane;
	String kto_loguje;
	abstract public void otworz_okno();
	static int aktualnie_zalogowany;

	public Logowanie_bazowe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblWprowadEmail = new JLabel("Wprowad\u017A email");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblWprowadHaslo = new JLabel("Wprowad\u017A haslo");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnZaloguj = new JButton("Zaloguj");
		lblNiepoprawneDane = new JLabel("Niepoprawne dane");
		lblNiepoprawneDane.setVisible(false);
		btnZaloguj.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try {
					for(int i=0;i<Biblioteka.getInstance().lista_uzytkownikow.size();i++)
					{
						try 
						{
							if( (Biblioteka.getInstance().lista_uzytkownikow.get(i).email.equals(textField.getText()) )
									&& (Biblioteka.getInstance().lista_uzytkownikow.get(i).haslo.equals(textField_1.getText())) && (Biblioteka.getInstance().lista_uzytkownikow.get(i).typ.equals(kto_loguje)))
							{
								otworz_okno();
								aktualnie_zalogowany=i;
								System.out.println("aktualnie zalogowany to:"+aktualnie_zalogowany);
								dispose();
							}
							else
							{
								lblNiepoprawneDane.setVisible(true);
							}
						} catch (ClassNotFoundException e1) 
						{
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				} catch (ClassNotFoundException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(76)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWprowadEmail)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblWprowadHaslo)
									.addGap(75)
									.addComponent(lblNiepoprawneDane))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(87)
							.addComponent(btnZaloguj)))
					.addContainerGap(148, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(74)
					.addComponent(lblWprowadEmail)
					.addGap(18)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWprowadHaslo)
						.addComponent(lblNiepoprawneDane))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnZaloguj)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
