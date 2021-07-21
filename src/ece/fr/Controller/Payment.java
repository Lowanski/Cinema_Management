package ece.fr.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;

public class Payment implements Initializable {

    @FXML
    private Button BUvalidate;

    @FXML
    private ImageView IWcard;

    @FXML
    private Label LAtransac;

    @FXML
    void handleButtonActionBUvalidate(ActionEvent event) throws InterruptedException {
        LAtransac.setText("Transaction done, good movie !");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FileInputStream inputstream = null;
        try {
            inputstream = new FileInputStream("Ressources/bank_card.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image bank = new Image(inputstream);
        IWcard.setImage(bank);
    }
}
