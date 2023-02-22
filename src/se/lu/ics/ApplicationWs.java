package se.lu.ics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ApplicationWs extends JFrame {

	
	private JFrame testFrame;
	private JTabbedPane tabbedPane;
	private JPanel panelView; 
	private JPanel panelFind;
	private JButton btnSelectAll;
	private JComboBox comboBoxViewAll;
	private JTextArea textAreaViewAll;
	private ControllerWS controllerWS;
	
	

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
		comboBoxViewAll.setBounds(202, 261, 131, 22);
		panelView.add(comboBoxViewAll);
		
		textAreaViewAll = new JTextArea();
		textAreaViewAll.setBounds(10, 81, 592, 169);
		panelView.add(textAreaViewAll);
		
		panelFind = new JPanel();
		tabbedPane.addTab("Find", null, panelFind, null);
		panelFind.setLayout(null);
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
