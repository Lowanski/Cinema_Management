package ece.fr.Controller;

import ece.fr.Controller.Database.DatabaseConn;
import ece.fr.Model.AuthentificatedUser;
import ece.fr.Model.Reservation;
import ece.fr.Model.Session;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class Booking implements Initializable {
    private AuthentificatedUser user;
    private Reservation reservation;
    private ArrayList<Session> listSession;

    @FXML
    private ImageView IWfilm;

    @FXML
    private Label LAfilm;

    @FXML
    private ChoiceBox CBsession;

    @FXML
    private Button BUbuy;

    @FXML
    private Button BUback;

    @FXML
    private Label LAtotticketbooked;

    @FXML
    private Label LAtotprice;

    @FXML
    private Label LAuser;

    @FXML
    private Label LAleftPlaces;

    @FXML
    private Label LAerror;


    @FXML
    void handleButtonAction(ActionEvent event) {
        for (Session session : listSession) {
            if (CBsession.getValue().equals(session.getDate() + " " + session.getTime())) {
                LAleftPlaces.setText(session.getLeftPlaces() + "");
            }
        }
    }

    @FXML
    void handleButtonActionBUback(ActionEvent event) throws IOException {
        if (user == null) {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("ece/fr/View/FrameAccueil.fxml"));
            Parent home = loader.load();
            Scene scene = new Scene(home);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("ece/fr/View/FrameAccueil.fxml"));
            Parent home = loader.load();
            Accueil accueilController = loader.getController();
            accueilController.transferUser(user);
            Scene scene = new Scene(home);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }
    }

    @FXML
    public void transferUser(AuthentificatedUser user) {
        this.user = user;
    }

    public void transferReservation(Reservation reservation) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        this.reservation = reservation;
        LAtotticketbooked.setText(Integer.toString(reservation.getNumberChildren() + reservation.getNumberSenior() + reservation.getNumberStandard() + reservation.getNumberGuest()));
        LAtotprice.setText(reservation.getTotPrice() + " $");
        if (user != null)
            LAuser.setText(user.getFirstName() + " " + user.getName());
        else
            LAuser.setText("Guest user");
        LAfilm.setText(reservation.getFilm().getName());
        FileInputStream inputstream = null;
        try {
            inputstream = new FileInputStream(reservation.getFilm().getImage());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image filmImage = new Image(inputstream);
        IWfilm.setImage(filmImage);
        listSession = db.getListSession(reservation.getFilm().getID());
        CBsession.getItems().clear();
        if (listSession.size() != 0) {
            for (Session session : listSession) {
                CBsession.getItems().add(session.getDate() + " " + session.getTime());
            }

        }
    }

    @FXML
    void handleButtonActionBUbuy(ActionEvent event) throws IOException {
        if (Integer.parseInt(LAleftPlaces.getText()) - (reservation.getNumberChildren() + reservation.getNumberGuest() + reservation.getNumberSenior() + reservation.getNumberStandard()) < 0) {
            LAerror.setText("Impossible to book this session, there are not enough places left");
        } else {
            if (user == null) {
                FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("ece/fr/View/FramePayment.fxml"));
                Parent home = loader.load();
                Payment paymentController = loader.getController();
                for (Session session : listSession) {
                    if (CBsession.getValue().equals(session.getDate() + " " + session.getTime())) {
                        reservation.setSession(session);
                    }
                }
                paymentController.transferReservation(reservation);
                Scene scene = new Scene(home);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
            } else {
                FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("ece/fr/View/FramePayment.fxml"));
                Parent home = loader.load();
                Payment paymentController = loader.getController();
                paymentController.transferUser(user);
                for (Session session : listSession) {
                    if (CBsession.getValue().equals(session.getDate() + " " + session.getTime())) {
                        reservation.setSession(session);
                    }
                }
                paymentController.transferReservation(reservation);
                Scene scene = new Scene(home);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }


}
