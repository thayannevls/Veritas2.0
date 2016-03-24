package veritas.UI.Controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import veritas.main.Main;

public class LoginScreenFXMLController {
	
	@FXML
	public TextField userField;
	@FXML
	public TextField passwordField;
	@FXML
	public Button btLogIn;
	
	
	
	
	@FXML
	public void btLogIn() throws IOException{
		
		String user = userField.getText();
		String password = passwordField.getText();

		
		

		/*
		Parent root = FXMLLoader.load(getClass().getResource("/veritas/UI/FXML/VeritasMenu.fxml"));
		
		Scene menuProductScreen = new Scene(root,801, 589);
		Main.primaryStage.setTitle("Veritas");
		Main.primaryStage.setScene(menuProductScreen);
		Main.primaryStage.show(); */
		
	}
}
