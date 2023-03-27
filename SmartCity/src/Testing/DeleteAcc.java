package Testing;

import static Account.UserArray.users;

import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Account.Account;
import Account.GeneralAdmin;
import Account.UserArray;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.Action;
import java.awt.FlowLayout;

public class DeleteAcc extends JPanel {
	private JTextField tusername;
	private final Action action = new SwingAction();
	public GeneralAdmin user;
	private JPanel pHome;
	/**
	 * Create the panel.
	 */
	public DeleteAcc(GeneralAdmin A) {
		setBounds(0,0,593,498);
		user=A;
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		pHome = new Home(A);
		
		JLabel lblNewLabel_2 = new JLabel("DELETE ACCOUNT (username)");
		add(lblNewLabel_2);
		tusername = new JTextField();
		tusername.setText("");
		add(tusername);
		tusername.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setAction(action);
		add(btnNewButton);
		String txt=" ";
		JLabel lblNewLabel_1 = new JLabel("");
		add(lblNewLabel_1);
		
		for (int i = 0; i < users.size();i++) { 
			txt=users.get(i)+"\n";
			JLabel lblNewLabel = new JLabel(txt);
			lblNewLabel.setFont(new Font("STHupo", Font.PLAIN, 9));
			lblNewLabel.setForeground(SystemColor.windowText);
			lblNewLabel.setBounds(234, 167, 159, 119);
			lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
			add(lblNewLabel);
			
		
		
		}
		
		
	}
	public class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Submit");
			putValue(SHORT_DESCRIPTION, "Enter username");
		}
		public void actionPerformed(ActionEvent e) {
			String userna =tusername.getText().toString();
			try {
				user.DeleteAcc(userna);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("Account Deleted");
			setVisible(false);
			pHome.setVisible(true);
		}
		
		
	}
}
