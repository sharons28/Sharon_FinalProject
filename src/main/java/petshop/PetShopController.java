package petshop;

import collegeplan.CollegePlan;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class PetShopController {
    @FXML
    private TextField txtPetName, txtOwnerName, txtCheck;
    @FXML
    private DatePicker pickDate;
    @FXML
    private CheckBox chkDogFood, chkDogShampoo, chkDogConditioner, chkCatFood, chkCatShampoo, chkCatConditioner;
    @FXML
    private TextArea textAreaReceipt, textAreaPrice;

    Customer c;
    Shop s= new Shop();
    String cart= " ";
    int total= 0;


    @FXML
    protected void OnCloseAppClick() {
        Platform.exit();
    }
    @FXML
    protected void onQuitClick() {Platform.exit();}

    public void btnShopClick(ActionEvent event) throws IOException {
        Parent shop = FXMLLoader.load(getClass().getResource("shop-view.fxml"));
        Scene scene = new Scene(shop);

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Shop Pet Store");
        stage.setScene(scene);
        stage.show();
    }

    public void btnReturnHomeClick(ActionEvent event) throws IOException {
        Parent home = FXMLLoader.load(getClass().getResource("petshop-view.fxml"));
        Scene scene = new Scene(home);

        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Log In Page");
        stage.setScene(scene);
        stage.show();
    }

    public void checkCart() {
        if (chkDogFood.isSelected()) {
            cart += chkDogFood.getText()+ "\n";
            total+= 20;
        }
        if (chkDogShampoo.isSelected()) {
            cart += chkDogShampoo.getText() + "\n";
            total+=15;
        }
        if (chkDogConditioner.isSelected()) {
            cart += chkDogConditioner.getText() + "\n";
            total +=10;
        }
        if (chkCatFood.isSelected()) {
            cart += chkCatFood.getText() + "\n";
            total+= 20;
        }
        if (chkCatShampoo.isSelected()) {
            cart += chkCatShampoo.getText() + "\n";
            total+=15;
        }
        if (chkCatConditioner.isSelected()) {
            cart += chkCatConditioner.getText() + "\n";
            total +=10;
        }
    }

    @FXML
    public void onDogFoodClick(){
        checkCart();
    }
    @FXML
    public void onDogShampooClick(){
        checkCart();
    }
    @FXML
    public void onDogConditionerClick(){
        checkCart();
    }
    @FXML
    public void onCatFoodClick(){
        checkCart();
    }
    @FXML
    public void onCatShampooClick(){
        checkCart();
    }
    @FXML
    public void onCatConditionerClick(){
        checkCart();
    }

    public void btnAddAccountClick(){
        String date = pickDate.getValue().toString();
        s.add(new Customer(txtPetName.getText(), txtOwnerName.getText(), date, cart, total));
        txtCheck.setText("Account added successfully!");
    }

    public void btnPrintReceiptClick(){
        textAreaReceipt.setText(s.printRecord());
    }

    public void btnCheapestOrderClick(){
        String cheapestOrder= s.getCheapestOrder().toString();
        textAreaPrice.setText(cheapestOrder);
    }

    public void btnExpensiveOrderClick(){
        String expensiveOrder= s.getMostExpensiveOrder().toString();
        textAreaPrice.setText(expensiveOrder);
    }





}
