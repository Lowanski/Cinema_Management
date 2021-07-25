package ece.fr.Controller;

import ece.fr.Controller.Database.DatabaseConn;
import ece.fr.Model.AuthentificatedUser;
import ece.fr.Model.Reservation;
import ece.fr.Model.User;
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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;

/**
 * The type Payment.
 */
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

    /**
     * Handle button action buvalidate. validation of the payement
     *
     * @param event the event
     * @throws InterruptedException the interrupted exception
     * @throws SQLException         the sql exception
     */
    @FXML
    void handleButtonActionBUvalidate(ActionEvent event) throws InterruptedException, SQLException {
        DatabaseConn db = new DatabaseConn();
        if (TFcardname.getLength() == 0 || TFcardnumber.getLength() == 0 || TFcodesecu.getLength() != 3)  {
            LAtransac.setTextFill(Paint.valueOf(String.valueOf(Color.INDIANRED)));
            LAtransac.setText("Please enter Credit Card credential");
        } else {
            if (user != null)
                db.createBooking(user.getUserID(),reservation.getSession().getIDsession());
            else
                db.createUser(null,"Guest"+db.getUser().size()+1,null,0,null,null,0);
                ArrayList<User> guestUserList = db.getUser();
                db.createBooking(guestUserList.get(guestUserList.size()-1).getUserID(),reservation.getSession().getIDsession());
                db.updateSessionLeftPlace(reservation.getSession().getIDsession(),reservation.getSession().getLeftPlaces()- (reservation.getNumberChildren()+ reservation.getNumberGuest()+ reservation.getNumberSenior()+ reservation.getNumberStandard()));
            LAtransac.setTextFill(Paint.valueOf(String.valueOf(Color.GREEN)));
            LAtransac.setText("Transaction done. You have booked " +reservation.getFilm().getName()+" on "+reservation.getSession().getDate()+" at "+reservation.getSession().getTime()+", good movie !");
        }
    }

    /**
     * Transfer user. forward info of user
     *
     * @param user the user
     */
    @FXML
    public void transferUser(AuthentificatedUser user) {
        this.user = user;
    }

    /**
     * Transfer reservation.  forward info of reservation
     *
     * @param reservation the reservation
     */
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
