package se.lu.ics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;

public class ApplicationWs extends JFrame {

	private JPanel contentPane;

	
	public ApplicationWs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 617, 379);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("View", null, panel, null);
		panel.setLayout(null);
		
		JComboBox comboBoxViewAllInfo = new JComboBox();
		comboBoxViewAllInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxViewAllInfo.setBounds(198, 228, 167, 22);
		panel.add(comboBoxViewAllInfo);
		
		JButton btnSelectAllws = new JButton("SELECT");
		btnSelectAllws.setBounds(239, 294, 89, 23);
		panel.add(btnSelectAllws);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
	}
}
