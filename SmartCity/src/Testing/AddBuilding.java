package Testing;
import Smart.*;
import Testing.AddStreet.SwingAction;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Account.GeneralAdmin;

public class AddBuilding extends JPanel {

	public static GeneralAdmin user;
	private JPanel pHome;
	private JTextField tSid;
	private final Action action = new SwingAction();
	public static StreetArray Arr;
public ABframe Abframe;
	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public AddBuilding(GeneralAdmin A) throws IOException  {
		setBounds(0,0,593,498);
		user =A;
		Arr =new StreetArray();
		setVisible(true);
		JLabel StreedID = new JLabel("Street ID");
		StreedID.setBounds(143, 140, 118, 13);
		
		tSid = new JTextField();
		tSid.setBounds(250, 137, 171, 19);
		tSid.setColumns(10);
		setLayout(null);
		add(StreedID);
		add(tSid);
		
		JButton bregister = new JButton("Add Building");
		bregister.setAction(action);
		bregister.setBounds(218, 179, 150, 21);
		add(bregister);
		
		pHome = new Home(A);
		
		
	}
	public class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "Select Street");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			int Sid =Integer.parseInt(tSid.getText().toString());
			
			for(SmartStreet i:Arr.City) {
				if(i.getID()==Sid) { 
					Abframe= new ABframe(i);
					Abframe.setVisible(true);}
			}
			
			
			
			setVisible(false);
			pHome.setVisible(true);
			
			
			
		}
		
	}
}
