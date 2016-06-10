package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Logowanie extends JFrame {

	private JPanel contentPane;
	JButton btnSkorzystajJakoGo;
	public Biblioteka biblioteka;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Logowanie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setVisible(true);
		JButton btnSkorzystajJakoUytkownik = new JButton("Skorzystaj jako u\u017Cytkownik");
		btnSkorzystajJakoUytkownik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				new Okno_user();
				dispose();
			}
		});
		//biblioteka.fun();
		JButton btnSkorzystajJakoAdministrator = new JButton("Skorzystaj jako administrator");
		btnSkorzystajJakoAdministrator.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				new Okno_admin();
				dispose();
			}
		});
		
		btnSkorzystajJakoGo = new JButton("Skorzystaj jako go\u015B\u0107");
		btnSkorzystajJakoGo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				new Okno_gosc();
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(btnSkorzystajJakoUytkownik)
							.addGap(18)
							.addComponent(btnSkorzystajJakoAdministrator, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(110)
							.addComponent(btnSkorzystajJakoGo, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(96)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSkorzystajJakoUytkownik)
						.addComponent(btnSkorzystajJakoAdministrator))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSkorzystajJakoGo)
					.addContainerGap(103, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
