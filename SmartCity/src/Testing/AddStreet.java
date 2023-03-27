package Testing;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Account.GeneralAdmin;
import Smart.*;
import Testing.AddResident.SwingAction;
import javax.swing.JPanel;

public class AddStreet extends JPanel {
	public static GeneralAdmin user;
	private JTextField tSname;
	private JPanel pHome;
	private JTextField tSid;
	private final Action action = new SwingAction();
	public static StreetArray Arr;

	/**
	 * Create the panel.
	 * @throws IOException 
	 */
	public AddStreet(GeneralAdmin A) throws IOException  {
		setBounds(0,0,593,498);
		user =A;
		Arr =new StreetArray();
		setVisible(true);
		JLabel lpassword = new JLabel("ID");
		lpassword.setBounds(143, 140, 118, 13);
		
		tSid = new JTextField();
		tSid.setBounds(250, 137, 171, 19);
		tSid.setColumns(10);
		setLayout(null);
		
		JLabel lusername = new JLabel("StreetName");
		lusername.setBounds(143, 111, 120, 13);
		add(lusername);
		
		tSname = new JTextField();
		tSname.setBounds(250, 108, 171, 19);
		tSname.setHorizontalAlignment(SwingConstants.CENTER);
		tSname.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tSname.setAlignmentX(0.0f);
		tSname.setColumns(10);
		add(tSname);
		add(lpassword);
		add(tSid);
		
		JButton bregister = new JButton("Add Street");
		bregister.setAction(action);
		bregister.setBounds(218, 179, 150, 21);
		add(bregister);
		
		pHome = new Home(A);
		
		
	}
	public class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "Add Street");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			String Sname =tSname.getText().toString();
			int Sid =Integer.parseInt(tSid.getText().toString());
			
			for(SmartStreet i:Arr.City) {
				if(Sid!=i.getID())
			try {
				Arr.AddStreet(Sname,Sid);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				else JOptionPane.showMessageDialog(new JFrame(), "Invalid","Error",JOptionPane.ERROR_MESSAGE);
			System.out.println("Street Added!");
			
			setVisible(false);
			pHome.setVisible(true);
			
			
			
		}
		
	}
}}

