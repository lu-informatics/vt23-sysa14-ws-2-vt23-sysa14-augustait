package se.lu.ics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

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
			
			app.getBtnSelectAll().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					WebService1Soap service = new WebService1SoapProxy();
					
					try {
						
						
						
						Customer [] customers = service.getCustomers();
						
						for(Customer c : customers) {
							System.out.print(c.getName());
						}
						
						
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
			
		}

		
}
