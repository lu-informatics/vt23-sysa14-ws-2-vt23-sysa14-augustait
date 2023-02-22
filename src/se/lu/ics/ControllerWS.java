package se.lu.ics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ControllerWS {
	

	private ApplicationWs app;
	private JFrame jFrame;
		

		public ApplicationWs getApp() {
			return app;
		}

		public void setApp(ApplicationWs app) {
			this.app = app;
		}

		public ControllerWS(ApplicationWs appWs) {
			this.app = appWs;
			declareListener();
	
		}
		
		private void declareListener(){
			
			JComboBox comboBoxViewAll = app.getComboBoxViewAll();

			comboBoxViewAll.addItem("Product Category");
			comboBoxViewAll.addItem("Customers");
			comboBoxViewAll.addItem("Orders");
			comboBoxViewAll.addItem("Products");
			comboBoxViewAll.addItem("Stores");

			
			app.getBtnSelectAll().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					WebService1Soap service = new WebService1SoapProxy();
					String selectedItem = (String)app.getComboBoxViewAll().getSelectedItem();
					
					try {
						switch(selectedItem) {
							
						case "Product Category":
							ProductCategory [] categories = service.getCategories();
							
							for(ProductCategory pc : categories) {
								System.out.print(pc.getCategoryID());
								app.getTextAreaViewAll().setText("The ID is: " + pc.getCategoryID());
							}
							break;
							
						case "Customers":
								Customer [] customers = service.getCustomers();
								
								for(Customer c : customers) {
									System.out.print(c.getName());
									app.getTextAreaViewAll().setText("The ID is: " + c.getName());

								}
								break;
							
						
						
						}
						
						
						
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
			
		}

		
}
