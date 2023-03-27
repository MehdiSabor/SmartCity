package Testing;
import Account.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class GUI implements ActionListener{
	
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton loginButton;
	public static UserArray users;
	public static JFrame frame = new JFrame("SmartCity");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       
       
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();    
       
        frame.add(panel);
        
        placeComponents(panel);

        frame.setVisible(true);
       
    }

    private static void placeComponents(JPanel panel) {

     
        panel.setLayout(null);
      
        
        userLabel = new JLabel("User");
        
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

       
        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

      
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

     
        loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        loginButton.addActionListener(new GUI());
        panel.add(loginButton);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			users = new UserArray();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	 String user = userText.getText();
	 String password = passwordText.getText();
	 if(users.login(user,password)) {System.out.println("Connected");
		Account A =users.ReturnObject();
		
			if(A instanceof GeneralAdmin) {System.out.println("You are in Admin Mode");
				
			AdminMode Aframe;
			try {
				Aframe = new AdminMode((GeneralAdmin)A);
				Aframe.setVisible(true);
				 frame.setVisible(false);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			}
			
			
			
			
			else {System.out.println("You are in Resident Mode");	
			ResMode Aframe;
			try {
				Aframe = new ResMode((Resident)A);
				Aframe.setVisible(true);
				 frame.setVisible(false);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(A);
			}
			
			}
	 else JOptionPane.showMessageDialog(new JFrame(), "Invalid","Error",JOptionPane.ERROR_MESSAGE);
	 }}


