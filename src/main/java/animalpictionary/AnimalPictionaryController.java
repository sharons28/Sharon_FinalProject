package animalpictionary;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class AnimalPictionaryController {

    @FXML
    private TextField txtAnimalName, txtNumberTries, txtScore;
    @FXML
    private TextArea textAreaClue;
    @FXML
    private ScrollPane scrollPane;

    @FXML
    protected void onExitGameItemClick() {
        Platform.exit();
    }
    @FXML
    protected void onRestartItemClick() {
        txtAnimalName.setText(" ");
        txtNumberTries.setText(" ");
        txtScore.setText(" ");
    }



}
