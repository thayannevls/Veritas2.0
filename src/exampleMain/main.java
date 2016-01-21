package exampleMain;

import client.Client;
import persistence.PersistencePerson;
import person.Person;
import qrCode.QRCode;

public class main {
	public static void main(String[] args){
		Person client = new Person();	
		PersistencePerson pC = new PersistencePerson();
		pC.savePerson(client);
	}
}
