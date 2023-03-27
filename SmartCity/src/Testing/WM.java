package Testing;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Account.Resident;
import Smart.Appartment;
import Smart.StreetArray;
import Testing.H.SwingAction;
import Testing.H.SwingAction_1;

public class WM extends JPanel  {
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private static Resident user;
	private static Appartment a;
	private StreetArray Arr;
	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public WM(Resident R) throws IOException {
setBounds(0,0,593,498);
		user=R;
		
		a=R.getAppart();
		Arr=new StreetArray();
		setVisible(true);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Change Avaibility");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(122, 216, 154, 45);
		add(btnNewButton);
		
		JButton btnChangeState = new JButton("Change State");
		btnChangeState.setAction(action_1);
		btnChangeState.setBounds(299, 216, 154, 45);
		add(btnChangeState);
		
		JTextArea textArea = new JTextArea("Waching Machine");
		textArea.setBounds(209, 155, 164, 22);
		textArea.setEditable(false);
		textArea.setOpaque(false);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea("Avaibility: "+Boolean.toString(R.getAppart().Appliances[3].isAvailable));
		textArea_1.setBounds(122, 187, 154, 22);
		add(textArea_1);
		
		
		JTextArea textArea_2 = new JTextArea("Working: "+ Boolean.toString(R.getAppart().Appliances[3].isWorking));
		textArea_2.setBounds(299, 187, 154, 22);
		add(textArea_2);
		
	}
	public class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Change Avalability");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			user.getAppart().Appliances[3].setAvailable(!(a.Appliances[3].isAvailable));
			try {
				Arr.fileupdate();
				System.out.println((a.Appliances[3].isWorking));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println((a.Appliances[3].isAvailable));
		}
	}
	public class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Change State");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			user.getAppart().Appliances[3].setWorking(!(a.Appliances[3].isWorking));
			try {
				Arr.fileupdate();
				System.out.println((a.Appliances[3].isWorking));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
}
