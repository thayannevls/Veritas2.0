package veritas.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{
	
	public static Stage primaryStage;
	public static Object stage;
	
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		this.primaryStage = primaryStage;
		
		Parent root = FXMLLoader.load(getClass().getResource("/veritas/UI/FXML/LoginScreen.fxml"));
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("Veritas");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	
	
}
