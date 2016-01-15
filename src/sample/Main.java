package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("ToDo List");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinWidth(1110);
        primaryStage.setMinHeight(150);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
