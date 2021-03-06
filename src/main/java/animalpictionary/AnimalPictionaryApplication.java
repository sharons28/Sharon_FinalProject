package animalpictionary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import textnumber.TextNumberApplication;

import java.io.IOException;

public class AnimalPictionaryApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AnimalPictionaryApplication.class.getResource("animalpictionary-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 550);
        primaryStage.setTitle("Animal Pictionary");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}