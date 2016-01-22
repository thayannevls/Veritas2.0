package exampleMain;

import java.util.List;

import client.Client;
import persistence.PersistenceUser;
import qrCode.QRCode;
import user.User;

public class main {
	public static void main(String[] args){
		
		PersistenceUser pC = new PersistenceUser();
		//pC.persist(p1);
		//pC.persist(p2);
		//pC.persist(p3);
		
		System.out.println(pC.selectById(3).toString());
		
	}

}
