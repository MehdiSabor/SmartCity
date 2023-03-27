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
import Testing.Uframe.SwingAction;

public class Uframe extends JFrame {
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static GeneralAdmin user;
	private JTextField tusername;
	private JTextField tphone;
	private JTextField tname;
	private JTextField tprofession;
	private JTextField temail;
	private JLabel laddress;
	private JLabel lbuild;
	private JLabel lapp;
	private JLabel lage;
	private JPanel pHome;
	private JLabel lprofession;
	private JTextField taddress;
	private JTextField tpassword;
	private JTextField tage;
	
	private final Action action = new SwingAction();
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uframe frame = new Uframe(user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public Uframe(GeneralAdmin A) {
		setBounds(0,0,593,498);
		user = A;
		pHome = new Home(A);
		JLabel lpassword = new JLabel("Password");
		lpassword.setBounds(143, 92, 118, 13);
		
		tpassword = new JTextField();
		tpassword.setBounds(250, 89, 171, 19);
		tpassword.setColumns(10);
		
		temail = new JTextField();
		temail.setBounds(250, 114, 171, 19);
		temail.setColumns(10);
		
		tname = new JTextField();
		tname.setBounds(250, 142, 171, 19);
		tname.setColumns(10);
		
		tphone = new JTextField();
		tphone.setBounds(250, 168, 171, 19);
		tphone.setColumns(10);
		
		tage = new JTextField();
		tage.setBounds(250, 194, 171, 19);
		tage.setColumns(10);
		
		tprofession = new JTextField();
		tprofession.setBounds(250, 220, 171, 19);
		tprofession.setColumns(10);
		
		taddress = new JTextField();
		taddress.setBounds(250, 246, 171, 19);
		taddress.setColumns(10);
		getContentPane().setLayout(null);
		
		JLabel lusername = new JLabel("Username");
		lusername.setBounds(143, 63, 120, 13);
		getContentPane().add(lusername);
		
		tusername = new JTextField();
		tusername.setBounds(250, 60, 171, 19);
		tusername.setHorizontalAlignment(SwingConstants.CENTER);
		tusername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tusername.setAlignmentX(0.0f);
		tusername.setColumns(10);
		getContentPane().add(tusername);
		getContentPane().add(lpassword);
		getContentPane().add(tpassword);
		
		JLabel lemail = new JLabel("Email");
		lemail.setBounds(146, 117, 96, 13);
		getContentPane().add(lemail);
		getContentPane().add(temail);
		
		JLabel lname = new JLabel("Name");
		lname.setBounds(143, 145, 100, 13);
		getContentPane().add(lname);
		getContentPane().add(tname);
		
		JLabel lphone = new JLabel("Phone");
		lphone.setBounds(143, 171, 102, 13);
		getContentPane().add(lphone);
		getContentPane().add(tphone);
		
		lage = new JLabel("Age");
		lage.setBounds(143, 197, 92, 13);
		getContentPane().add(lage);
		getContentPane().add(tage);
		
		lprofession = new JLabel("Profession");
		lprofession.setBounds(143, 223, 121, 13);
		getContentPane().add(lprofession);
		getContentPane().add(tprofession);
		
		laddress = new JLabel("StreetID");
		laddress.setBounds(143, 249, 111, 13);
		getContentPane().add(laddress);
		getContentPane().add(taddress);
		
		lbuild = new JLabel("BuildingID");
		lbuild.setBounds(143, 317, 111, 13);
		getContentPane().add(laddress);
		getContentPane().add(taddress);
		
		lapp = new JLabel("AppartmentID");
		lapp.setBounds(143, 337, 111, 13);
		getContentPane().add(laddress);
		getContentPane().add(taddress);
		
		
		
		JButton bregister = new JButton("Update Resident");
		bregister.setAction(action);
		bregister.setBounds(207, 356, 150, 21);
		getContentPane().add(bregister);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(250, 272, 171, 19);
		getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(250, 297, 171, 19);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel("BuildingID");
		lblNewLabel.setBounds(143, 275, 99, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AppartmentID");
		lblNewLabel_1.setBounds(143, 300, 92, 13);
		getContentPane().add(lblNewLabel_1);
		
		pHome = new Home(A);
		
		
	}
	public class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "Resigester Resident");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			String username =tusername.getText().toString();
			String password =tpassword.getText().toString();
			String email = temail.getText().toString();
			String name =tname.getText().toString();
			String phone =tphone.getText().toString();
			String age =tage.getText().toString();
			String profession=tprofession.getText().toString();
			int adress = Integer.parseInt(taddress.getText().toString());
			int build = Integer.parseInt(textField.getText().toString());
			int app = Integer.parseInt(textField_1.getText().toString());
			
			try {
				user.CreateResident(username,password,email,name,phone,age,profession,adress,build,app);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Resident Updated!");
			
			setVisible(false);
			pHome.setVisible(true);
			
			
			
		}
		
	}	
}