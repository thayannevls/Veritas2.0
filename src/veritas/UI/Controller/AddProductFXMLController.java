package veritas.UI.Controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import persistence.PersistenceProduct;
import veritas.domain.Product;
import veritas.main.Main;

/**
 * Controller fxml
 * @author thayannevls
 *
 */
public class AddProductFXMLController {
	
	/**
	 * Submit product on data base
	 */
	@FXML
	public TextField txtNameProduct;
	@FXML
	public TextField txtIdProduct;
	@FXML
	public TextField txtDescriptionProduct;
	@FXML
	public Button btCancelAddProduct;
	public Parent root;
	/**
	 * Action of submit button
	 * Incomplete
	 * @return
	 * 
	 */
	 public void buttonSubmitProduct() throws IOException{
		 
		
		String name = txtNameProduct.getText();
		//int id = Integer.parseInt(idProduct.getText());
		String description = txtDescriptionProduct.getText();
		
		Product product = new Product(name, description);
		PersistenceProduct Pp = new PersistenceProduct();
		Pp.persist(product); 
		
		root = FXMLLoader.load(getClass().getResource("ProductSubmitedAlert.fxml"));
		
		Scene menuProductScreen = new Scene(root, 541, 131);
		Stage stage = new Stage();
		stage.setTitle("Veritas");
		stage.setScene(menuProductScreen);
		stage.show();
		
	} 
	 
	public void buttonCancelAddProduct() throws IOException{
		
		root = FXMLLoader.load(getClass().getResource("VeritasMenu.fxml"));
		Scene addProductScreen = new Scene(root, 801, 589);
		Main.primaryStage.setTitle("Veritas");
		Main.primaryStage.setScene(addProductScreen);
		Main.primaryStage.show();
		 
	}
}
