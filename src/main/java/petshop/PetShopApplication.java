package petshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import textnumber.TextNumberApplication;

import java.io.IOException;

public class PetShopApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PetShopApplication.class.getResource("petshop-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 550);
        primaryStage.setTitle("Pet Shop");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
