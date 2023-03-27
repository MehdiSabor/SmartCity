package Testing;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Account.GeneralAdmin;
import Smart.Floor;
import Smart.SmartBuilding;
import Smart.SmartStreet;
import Smart.StreetArray;
import Testing.AddResident.SwingAction;

public class AddAppart extends JPanel {
	public static GeneralAdmin user;
	private JTextField tusername;
	private JTextField temail;
	private JPanel pHome;
	private JTextField tpassword;
	public static StreetArray Arr;
	private final Action action = new SwingAction();
	public AAframe Aaframe;
	/**
	 * Create the panel.
	 */
	public AddAppart(GeneralAdmin A) {
		setBounds(0,0,593,498);
		user = A;
		pHome = new Home(A);
		JLabel BuildingID = new JLabel("BuildingID");
		BuildingID.setBounds(151, 228, 118, 13);
		
		tpassword = new JTextField();
		tpassword.setBounds(258, 225, 171, 19);
		tpassword.setColumns(10);
		
		temail = new JTextField();
		temail.setBounds(258, 250, 171, 19);
		temail.setColumns(10);
		setLayout(null);
		
		JLabel StreetID = new JLabel("StreetID");
		StreetID.setBounds(151, 199, 120, 13);
		add(StreetID);
		
		tusername = new JTextField();
		tusername.setBounds(258, 196, 171, 19);
		tusername.setHorizontalAlignment(SwingConstants.CENTER);
		tusername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tusername.setAlignmentX(0.0f);
		tusername.setColumns(10);
		add(tusername);
		add(BuildingID);
		add(tpassword);
		
		JLabel FloorNum = new JLabel("Floor Number");
		FloorNum.setBounds(154, 253, 96, 13);
		add(FloorNum);
		add(temail);
		
		JButton bregister = new JButton("Add Appartement");
		bregister.setAction(action);
		bregister.setBounds(218, 279, 150, 21);
		add(bregister);
		
		pHome = new Home(A);
		
		
	}
	public class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "Register Resident");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			int StreetID =Integer.parseInt(tusername.getText().toString());
			int BID =Integer.parseInt(tpassword.getText().toString());
			int Fnum = Integer.parseInt(temail.getText().toString());
				
			for(SmartStreet i:Arr.City) {
				if(i.getID()==StreetID ) {
					for(SmartBuilding k:i.buildings) {
						if(k.getID()==BID) {
							for(Floor f:k.F) {
								if(f.getNumber()==Fnum) {
									Aaframe=new AAframe(i,k,f);
									Aaframe.setVisible(true);
								}
							}
						}
					}
				}
					
			}
			
			
			System.out.println("Resident Created!");
			
			setVisible(false);
			pHome.setVisible(true);
			
			
			
		}
		
	}
}
