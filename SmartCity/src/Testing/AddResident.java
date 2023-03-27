package Testing;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import Account.Account;
import Account.GeneralAdmin;

import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.Action;

public class AddResident extends JPanel {
	public static GeneralAdmin user;
	private JTextField tusername;
	private JTextField tphone;
	private JTextField tname;
	private JTextField tprofession;
	private JTextField temail;
	private JLabel lage;
	private JPanel pHome;
	private JLabel lprofession;
	private JTextField tpassword;
	private JTextField tage;
	private final Action action = new SwingAction();
	private JTextField tid;
	private JLabel newla;
	private JTextField bid;
	private JLabel lblNewLabel;
	private JTextField aid;

	/**
	 * Create the panel.
	 */
	public AddResident(GeneralAdmin A) {
		setBounds(0,0,593,498);
		user = A;
		pHome = new Home(A);
		JLabel lpassword = new JLabel("Password");
		lpassword.setBounds(143, 86, 118, 13);
		
		tpassword = new JTextField();
		tpassword.setBounds(250, 83, 171, 19);
		tpassword.setColumns(10);
		
		temail = new JTextField();
		temail.setBounds(250, 108, 171, 19);
		temail.setColumns(10);
		
		tname = new JTextField();
		tname.setBounds(250, 136, 171, 19);
		tname.setColumns(10);
		
		tphone = new JTextField();
		tphone.setBounds(250, 162, 171, 19);
		tphone.setColumns(10);
		
		tage = new JTextField();
		tage.setBounds(250, 188, 171, 19);
		tage.setColumns(10);
		
		tprofession = new JTextField();
		tprofession.setBounds(250, 214, 171, 19);
		tprofession.setColumns(10);
		setLayout(null);
		
		JLabel lusername = new JLabel("Username");
		lusername.setBounds(143, 57, 120, 13);
		add(lusername);
		
		tusername = new JTextField();
		tusername.setBounds(250, 54, 171, 19);
		tusername.setHorizontalAlignment(SwingConstants.CENTER);
		tusername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		tusername.setAlignmentX(0.0f);
		tusername.setColumns(10);
		add(tusername);
		add(lpassword);
		add(tpassword);
		
		JLabel lemail = new JLabel("Email");
		lemail.setBounds(146, 111, 96, 13);
		add(lemail);
		add(temail);
		
		JLabel lname = new JLabel("Name");
		lname.setBounds(143, 139, 100, 13);
		add(lname);
		add(tname);
		
		JLabel lphone = new JLabel("Phone");
		lphone.setBounds(143, 165, 102, 13);
		add(lphone);
		add(tphone);
		
		lage = new JLabel("Age");
		lage.setBounds(143, 191, 92, 13);
		add(lage);
		add(tage);
		
		lprofession = new JLabel("Profession");
		lprofession.setBounds(143, 217, 121, 13);
		add(lprofession);
		add(tprofession);
		
		JButton bregister = new JButton("Register Resident");
		bregister.setAction(action);
		bregister.setBounds(208, 386, 150, 21);
		add(bregister);
		
		JLabel lid = new JLabel("Street ID");
		lid.setBounds(143, 249, 45, 13);
		add(lid);
		
		tid = new JTextField();
		tid.setBounds(250, 246, 171, 19);
		add(tid);
		tid.setColumns(10);
		
		newla = new JLabel("Building ID");
		newla.setBounds(143, 282, 65, 13);
		add(newla);
		
		bid = new JTextField();
		bid.setBounds(250, 279, 171, 19);
		add(bid);
		bid.setColumns(10);
		
		lblNewLabel = new JLabel("Appart ID");
		lblNewLabel.setBounds(143, 319, 65, 13);
		add(lblNewLabel);
		
		aid = new JTextField();
		aid.setBounds(250, 316, 171, 19);
		add(aid);
		aid.setColumns(10);
		
		pHome = new Home(A);
		
		
	}
	public class SwingAction extends AbstractAction {
		
		public SwingAction() {
			putValue(NAME, "Register Resident");
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
			
			int Sid= Integer.parseInt(tid.getText().toString());
			int Bid = Integer.parseInt(bid.getText().toString());
			int Aid =Integer.parseInt(aid.getText().toString());
			
			try {
				user.CreateResident(username,password,email,name,phone,age,profession,Sid,Bid,Aid);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Resident Created!");
			
			setVisible(false);
			pHome.setVisible(true);
			
			
			
		}
		
	}
}
