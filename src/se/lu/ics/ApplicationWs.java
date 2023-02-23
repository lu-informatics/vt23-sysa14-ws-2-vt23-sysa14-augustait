package se.lu.ics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;

public class ApplicationWs extends JFrame {

	
	private JFrame testFrame;
	private JTabbedPane tabbedPane;
	private JPanel panelView; 
	private JPanel panelFind;
	private JButton btnSelectAll;
	private JComboBox comboBoxViewAll;
	private JTextArea textAreaViewAll;
	private ControllerWS controllerWS;
	private JLabel lblNewLabel;
	private JTextField textFieldFind;
	private JButton btnSelectFind;
	private JComboBox comboBoxFind;
	private JTextArea textAreaFind;
	private JLabel lblNewLabel_1;
	
	

	

	public ApplicationWs() {
		
		initialize();
	}
	
	public void initialize() {
		testFrame = new JFrame();
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFrame.setBounds(100, 100, 633, 418);
		testFrame.getContentPane().setLayout(null);
		testFrame.setVisible(true);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 617, 379);
		testFrame.getContentPane().add(tabbedPane);
		
		panelView = new JPanel();
		tabbedPane.addTab("View", null, panelView, null);
		panelView.setLayout(null);
		
		btnSelectAll = new JButton("SELECT");
		btnSelectAll.setBounds(224, 317, 89, 23);
		panelView.add(btnSelectAll);
		
		comboBoxViewAll = new JComboBox();
		comboBoxViewAll.setBounds(202, 284, 131, 22);
		panelView.add(comboBoxViewAll);
		
		textAreaViewAll = new JTextArea();
		JScrollPane scrollPaneView = new JScrollPane(textAreaViewAll);
		scrollPaneView.setBounds(10, 81, 592, 169);
		panelView.add(scrollPaneView);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(58, 0, 185, 79);
		panelView.add(lblImage);
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\vmNanna\\Downloads\\Images\\ICA.png");
		Image image = imageIcon.getImage();
		Image resizedImage = image.getScaledInstance(180, 90, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		lblImage.setIcon(resizedIcon);
		
		lblNewLabel = new JLabel("Supermarket Server Manager");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBackground(new Color(0, 128, 192));
		lblNewLabel.setBounds(242, 11, 295, 59);
		panelView.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Select a web service method to call");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(169, 261, 215, 14);
		panelView.add(lblNewLabel_1);
		
		panelFind = new JPanel();
		tabbedPane.addTab("Find", null, panelFind, null);
		panelFind.setLayout(null);
		
		textAreaFind = new JTextArea();
		JScrollPane scrollPaneFind = new JScrollPane(textAreaFind);
		scrollPaneFind.setBounds(10, 34, 590, 167); // set the bounds of the scroll pane
		panelFind.add(scrollPaneFind);
		
		comboBoxFind = new JComboBox();
		comboBoxFind.setBounds(152, 228, 269, 22);
		panelFind.add(comboBoxFind);
		
		btnSelectFind = new JButton("SELECT");
		btnSelectFind.setBounds(243, 317, 89, 23);
		panelFind.add(btnSelectFind);
		
		textFieldFind = new JTextField();
		textFieldFind.setBounds(182, 286, 208, 20);
		panelFind.add(textFieldFind);
		textFieldFind.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Select a web method to call");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(208, 212, 171, 14);
		panelFind.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter a Order ID, Customer ID or Product ID");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(162, 261, 259, 14);
		panelFind.add(lblNewLabel_3);
	}

	public JTextField getTextFieldFind() {
		return textFieldFind;
	}

	public void setTextFieldFind(JTextField textFieldFind) {
		this.textFieldFind = textFieldFind;
	}
	public JButton getBtnSelectFind() {
		return btnSelectFind;
	}

	public void setBtnSelectFind(JButton btnSelectFind) {
		this.btnSelectFind = btnSelectFind;
	}

	public JComboBox getComboBoxFind() {
		return comboBoxFind;
	}

	public void setComboBoxFind(JComboBox comboBoxFind) {
		this.comboBoxFind = comboBoxFind;
	}

	public JTextArea getTextAreaFind() {
		return textAreaFind;
	}

	public void setTextAreaFind(JTextArea textAreaFind) {
		this.textAreaFind = textAreaFind;
	}
	
	public JFrame getTestFrame() {
		return testFrame;
	}

	public void setTestFrame(JFrame testFrame) {
		this.testFrame = testFrame;
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public JPanel getPanelView() {
		return panelView;
	}

	public void setPanelView(JPanel panelView) {
		this.panelView = panelView;
	}

	public JPanel getPanelFind() {
		return panelFind;
	}

	public void setPanelFind(JPanel panelFind) {
		this.panelFind = panelFind;
	}

	public JButton getBtnSelectAll() {
		return btnSelectAll;
	}

	public void setBtnSelectAll(JButton btnSelectAll) {
		this.btnSelectAll = btnSelectAll;
	}

	public JComboBox getComboBoxViewAll() {
		return comboBoxViewAll;
	}

	public void setComboBoxViewAll(JComboBox comboBoxViewAll) {
		this.comboBoxViewAll = comboBoxViewAll;
	}

	public JTextArea getTextAreaViewAll() {
		return textAreaViewAll;
	}

	public void setTextAreaViewAll(JTextArea textAreaViewAll) {
		this.textAreaViewAll = textAreaViewAll;
	}
	
	public ControllerWS getControllerWS() {
		return controllerWS;
	}

	public void setControllerWS(ControllerWS controllerWS) {
		this.controllerWS = controllerWS;
	}
}
