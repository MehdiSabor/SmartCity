package Testing;

import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Account.Resident;
import javax.swing.JTextPane;

public class HomeR extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomeR(Resident R) {
		setBounds(0,0,593,498);
		
		setVisible(true);
		setLayout(null);
		
		
		String txt="Info"+R.toString()+"\n"+R.getAppart().ShowI();
		
		JTextArea textArea = new JTextArea(txt);
		textArea.setBounds(10, 27, 573, 461);
		textArea.setEditable(false);
		textArea.setOpaque(false);
		add(textArea);
		
		

	}
}
