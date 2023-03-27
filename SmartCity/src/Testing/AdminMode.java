package Testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Account.Account;
import Account.GeneralAdmin;


import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;

public class AdminMode extends JFrame{

	private JPanel contentPane;
	private JPanel pHome;
	private JPanel pAddResident;
	private JPanel pDeleteR;
	private JPanel pUpdateR;
	private JPanel pAddStreet;
	private JPanel pAddBuilding;
	private JPanel pAddAppart;
	private JFrame pAcc;
	
	private JFrame pGW;
	private JFrame pGWb;
	public static GeneralAdmin user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMode frame = new AdminMode(user);
					frame.setResizable(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void Click(JPanel panel) {
		pHome.setVisible(false);
		pAddResident.setVisible(false);
		pDeleteR.setVisible(false);
		pUpdateR.setVisible(false);
		pAddStreet.setVisible(false);
		pAddBuilding.setVisible(false);
		pAddAppart.setVisible(false);
		
		panel.setVisible(true);
	}
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	
	public AdminMode(GeneralAdmin A) throws IOException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user =A;
		pHome =new Home(A);
		pAddResident = new AddResident(A);
		pDeleteR = new DeleteAcc(A);
		pUpdateR = new UpdateAcc(A);
		pAddStreet = new AddStreet(A);
		pAddBuilding = new AddBuilding(A);
		pAddAppart = new AddAppart(A);
		pGW = new ViewData();
		pGWb = new ViewDataB();
		pAcc=new ShowAcc();
		JPanel Menu = new JPanel();
		Menu.setBounds(0, 10, 191, 484);
		contentPane.add(Menu);
		Menu.setLayout(null);
		
		JButton bAddResident = new JButton("Add Resident");
		bAddResident.addActionListener(
						  new ActionListener() {
						    public void actionPerformed(ActionEvent e) {
						      Click(pAddResident);
						    }
						  }
						);
		bAddResident.setBounds(10, 10, 171, 40);
		Menu.add(bAddResident);
		
		JButton bDeleteR = new JButton("Delete Resident");
		bDeleteR.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				      Click(pDeleteR);
				    }
				  }
				);
		bDeleteR.setBounds(10, 60, 171, 40);
		Menu.add(bDeleteR);
		
		JButton updateR = new JButton("Update Resident");
		updateR.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pUpdateR);
				    }
				  }
				)
		;
		updateR.setBounds(10, 110, 171, 40);
		Menu.add(updateR);
		
		JButton badds = new JButton("Add Street");
		badds.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pAddStreet);
				    }
				  }
				);
		badds.setBounds(10, 160, 171, 40);
		Menu.add(badds);
		
		JButton baddb = new JButton("Add Building");
		baddb.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pAddBuilding);
				    }
				  }
				);
		baddb.setBounds(10, 210, 171, 40);
		Menu.add(baddb);
		
		JButton badda = new JButton("Add Appartment");
		badda.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pAddAppart);
				    }
				  }
				);
		badda.setBounds(10, 260, 171, 40);
		Menu.add(badda);
		
		JButton bGW = new JButton("View Data GateWay Street");
		bGW.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      pGW.setVisible(true);
				    }
				  }
				);
		bGW.setBounds(10, 310, 171, 40);
		Menu.add(bGW);
		
		JButton bGWb = new JButton("View Data Building");
		bGWb.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      pGWb.setVisible(true);
				    }
				  }
				);
		bGWb.setBounds(10, 360, 171, 40);
		Menu.add(bGWb);
		
		JButton Acc = new JButton("Accounts");
		Acc.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      pAcc.setVisible(true);
				    }
				  }
				);
		Acc.setBounds(50, 453, 85, 21);
		Menu.add(Acc);
		
		JPanel Mainpanel = new JPanel();
		Mainpanel.setBounds(201, 0, 593, 498);
		contentPane.add(Mainpanel);
		Mainpanel.setLayout(new BorderLayout(0, 0));
		
		
		Mainpanel.add(pHome);
		Mainpanel.add(pAddResident);
		Mainpanel.add(pDeleteR);
		Mainpanel.add(pUpdateR);
		Mainpanel.add(pAddStreet);
		Mainpanel.add(pAddBuilding);
		Mainpanel.add(pAddAppart);
	
		
		
		pAddResident.setLayout(null);
		pAddResident.setVisible(false);
		pDeleteR.setVisible(false);
		pUpdateR.setVisible(false);
		pAddStreet.setVisible(false);
		pAddBuilding.setVisible(false);
		pAddAppart.setVisible(false);
		pGW.setVisible(false);
		pGWb.setVisible(false);
		pAcc.setVisible(false);
		pHome.setVisible(true);
		Click(pHome);
				
		
	}
}
