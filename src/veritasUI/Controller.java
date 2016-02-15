package veritasUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import persistence.PersistenceProduct;
import product.Product;

/**
 * Controller fxml
 * @author thayannevls
 *
 */
public class Controller {
	
	/**
	 * Submit product on data base
	 */
	public TextField nameProduct;
	public TextField idProduct;
	public TextField descriptionProduct;

	
	 public void buttonSubmitProduct(){
		 
		String name = nameProduct.getText();
		int id = Integer.parseInt(idProduct.getText());
		String description = descriptionProduct.getText();
		
		Product product = new Product(id, name, description);
		PersistenceProduct.persist(product);
		
		
	} 
	 
	public void buttonCancel(){
		Parent root = FXMLLoader.load(getClass().getResource("Submited.fxml"));
		primaryStage.setTitle("Veritas");
		primaryStage.setScene(new Scene(root, 455, 118));
		primaryStage.show();
	}
}
