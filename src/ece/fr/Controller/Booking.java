package ece.fr.Controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Booking implements Initializable {
    @FXML
    private ImageView IWfilm;

    @FXML
    private Label LAfilm;

    @FXML
    private ChoiceBox<?> CBday;

    @FXML
    private ChoiceBox<?> CBhour;

    @FXML
    private Button BUbuy;

    @FXML
    private Button BUback;

    @FXML
    void handleButtonActionBUback(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUbuy(ActionEvent event) throws IOException {
        Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FramePayment.fxml")));
        Scene scene = new Scene(home);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
