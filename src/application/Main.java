package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	//Scene mainGUIScene, manageInventoryScene, manageOrdersScene, manageFinacialsScene, manageLaborScene, scheduelingScene;
	
	
	//Main
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("view/GetGrubMain.fxml"));
			primaryStage.setScene(new Scene(root, 650, 500));
			primaryStage.setTitle("Get Grub");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
