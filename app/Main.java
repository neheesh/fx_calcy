package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML layout and controller
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/CalculatorView.fxml"));
        stage.setScene(new Scene(loader.load())); // Set the scene using the loaded layout
        stage.setTitle("Calculator"); // Window title
        stage.show(); // Show the app window
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}