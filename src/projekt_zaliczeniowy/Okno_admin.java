package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Okno_admin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Okno_admin() {
		Aktualizuj_Biblioteke akt=new Aktualizuj_Biblioteke();
		Thread thread=new Thread(akt);
		thread.start();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		JButton btnDodajKsikeDo = new JButton("Dodaj ksi\u0105\u017Cke do bazy");
		btnDodajKsikeDo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				Dodaj_ksiazke_view temp=new Dodaj_ksiazke_view();
				Dodaj_ksiazke_model temp2=new Dodaj_ksiazke_model();
				new Dodaj_ksiazke_controller(temp,temp2);
				
				dispose();	
			}
		});
		
		JButton btnPrzegldajKsiki = new JButton("Przegl\u0105daj ksi\u0105\u017Cki");
		btnPrzegldajKsiki.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					new Okno_lista_ksiazek();
				} 
				catch (ClassNotFoundException e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		
		JButton btnNewButton = new JButton("Przegl\u0105daj u\u017Cytkownik\u00F3w");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try {
					new Okno_lista_userow();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnDodajKsikeDo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
					.addGap(35)
					.addComponent(btnPrzegldajKsiki, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(37)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDodajKsikeDo)
						.addComponent(btnPrzegldajKsiki, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addComponent(btnNewButton)
					.addContainerGap(127, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
