package se.lu.ics;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) {

		ApplicationWs app = new ApplicationWs();
		ControllerWS controller = new ControllerWS(app);
		
	}

}
