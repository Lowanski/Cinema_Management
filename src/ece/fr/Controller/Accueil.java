package ece.fr.Controller;


import ece.fr.Model.AuthentificatedUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Accueil implements Initializable {
    AuthentificatedUser user;

    @FXML
    private Label LAfilmroom;

    @FXML
    private Button BUback;

    @FXML
    private Label LApriceregularInput;

    @FXML
    private Button BUnext;

    @FXML
    private Label LAtotalplaceoutput;

    @FXML
    private Label LApricechildrenInput;

    @FXML
    private ImageView IMfilm2;

    @FXML
    private Label LAprice;

    @FXML
    private ImageView IMfilm3;

    @FXML
    private ImageView IMfilm1;

    @FXML
    private Label LApricestandardInput11;

    @FXML
    private Button BUaddchidren;

    @FXML
    private Label LAfilmtypeInput;

    @FXML
    private Label LAfilmRoomInput;

    @FXML
    private Label LAstandard;

    @FXML
    private Label LAprice1;

    @FXML
    private Label LAfilmdescription;

    @FXML
    private Button BUbuy;

    @FXML
    private Label LAprice2;

    @FXML
    private Label LApricestandardInput1;

    @FXML
    private Button BUminusregular;

    @FXML
    private Button BUminuschildren;

    @FXML
    private Label LApricestandardInput1111;

    @FXML
    private Button BUminusstandart;

    @FXML
    private Button BUaddstandart;

    @FXML
    private Label LAtotalpriceoutput;

    @FXML
    private Label LAsenior;

    @FXML
    private Label LAfilmseat;

    @FXML
    private Label LAchildren;

    @FXML
    private Button BUaddregular;

    @FXML
    private Button BUminussenior;

    @FXML
    private Label LAfilmseatInput;

    @FXML
    private Label LApricestandardInput;

    @FXML
    private Label LAfilmdescriptionInput;

    @FXML
    private Button BUprevious;

    @FXML
    private Label LApricestandardInput111;

    @FXML
    private Button BUaddsenior;

    @FXML
    private Label LAregular;

    @FXML
    private Label LApriceseniorInput;

    @FXML
    private Label LAfilmnameInput;

    @FXML
    private Label LAusername;

    @FXML
    private ImageView IVuserlogo;

    @FXML
    void handleButtonActionBUprevious(ActionEvent event) {

    }



    @FXML
    void handleButtonActionBUnext(ActionEvent event) {

    }


    @FXML
    void handleButtonActionBUminusstandart(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUaddstandart(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUminusregular(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUaddregular(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUminussenior(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUaddsenior(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUminuschildren(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUaddchidren(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUbuy(ActionEvent event) {

    }

    @FXML
    void handleButtonActionBUback(ActionEvent event) throws IOException
    {
        Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FrameSignIn.fxml")));
        Scene scene = new Scene(home);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FileInputStream inputstream = null;
        try {
            inputstream = new FileInputStream("Ressources/userLogo/guest.png");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert inputstream != null;
        Image logo = new Image(inputstream);
        IVuserlogo.setImage(logo);
    }

    @FXML
    public void transferUser(AuthentificatedUser user) {
        System.out.println("Hello");
        this.user=user;
        System.out.println("I am "+ user.getFirstName() + " " + user.getName());

    }
}
