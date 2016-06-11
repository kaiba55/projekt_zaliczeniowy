package projekt_zaliczeniowy;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Okno extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 * @throws ClassNotFoundException 
	 */
	static JLabel test;
	public static void main(String[] args) throws ClassNotFoundException 
	{
		try 
		{
			Okno dialog = new Okno();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		//jakis test jednostkowy
		/*Ksiazka ksiazka=new Ksiazka("tytul","autor","data","wydawnictwo","kategoria");
		ksiazka.Zapisz_plik();
		Ksiazka testt=new Ksiazka();*/
		
		//test.setText(testt.kategoria);
	}	
	

	/**
	 * Create the dialog.
	 */
	public Okno() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		test=new JLabel("");
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblNewLabel = new JLabel("New label");
			contentPanel.add(lblNewLabel);
			contentPanel.add(test);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
