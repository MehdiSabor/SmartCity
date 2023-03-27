package Testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Smart.SmartStreet;
import Smart.StreetArray;

import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class ViewData extends JFrame {

	private JPanel contentPane;
	private static StreetArray Arr;
	private JTextField textField;
	private final Action action = new SwingAction();
	public StreetData Streetdata;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewData frame = new ViewData();
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
	public ViewData() throws IOException {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0,0,830,703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Street ID");
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		contentPane.add(btnNewButton);
		Arr = new StreetArray();
		for(SmartStreet i:Arr.City) {
		JLabel lblNewLabel = new JLabel("\n"+i.Show());
		lblNewLabel.revalidate();
		lblNewLabel.validate();
		lblNewLabel.repaint();
		contentPane.add(lblNewLabel);}
	}
	public class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Submit");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			int sid=Integer.parseInt(textField.getText().toString());
			for(SmartStreet i:Arr.City) {
				if(i.getID()==sid) { 
					
					try {
						Streetdata= new StreetData(i);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Streetdata.setVisible(true);}
			}
			
			
		}
		
	}
}
