package veritas.UI.Controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import veritas.main.Main;

public class VeritasMenuFXMLController {

	@FXML
	public Button btAddProduct;

	public Parent root;
	public Stage stage;
	
	public void buttonAddProduct() throws IOException{
		root = FXMLLoader.load(getClass().getResource("AddProduct.fxml"));
		
		Scene menuProductScreen = new Scene(root, 801, 589);
		
		Main.primaryStage.setTitle("Veritas");
		Main.primaryStage.setScene(menuProductScreen);
		Main.primaryStage.sizeToScene(); 
		Main.primaryStage.show();
	}	
	
}
