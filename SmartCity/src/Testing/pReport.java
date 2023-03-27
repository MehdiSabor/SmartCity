package Testing;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import Account.Resident;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class pReport extends JPanel {
	private final Action action = new SwingAction();
	public static Resident user;
	public JTextPane textPane;
	/**
	 * Create the panel.
	 */
	public pReport(Resident R) {
		setBounds(0,0,593,498);
		setLayout(null);
		user =R;
		
		JButton btnNewButton = new JButton("Report");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(448, 436, 85, 21);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Enter your complaint:");
		lblNewLabel.setBounds(67, 67, 118, 13);
		add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(67, 100, 456, 207);
		add(textPane);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Report");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			String str = textPane.getText().toString();
			setVisible(false);
			user.Report(str);
		}
	}
}
