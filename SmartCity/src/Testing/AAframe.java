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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Account.GeneralAdmin;
import Smart.Floor;
import Smart.SmartBuilding;
import Smart.SmartStreet;
import Testing.AddResident.SwingAction;

public class AAframe extends JFrame {
	public static GeneralAdmin user;
	private JTextField tusername;
	private JTextField tphone;
	private JTextField tname;
	private JTextField temail;
	private JLabel Dryer;
	private JPanel pHome;
	private JTextField tpassword;
	private JTextField tage;
	private final Action action = new SwingAction();
	private JPanel contentPane;
	private static SmartStreet S;
	private static SmartBuilding B;
	private static Floor F;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AAframe frame = new AAframe(S,B,F);
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
	public AAframe(SmartStreet S,SmartBuilding B, Floor F) {
		setBounds(0,0,593,498);
		
		this.S = S;
		this.B= B;
		this.F=F;
		
		
		JLabel Heater = new JLabel("Heater");
		Heater.setBounds(143, 140, 118, 13);
		
		tpassword = new JTextField();
		tpassword.setBounds(250, 137, 171, 19);
		tpassword.setColumns(10);
		
		temail = new JTextField();
		temail.setBounds(250, 162, 171, 19);
		temail.setColumns(10);
		
		tname = new JTextField();
		tname.setBounds(250, 190, 171, 19);
		tname.setColumns(10);
		
		tphone = new JTextField();
		tphone.setBounds(250, 216, 171, 19);
		tphone.setColumns(10);
		
		tage = new JTextField();
		tage.setBounds(250, 242, 171, 19);
		tage.setColumns(10);
		getContentPane().setLayout(null);
		
		JLabel TV = new JLabel("TV");
		TV.setBounds(143, 111, 120, 13);
		getContentPane().add(TV);
		
		tusername = new JTextField();
		tusername.setBounds(250, 108, 171, 19);
		tusername.setHorizontalAlignment(SwingConstants.CENTER);
		tusername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tusername.setAlignmentX(0.0f);
		tusername.setColumns(10);
		getContentPane().add(tusername);
		getContentPane().add(Heater);
		getContentPane().add(tpassword);
		
		JLabel AC = new JLabel("AC");
		AC.setBounds(146, 165, 96, 13);
		getContentPane().add(AC);
		getContentPane().add(temail);
		
		JLabel WM = new JLabel("Waching Machine");
		WM.setBounds(143, 193, 100, 13);
		getContentPane().add(WM);
		getContentPane().add(tname);
		
		JLabel Fridge = new JLabel("Fridge");
		Fridge.setBounds(143, 219, 102, 13);
		getContentPane().add(Fridge);
		getContentPane().add(tphone);
		
		Dryer = new JLabel("Dryer");
		Dryer.setBounds(143, 245, 92, 13);
		getContentPane().add(Dryer);
		getContentPane().add(tage);
		
		JButton bregister = new JButton("Add Appartment");
		bregister.setAction(action);
		bregister.setBounds(200, 288, 150, 21);
		getContentPane().add(bregister);
		
		
		
		
	}
	public class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "Register Resident");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			boolean TV = Boolean.parseBoolean(tusername.getText().toString());
			boolean Heater =Boolean.parseBoolean(tpassword.getText().toString());
			boolean AC = Boolean.parseBoolean(temail.getText().toString());
			boolean WM =Boolean.parseBoolean(tname.getText().toString());
			boolean Fridge =Boolean.parseBoolean(tphone.getText().toString());
			boolean Dryer =Boolean.parseBoolean(tage.getText().toString());
			
			try {
				
				F.AddAppartment(TV,Heater,AC,WM,Fridge,Dryer);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Appart Added!");
			
			setVisible(false);
			
			
			
			
		}
		
	}
}
