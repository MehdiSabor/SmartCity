package Testing;

import javax.swing.JPanel;

import Account.Resident;
import Smart.Appartment;
import Smart.StreetArray;
import Testing.D.SwingAction;
import Testing.D.SwingAction_1;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.Action;

public class pChange extends JPanel {
	private JTextField textField;
	private final Action action = new SwingAction();
	
	private static Resident user;
	private static Appartment a;
	private StreetArray Arr;
	private int i=5;
	/**
	 * Create the panel.
	 */
	public pChange(Resident R) {
		user=R;
		setBounds(0,0,593,498);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change Password");
		lblNewLabel.setBounds(241, 41, 103, 33);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter New Password");
		lblNewLabel_1.setBounds(116, 181, 116, 13);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(225, 178, 136, 19);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Change");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(371, 177, 85, 21);
		add(btnNewButton);
		
	}

	private class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "Change");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			String npassword = textField.getText().toString();
			user.setPassword(npassword);
			setVisible(false);
		}
		
	}
}
