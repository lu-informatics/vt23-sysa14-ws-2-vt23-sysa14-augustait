package se.lu.ics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.xml.rpc.soap.SOAPFaultException;

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
			
			JComboBox comboBoxFind = app.getComboBoxFind();

			comboBoxFind.addItem("Find Products by Category ID");
			comboBoxFind.addItem("Find Order by Customer ID");
			comboBoxFind.addItem("Find Orderlines by Order ID");

			
			//5 ENTITIES
			app.getBtnSelectAll().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					WebService1Soap service = new WebService1SoapProxy();
					String selectedItem = (String)app.getComboBoxViewAll().getSelectedItem();
				    StringBuilder sb = new StringBuilder();

					try {
						switch(selectedItem) {
							
						case "Product Category":
						    ProductCategory[] categories = service.getCategories();
						    
						    sb.append("CATEGORIES INFO: \n\n");
						    
						    for (ProductCategory pc : categories) {
						        sb.append("Category ID: ").append(pc.getCategoryID()).append("\n");
						        sb.append("Category Name: ").append(pc.getCategoryName()).append("\n\n");
						    }
						    app.getTextAreaViewAll().setText(sb.toString());
						    break;
							
						case "Customers":
						    Customer[] customers = service.getCustomers();
						   
						    sb.append("CUSTOMERS INFO: \n\n");

						    
						    for (Customer c : customers) {
						        sb.append("Customer Name: ").append(c.getName()).append("\n");
						        sb.append("Customer ID: ").append(c.getCustomerID()).append("\n");
						        sb.append("Username: ").append(c.getUserName()).append("\n");
						        sb.append("Address: ").append(c.getAddress()).append("\n");
						        sb.append("Phone Number: ").append(c.getPhoneNumber()).append("\n");
						        sb.append("Email: ").append(c.getEmail()).append("\n\n");
						    }
						    app.getTextAreaViewAll().setText(sb.toString());
						    break;
								
						case "Products":
							 Product[] products = service.getProducts();
							    
							  sb.append("PRODUCTS INFO: \n\n");

							 for (Product p : products) {
							        sb.append("Product ID: ").append(p.getProductID()).append("\n");
							        sb.append("Product Name: ").append(p.getProductName()).append("\n");
							        sb.append("Price: ").append(p.getPrice()).append("\n");
							        sb.append("Category ID: ").append(p.getCategoryID()).append("\n\n");
							    }
							    app.getTextAreaViewAll().setText(sb.toString());
							    break;
							
						
						case "Orders":
						    Order[] orders = service.getOrders();
						    
						    sb.append("ORDERS INFO: \n\n");

						    
						    for (Order o : orders) {
						        sb.append("Order ID: ").append(o.getOrderID()).append("\n");
						        sb.append("Order Date: ").append(o.getOrderDate()).append("\n");
						        sb.append("Supermarket ID: ").append(o.getSupermarketID()).append("\n");
						        sb.append("Customer ID: ").append(o.getCustomerID()).append("\n");
						        sb.append("Payment Method: ").append(o.getPaymentMethod()).append("\n\n");
						    }
						    app.getTextAreaViewAll().setText(sb.toString());
						    break;
							
						case "Stores":
						    Store[] stores = service.getStores();
						    
						    sb.append("STORES INFO: \n\n");

						    
						    for (Store s : stores) {
						        sb.append("Supermarket ID: ").append(s.getSupermarketID()).append("\n");
						        sb.append("Region Name: ").append(s.getRegionName()).append("\n");
						        sb.append("Store Name: ").append(s.getStoreName()).append("\n");
						        sb.append("City: ").append(s.getCity()).append("\n");
						        sb.append("Store Address: ").append(s.getStoreAddress()).append("\n\n");
						    }
						    app.getTextAreaViewAll().setText(sb.toString());
						    break;
							
						}
						
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}catch (SOAPFaultException ex) {
					app.getTextAreaFind().setText("An error occurred while retrieving data. Please try again later");
					}	
				}
			});
			
			
			

			//BINARY RELATIONSHIPS
			app.getBtnSelectFind().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				try {
					WebService1Soap service = new WebService1SoapProxy();
					String selectedItems = (String)app.getComboBoxFind().getSelectedItem();
					
					String inputID = app.getTextFieldFind().getText();
					int parsedID = Integer.parseInt(inputID);

				    StringBuilder sb = new StringBuilder();

					
						switch(selectedItems) {
						
						case "Find Products by Category ID":
							Product[] products = service.getProductsFromCategory(parsedID);

							if(products.length == 0) {
						        sb.append("Enter another ID, No products found for Category ID: ").append(parsedID);

							    
							} else {
							    sb.append("PRODUCTS INFO FOR CATEGORY ID:" + inputID + "\n\n");

							    for (Product p : products) {
							        sb.append("Product ID: ").append(p.getProductID()).append("\n");
							        sb.append("Product Name: ").append(p.getProductName()).append("\n");
							        sb.append("Price: ").append(p.getPrice()).append("\n");
							        sb.append("Category ID: ").append(p.getCategoryID()).append("\n\n");
							    }
							}

							app.getTextAreaFind().setText(sb.toString());
						    break;
						    						
			
							    
						case "Find Order by Customer ID":
						    Order[] orders = service.getOrdersFromCustomer(parsedID);

						    if(orders.length == 0) {
						        app.getTextAreaFind().setText("Enter another ID, No orders for Customer ID: " + inputID);
						        
						    } else {
						        sb.append("ORDERS INFO FOR CUSTOMER ID:" + inputID + "\n\n");

						        for (Order o : orders) {
						            sb.append("Order ID: ").append(o.getOrderID()).append("\n");
						            sb.append("Order Date: ").append(o.getOrderDate()).append("\n");
						            sb.append("Supermarket ID: ").append(o.getSupermarketID()).append("\n");
						            sb.append("Customer ID: ").append(o.getCustomerID()).append("\n");
						            sb.append("Payment Method: ").append(o.getPaymentMethod()).append("\n\n");
						        }
						        app.getTextAreaFind().setText(sb.toString());
						    }
						    break;
						    
						case "Find Orderlines by Order ID":
						    Orderline[] orderlines = service.getOrdersLinesFromOrder(parsedID);

						    if(orderlines.length == 0) {
						        app.getTextAreaFind().setText("Enter another ID, No orderlines for Order ID: " + inputID);
						        
						    } else {
						        sb.append("ORDERLINES INFO FOR ORDER ID:" + inputID + "\n\n");

						        for (Orderline o : orderlines) {
						            sb.append("Order ID: ").append(o.getOrderID()).append("\n");
						            sb.append("Product ID: ").append(o.getProductID()).append("\n");
						            sb.append("Orderline number: ").append(o.getOrderlineNumber()).append("\n");
						            sb.append("Quantity: ").append(o.getQuantity()).append("\n");
						        }
						        app.getTextAreaFind().setText(sb.toString());
						    }
						    break;
					
						}
						 
						
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					}catch(NumberFormatException ex) {
						app.getTextAreaFind().setText("Please Enter a valid ID for Order, Customer or Product");
					
					}catch (SOAPFaultException ex) {
						app.getTextAreaFind().setText("An error occurred while retrieving data. Please try again later");

					}
				}
			});
		}
}
