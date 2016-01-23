package exampleMain;

import java.util.List;
import persistence.PersistenceProduct;
import persistence.PersistenceUser;
import qrCode.QRCode;
import user.User;
import product.Product;

public class main {
	public static void main(String[] args){
		Product p = new Product();
		PersistenceProduct pP = new PersistenceProduct();
		
		System.out.println(pP.selectById(2).toString());
		
	}

}
