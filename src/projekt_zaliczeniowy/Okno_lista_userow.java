package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Okno_lista_userow extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 * @throws ClassNotFoundException 
	 */
	public Okno_lista_userow() throws ClassNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1181, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		String rowData[][]=new String[User.nr_usera][10];
		for(int i=0;i<Biblioteka.getInstance().lista_uzytkownikow.size();i++)//uwaga
		{
				User temp=Biblioteka.getInstance().lista_uzytkownikow.get(i);
				rowData[i][0]=Integer.toString(temp.id_usera);
				rowData[i][1]=temp.imie;
				rowData[i][2]=temp.nazwisko;
				rowData[i][3]=temp.miejsce_zamieszkania;
				rowData[i][4]=temp.nr_mieszkania;
				rowData[i][5]=temp.email;
				rowData[i][6]=temp.telefon;
				rowData[i][7]=temp.typ;
				rowData[i][8]=temp.haslo;
				rowData[i][9]="";
				if(temp.lista_wypozyczen.size()!=0 ||temp.lista_wypozyczen!=null)
				{
					for(int j=0;j<temp.lista_wypozyczen.size();j++)
					{
						rowData[i][9]+=Integer.toString(temp.lista_wypozyczen.get(j))+",";
					}
				}
				else
				{
					rowData[i][9]="";
				}
		}
		Object columnNames[] = { "Id","Imie","Nazwisko", "Miejsce zamieszkania", "Nr mieszkania","E-mail","Telefon","Typ","Haslo","Lista wypozyczen"};
		
		table = new JTable(rowData,columnNames);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
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
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(85)
					.addComponent(btnNewButton_1)
					.addContainerGap(143, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}

}
