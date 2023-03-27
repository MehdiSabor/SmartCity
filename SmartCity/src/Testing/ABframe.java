package Testing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
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
import javax.swing.border.EmptyBorder;

import Account.GeneralAdmin;
import Smart.SmartBuilding;
import Smart.SmartStreet;
import Testing.Uframe.SwingAction;

public class ABframe extends JFrame {

	private JPanel contentPane;
	public static GeneralAdmin user;
	private JTextField tusername;
	private JTextField tphone;
	private JTextField tresident;
	private JTextField ttype;
	private JPanel pHome;
	private JTextField numF;
	private final Action action = new SwingAction();
	public static SmartStreet S;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ABframe frame = new ABframe(S);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ABframe(SmartStreet S) {
		setBounds(0,0,593,498);
		this.S=S;
		JLabel numFloor = new JLabel("Number of Floor");
		numFloor.setBounds(143, 140, 118, 13);
		
		numF = new JTextField();
		numF.setBounds(250, 137, 171, 19);
		numF.setColumns(10);
		
		ttype = new JTextField();
		ttype.setBounds(250, 162, 171, 19);
		ttype.setColumns(10);
		
		tresident = new JTextField();
		tresident.setBounds(250, 190, 171, 19);
		tresident.setColumns(10);
		
		tphone = new JTextField();
		tphone.setBounds(250, 216, 171, 19);
		tphone.setColumns(10);
		getContentPane().setLayout(null);
		
		JLabel BuildingID = new JLabel("BuildingID");
		BuildingID.setBounds(143, 111, 120, 13);
		getContentPane().add(BuildingID);
		
		tusername = new JTextField();
		tusername.setBounds(250, 108, 171, 19);
		tusername.setHorizontalAlignment(SwingConstants.CENTER);
		tusername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tusername.setAlignmentX(0.0f);
		tusername.setColumns(10);
		getContentPane().add(tusername);
		getContentPane().add(numFloor);
		getContentPane().add(numF);
		
		JLabel bType = new JLabel("Building Type");
		bType.setBounds(146, 165, 96, 13);
		getContentPane().add(bType);
		getContentPane().add(ttype);
		
		JLabel bResident = new JLabel("number of Resident");
		bResident.setBounds(143, 193, 100, 13);
		getContentPane().add(bResident);
		getContentPane().add(tresident);
		
		JLabel lphone = new JLabel("Building Street");
		lphone.setBounds(143, 219, 102, 13);
		getContentPane().add(lphone);
		getContentPane().add(tphone);
		
		JButton bregister = new JButton("Add Building");
		bregister.setAction(action);
		bregister.setBounds(210, 242, 150, 21);
		getContentPane().add(bregister);
		
		
		
		
	}
	public class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "Resigester Resident");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			int BuildingID = Integer.parseInt(tusername.getText().toString());
			int bnumFloor =  Integer.parseInt(numF.getText().toString());
			String bType = ttype.getText().toString();
			
			int bnumR = Integer.parseInt(tresident.getText().toString());
			String bStreet =tphone.getText().toString();
			for(SmartBuilding i:S.buildings) {
			if(BuildingID!=i.getID())
try {
				S.AddBuilding(BuildingID,bType,bStreet,bnumR,bnumFloor);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
			else JOptionPane.showMessageDialog(new JFrame(), "Invalid","Error",JOptionPane.ERROR_MESSAGE);
			
			}
			
			System.out.println("Building Added!");
			
			setVisible(false);
			
			
			
			
		}
		
	}

}
