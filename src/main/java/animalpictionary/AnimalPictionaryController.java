package animalpictionary;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class AnimalPictionaryController {

    @FXML
    public TextField txtAnimalName, txtAnimalName1, txtNumberTries, txtScore, txtName, txtScoreB, txtCurrentRank;
    @FXML
    public TextArea textAreaClue, txtAreaInput;
    @FXML
    public ImageView imageView;

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

    @FXML
    protected void onAnimalPictionaryClick(ActionEvent event) throws IOException {
        Parent animalpictionary = FXMLLoader.load(getClass().getResource("animalpictionary-view.fxml"));
        Scene scene = new Scene(animalpictionary);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Animal Pictionary");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onScoreBoardClick(ActionEvent event) throws IOException {
        Parent scorescreen = FXMLLoader.load(getClass().getResource("scorescreen-view.fxml"));
        Scene scene = new Scene(scorescreen);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Score Board");
        stage.setScene(scene);
        stage.show();
    }

    AnimalPictionary ap;
    ScoreScreen ss;
    String display = " ";
    int numberOfTries=3;
    int score=0;


    public AnimalPictionaryController() {
        ap = new AnimalPictionary();
        ss = new ScoreScreen();
        String nt = Integer.toString(numberOfTries);
        txtNumberTries.setText(nt);
        String s = Integer.toString(score);
        txtNumberTries.setText(s);
    }

    public void onButtonInputClick(){
        String name= txtName.getText();
        int score= Integer.valueOf(txtScoreB.getText());
        ss.addInfo(new ScoreInformation(name, score));
        txtAreaInput.setText(ss.displayInfo());
    }

    public void onButtonClueClick(){
        textAreaClue.setText(ap.clues());
    }

    public void btnSubmitGuess(){
        if(numberOfTries>0){
            if(ap.CorrectGuess(txtAnimalName.getText(), txtAnimalName1.getText())){
                txtScore.setText(Integer.toString(score+2));
                txtNumberTries.setText((Integer.toString(numberOfTries-1)));
            }else{
                txtNumberTries.setText((Integer.toString(numberOfTries-1)));
            }
        }
        imageView.setImage(ap.nextPicture());
    }
}
