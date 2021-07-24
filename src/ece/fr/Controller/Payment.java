package ece.fr.Controller;

import ece.fr.Model.AuthentificatedUser;
import ece.fr.Model.Reservation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;

public class Payment implements Initializable {
    private AuthentificatedUser user;
    private Reservation reservation;

    @FXML
    private Button BUvalidate;

    @FXML
    private TextField TFcardname;

    @FXML
    private TextField TFcardnumber;

    @FXML
    private TextField TFcodesecu;

    @FXML
    private ImageView IWcard;

    @FXML
    private Label LAtransac;

    @FXML
    private Label LAtotprice;

    @FXML
    private Label LAstandart;

    @FXML
    private Label LAchildren;

    @FXML
    private Label LAsenior;

    @FXML
    private Label LAguest;

    @FXML
    void handleButtonActionBUvalidate(ActionEvent event) throws InterruptedException {
        if (TFcardname.getLength() == 0 || TFcardnumber.getLength() == 0 || TFcodesecu.getLength() != 3)  {
            LAtransac.setTextFill(Paint.valueOf(String.valueOf(Color.INDIANRED)));
            LAtransac.setText("Please enter Credit Card credential");
        } else {
            LAtransac.setTextFill(Paint.valueOf(String.valueOf(Color.GREEN)));
            LAtransac.setText("Transaction done, good movie !");
        }
    }

    @FXML
    public void transferUser(AuthentificatedUser user) {
        this.user = user;
    }

    public void transferReservation(Reservation reservation) {
        this.reservation = reservation;
        LAchildren.setText(reservation.getNumberChildren()*reservation.getFilm().getPriceChildren() + " $");
        LAguest.setText(reservation.getNumberGuest()*reservation.getFilm().getPriceGuest() + " $");
        LAsenior.setText(reservation.getNumberSenior()*reservation.getFilm().getPriceSenior() + " $");
        LAstandart.setText(reservation.getNumberStandard()*reservation.getFilm().getPriceRegular() + " $");
        LAtotprice.setText(reservation.getTotPrice()+" $");
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
