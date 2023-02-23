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
					}
				}
			});
			JComboBox comboBoxFind = app.getComboBoxFind();

			comboBoxFind.addItem("Find products by category");
			comboBoxFind.addItem("Find customer by ID");
			comboBoxFind.addItem("Find product with highest price");
			comboBoxFind.addItem("Find order placed by customer");
			comboBoxFind.addItem("Get orderlines from order");

			
			app.getBtnSelectFind().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					WebService1Soap service = new WebService1SoapProxy();
					String selectedItems = (String)app.getComboBoxFind().getSelectedItem();
				    StringBuilder sb = new StringBuilder();

					try {
						switch(selectedItems) {
						
						case "Find products by category":
						    Product[] products = service.getProductsFromCategory(0);
						    
						    sb.append("PRODUCTS INFO: \n\n");
						    
						    for (Product p : products) {
						        sb.append("Category ID: ").append(p.getCategoryID()).append("\n");
						        sb.append("Category Name: ").append(p.getProductName()).append("\n\n");
						    }
						    app.getTextAreaFind().setText(sb.toString());
						    break;
						    
						case "Find customer by ID":
						    Customer customer = service.getCustomerByID(0);
						   
						    sb.append("CUSTOMERS INFO: \n\n");

						        sb.append("Customer Name: ").append(customer.getName()).append("\n");
						        sb.append("Customer ID: ").append(customer.getCustomerID()).append("\n");
						        sb.append("Username: ").append(customer.getUserName()).append("\n");
						        sb.append("Address: ").append(customer.getAddress()).append("\n");
						        sb.append("Phone Number: ").append(customer.getPhoneNumber()).append("\n");
						        sb.append("Email: ").append(customer.getEmail()).append("\n\n");
						
						    app.getTextAreaFind().setText(sb.toString());
						    break;							
			
						case "Find product with highest price":
							 Product product = service.getProductPriceHighest();
							    
							  sb.append("PRODUCTS INFO: \n\n");

							        sb.append("Product Name: ").append(product.getProductName()).append("\n");
							        sb.append("Price: ").append(product.getPrice()).append("\n");
							    
							    app.getTextAreaFind().setText(sb.toString());
							    break;
							    
						case "Find order placed by customer":
						    Order[] orders = service.getOrdersFromCustomer(0);
						    
						    sb.append("ORDERS INFO: \n\n");
						    
						    for (Order o : orders) {
						        sb.append("Order ID: ").append(o.getOrderID()).append("\n");
						        sb.append("Order Date: ").append(o.getOrderDate()).append("\n");
						        sb.append("Supermarket ID: ").append(o.getSupermarketID()).append("\n");
						        sb.append("Customer ID: ").append(o.getCustomerID()).append("\n");
						        sb.append("Payment Method: ").append(o.getPaymentMethod()).append("\n\n");
						    }
						    app.getTextAreaFind().setText(sb.toString());
						    break;
						    
					 case "Get orderlines from order":
					Orderline[] orderlines = service.getOrderLinesFromOrder(0);
										    
					sb.append("ORDERLINES INFO: \n\n");

					for (Orderline o : orderlines) {
					sb.append("Order ID: ").append(o.getOrderID()).append("\n");
					sb.append("Product ID: ").append(o.getProductID()).append("\n");
					sb.append("Orderline number: ").append(o.getOrderlineNumber()).append("\n");
					sb.append("Quantity: ").append(o.getQuantity()).append("\n");
					}
					app.getTextAreaFind().setText(sb.toString());
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
