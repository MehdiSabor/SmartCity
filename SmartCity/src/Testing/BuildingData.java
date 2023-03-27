package Testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import Smart.Floor;
import Smart.SmartBuilding;
import Smart.SmartStreet;
import Smart.StreetArray;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class BuildingData extends JFrame {

	private JPanel contentPane;
	private static StreetArray Arr;

	public static SmartStreet street;
	public static SmartBuilding build;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildingData frame = new BuildingData(build);
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
	public BuildingData(SmartBuilding B) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0,0,1121,703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		JLabel lblNewLabel = new JLabel(B.Show()+" ");
		lblNewLabel.setBounds(86, 29, 601, 13);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 52, 1112, 718);
		getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		for(Floor i:B.F) {
			String Line=i.Show();
		JTextArea lblNewLabel_1 = new JTextArea("\n"+Line);
		lblNewLabel_1.setEditable(false);
		lblNewLabel_1.setOpaque(false);
		panel.add(lblNewLabel_1);
	}}
}
