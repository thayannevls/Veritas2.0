package exampleMain;

import java.util.List;

import persistence.PersistencePerson;
import person.Person;
import qrCode.QRCode;
import user.User;

public class main {
	public static void main(String[] args){
		
		PersistencePerson pC = new PersistencePerson();
		//pC.persist(p1);
		//pC.persist(p2);
		//pC.persist(p3);
		
		System.out.println(pC.selectById(3).toString());
		
	}

}
