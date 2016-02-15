package veritasUI;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
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

	/**
	 * Action of submit button
	 * Incomplete
	 * @return
	 * 
	 */
	 public void buttonSubmitProduct() throws IOException{
		 
		
		String name = nameProduct.getText();
		int id = Integer.parseInt(idProduct.getText());
		String description = descriptionProduct.getText();
		
		Product product = new Product(id, name, description);
		PersistenceProduct.persist(product); 
		 Parent root = FXMLLoader.load(getClass().getResource("Submited.fxml"));
		Stage stage = new Stage();
		stage.setTitle("Veritas");
		stage.setScene(new Scene(root, 455, 118));
		stage.show();
		
	} 
	 
	public void buttonCancel() throws IOException{
		
		 
	}
}
