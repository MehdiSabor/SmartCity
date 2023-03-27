package Testing;

import static Account.UserArray.users;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Account.GeneralAdmin;
import Testing.DeleteAcc.SwingAction;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class UpdateAcc extends JPanel {
	private JTextField tusername;
	private final Action action = new SwingAction();
	public GeneralAdmin user;
	public JPanel panel_1; 
	public JPanel panel_2;
	
	public static JPanel pUresident;
	/**
	 * Create the panel.
	 */
	public UpdateAcc(GeneralAdmin A) {
		setBounds(0,0,593,498);
		
		user=A;
		setLayout(null);
		
		panel_2 = new JPanel();
		
		panel_2.setBounds(10, 15, 558, 459);
		add(panel_2);
		JLabel lblNewLabel_2 = new JLabel("UPDATE ACCOUNT (username)");
		panel_2.add(lblNewLabel_2);
		tusername = new JTextField();
		panel_2.add(tusername);
		tusername.setText("");
		tusername.setColumns(10);
		
		JButton btnNewButton = new JButton("submit");
		panel_2.add(btnNewButton);
		btnNewButton.setAction(action);
		
		
		
	
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(460, 127, -209, -112);
		add(lblNewLabel_1);
		
		
		
		
		
		
		
		
		
		for (int i = 0; i < users.size();i++) { 
		JLabel lblNewLabel = new JLabel(users.get(i)+"\n");
		lblNewLabel.setFont(new Font("STHupo", Font.PLAIN, 9));
		lblNewLabel.setForeground(SystemColor.windowText);
		lblNewLabel.setBounds(234, 167, 159, 119);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel_2.add(lblNewLabel);
		}
		
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Submit");
			putValue(SHORT_DESCRIPTION, "Enter username");
		}
		public void actionPerformed(ActionEvent e) {
			String userna =tusername.getText().toString();
			try {
				user.DeleteAcc(userna);
				
				setVisible(false);
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Uframe uframe = new Uframe(user);
			uframe.setVisible(true);
			System.out.println("Accont Updated");
			
		}
		
		
	}
}
