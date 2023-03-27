package Testing;

import static Account.UserArray.users;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

public class ShowAcc extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowAcc frame = new ShowAcc();
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
	public ShowAcc() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 913, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		String txt="";
		for (int i = 0; i < users.size();i++) { 
			txt=users.get(i)+"\n";
			JTextArea lblNewLabel = new JTextArea(txt);
			lblNewLabel.setFont(new Font("STHupo", Font.PLAIN, 9));
			lblNewLabel.setForeground(SystemColor.windowText);
			lblNewLabel.setBounds(234, 167, 159, 119);
			lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			lblNewLabel.setAlignmentY(Component.TOP_ALIGNMENT);
			lblNewLabel.setEditable(false);
			lblNewLabel.setOpaque(false);
			getContentPane().add(lblNewLabel);
			
		
		
		}
	}

}
