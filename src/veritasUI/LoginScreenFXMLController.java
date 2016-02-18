package veritasUI;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import veritasUI.Main;

public class LoginScreenFXMLController {
	
	@FXML
	public TextField txtNickName;
	@FXML
	public TextField txtPassword;
	@FXML
	public Button btSignIn;
	@FXML
	public Button btSignUp;
	
	
	
	
	public void buttonSignIn() throws IOException{
		
		Parent root2 = FXMLLoader.load(getClass().getResource("VeritasMenu.fxml"));
		
		Scene menuProductScreen = new Scene(root2,801, 589);
		Main.primaryStage.setTitle("Veritas");
		Main.primaryStage.setScene(menuProductScreen);
		Main.primaryStage.show();
		
	}
}
