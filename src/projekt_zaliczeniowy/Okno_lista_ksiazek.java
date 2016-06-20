package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Okno_lista_ksiazek extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 */
	public Okno_lista_ksiazek() throws ClassNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		String rowData[][]=new String[Ksiazka.numer_ksiazki][7];
		//System.out.println(Ksiazka.numer_ksiazki);
		for(int i=0;i<Ksiazka.numer_ksiazki-1;i++)
		{
				Ksiazka temp=Biblioteka.getInstance().lista_ksiazek.get(i);
				rowData[i][0]=Integer.toString(temp.get_id());
				rowData[i][1]=temp.get_tytul();
				rowData[i][2]=temp.get_autorzy();
				rowData[i][3]=temp.get_data_wydania();
				rowData[i][4]=temp.get_wydawnictwo();
				rowData[i][5]=temp.get_kategoria();
				rowData[i][6]=Integer.toString(temp.get_ilosc());
				
		}
		Object columnNames[] = { "id","Tytu³", "Autor", "Data wydania","Wydawnictwo","Kategoria","Ilosc"};
		table = new JTable(rowData,columnNames);
		scrollPane.setViewportView(table);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("Usu\u0144 ksi\u0105\u017Cke");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("Anuluj");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
				new Okno_admin();
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, Alignment.TRAILING)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(57)
					.addComponent(btnNewButton)
					.addGap(64)
					.addComponent(btnNewButton_1)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		setVisible(true);

	}
}
