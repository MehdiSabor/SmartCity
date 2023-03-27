package Testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Account.Account;
import Account.GeneralAdmin;
import Account.Resident;

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


import Account.GeneralAdmin;

public class ResMode extends JFrame {

	private JPanel contentPane;
	private JPanel pHomeR;
	private JPanel pTV;
	private JPanel pH;
	private JPanel pAC;
	private JPanel pWM;
	private JPanel pF;
	private JPanel pD;
	private JPanel pChange;
	private JPanel pReport;
	
	private JFrame pGW;
	private JFrame pGWb;
	public static Resident user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResMode frame = new ResMode(user);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void Click(JPanel panel) {
		pHomeR.setVisible(false);
		pTV.setVisible(false);
		pH.setVisible(false);
		pAC.setVisible(false);
		pWM.setVisible(false);
		pF.setVisible(false);
		pD.setVisible(false);
		pChange.setVisible(false);
		pReport.setVisible(false);
		
		panel.setVisible(true);
	}
	/**
	 * Create the frame.
	 */
	public ResMode(Resident R)throws IOException {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 535);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		user =R;
		pHomeR =new HomeR(R);
		pTV = new TV(R);
		pH = new H(R);
		pAC = new AC(R);
		pWM = new WM(R);
		pF = new F(R);
		pD = new D(R);
		pReport = new pReport(R);
		pChange = new pChange(R);
		pGW = new ViewData();
		pGWb = new ViewDataB();
		JPanel Menu = new JPanel();
		Menu.setBounds(0, 10, 191, 484);
		contentPane.add(Menu);
		Menu.setLayout(null);
		
		JButton bAddResident = new JButton("Home");
		bAddResident.addActionListener(
						  new ActionListener() {
						    public void actionPerformed(ActionEvent e) {
						      Click(pHomeR);
						    }
						  }
						);
		bAddResident.setBounds(10, 10, 171, 40);
		Menu.add(bAddResident);
		
		JButton bDeleteR = new JButton("Television");
		bDeleteR.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				      Click(pTV);
				    }
				  }
				);
		bDeleteR.setBounds(10, 60, 171, 40);
		Menu.add(bDeleteR);
		
		JButton updateR = new JButton("Heater");
		updateR.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pH);
				    }
				  }
				)
		;
		updateR.setBounds(10, 110, 171, 40);
		Menu.add(updateR);
		
		JButton badds = new JButton("AC");
		badds.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pAC);
				    }
				  }
				);
		badds.setBounds(10, 160, 171, 40);
		Menu.add(badds);
		
		JButton baddb = new JButton("Waching Machine");
		baddb.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pWM);
				    }
				  }
				);
		baddb.setBounds(10, 210, 171, 40);
		Menu.add(baddb);
		
		JButton badda = new JButton("Fridge");
		badda.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pF);
				    }
				  }
				);
		badda.setBounds(10, 260, 171, 40);
		Menu.add(badda);
		
		JButton bGW = new JButton("Dryer");
		bGW.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				      Click(pD);
				    }
				  }
				);
		bGW.setBounds(10, 310, 171, 40);
		Menu.add(bGW);
		
		JButton bGWb = new JButton("Change Information");
		bGWb.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				     Click(pChange);
				    }
				  }
				);
		bGWb.setBounds(10, 360, 171, 40);
		Menu.add(bGWb);
		
		JButton btnNewButton = new JButton("Report");
		btnNewButton.addActionListener(
				  new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	
				     Click(pReport);
				    }
				  }
				);
		btnNewButton.setBounds(49, 453, 85, 21);
		Menu.add(btnNewButton);
		
		JPanel Mainpanel = new JPanel();
		Mainpanel.setBounds(201, 0, 593, 498);
		contentPane.add(Mainpanel);
		Mainpanel.setLayout(new BorderLayout(0, 0));
		
		
		Mainpanel.add(pHomeR);
		Mainpanel.add(pTV);
		Mainpanel.add(pH);
		Mainpanel.add(pAC);
		Mainpanel.add(pWM);
		Mainpanel.add(pF);
		Mainpanel.add(pD);
		Mainpanel.add(pChange);
		Mainpanel.add(pReport);
		
		
		pHomeR.setLayout(null);
		pHomeR.setVisible(false);
		pTV.setVisible(false);
		pH.setVisible(false);
		pAC.setVisible(false);
		pWM.setVisible(false);
		pF.setVisible(false);
		pD.setVisible(false);
		pChange.setVisible(false);
		pReport.setVisible(false);
		pHomeR.setVisible(true);
		Click(pHomeR);
				
		
	}
}



