package Testing;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Account.GeneralAdmin;

import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import java.awt.Font;

public class Home extends JPanel {

	/**
	 * Create the panel.
	 */
	public Home(GeneralAdmin A) {
		setBounds(0,0,593,498);
	
		setVisible(true);
		JLabel lblNewLabel = new JLabel("Info"+A.toString());
		lblNewLabel.setFont(new Font("STHupo", Font.PLAIN, 9));
		lblNewLabel.setForeground(SystemColor.windowText);
		lblNewLabel.setBounds(234, 167, 159, 119);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		add(lblNewLabel);
	}

}
