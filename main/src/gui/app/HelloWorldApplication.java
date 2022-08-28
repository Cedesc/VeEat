package gui.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloWorldApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException{
        FXMLLoader root = new FXMLLoader(HelloWorldApplication.class.getResource("hello-view.fxml"));
        primaryStage.setTitle("HelloWorld");
        primaryStage.setScene(new Scene(root.load(), 320, 240));
        primaryStage.show();
    }
}
