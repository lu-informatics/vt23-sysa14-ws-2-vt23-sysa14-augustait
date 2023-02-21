package se.lu.ics;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) {

		WebService1Soap service = new WebService1SoapProxy();
		
		try {
			
			
			
			Customer [] customers = service.getCustomers();
			
			for(Customer c : customers) {
				System.out.print(c.getName());
			}
			
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
