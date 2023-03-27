package Testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Smart.SmartBuilding;
import Smart.SmartStreet;
import Smart.StreetArray;
import Testing.ViewData.SwingAction;

public class StreetData extends JFrame {

	
	private JPanel contentPane;
	private static StreetArray Arr;
	private final Action action = new SwingAction();
	public static SmartStreet street;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StreetData frame = new StreetData(street);
					frame.setVisible(true);
					frame.setResizable(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public StreetData(SmartStreet S) throws IOException {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0,0,830,703);
		street=S;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		Arr = new StreetArray();
		JLabel lblNewLabel = new JLabel("\n"+S.Show());
		contentPane.add(lblNewLabel);
		for(SmartBuilding i:S.buildings) {
		JLabel lbl1NewLabel = new JLabel("\n"+i.Show());
		contentPane.add(lbl1NewLabel);}
	}
	public class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Submit");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			
			
			
			
		}
		
	}
}