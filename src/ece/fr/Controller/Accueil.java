package ece.fr.Controller;


import ece.fr.Controller.Database.DatabaseConn;
import ece.fr.Model.AuthentificatedUser;
import ece.fr.Model.Film;
import ece.fr.Model.Reservation;
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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class Accueil implements Initializable {
    private ArrayList<Film> listFilms = null;
    private ArrayList<Image>filmImage = null;
    private int filmSelected = 1;
    private AuthentificatedUser user;
    private Reservation reservation;

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
    private Button BUbook;

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
        if (filmSelected == 0){
            filmSelected=listFilms.size()-1;
        }else {
            filmSelected--;
        }

        if (filmSelected < listFilms.size() - 1 && filmSelected > 0){
            IMfilm1.setImage(filmImage.get(filmSelected-1));
            IMfilm2.setImage(filmImage.get(filmSelected));
            IMfilm3.setImage(filmImage.get(filmSelected+1));
        }
        else if (filmSelected == 0){
            IMfilm1.setImage(filmImage.get(listFilms.size()-1));
            IMfilm2.setImage(filmImage.get(filmSelected));
            IMfilm3.setImage(filmImage.get(filmSelected+1));
        }
        else if (filmSelected == listFilms.size()-1){
            IMfilm1.setImage(filmImage.get(filmSelected-1));
            IMfilm2.setImage(filmImage.get(filmSelected));
            IMfilm3.setImage(filmImage.get(0));
        }
        setInfo();
    }

    @FXML
    void handleButtonActionBUnext(ActionEvent event) {
        if (filmSelected == listFilms.size()-1){
            filmSelected=0;
        }else {
            filmSelected++;
        }

        if (filmSelected < listFilms.size() - 1 && filmSelected > 0){
            IMfilm1.setImage(filmImage.get(filmSelected-1));
            IMfilm2.setImage(filmImage.get(filmSelected));
            IMfilm3.setImage(filmImage.get(filmSelected+1));
        }
        else if (filmSelected == 0){
            IMfilm1.setImage(filmImage.get(listFilms.size()-1));
            IMfilm2.setImage(filmImage.get(filmSelected));
            IMfilm3.setImage(filmImage.get(filmSelected+1));
        }
        else if (filmSelected == listFilms.size()-1){
            IMfilm1.setImage(filmImage.get(filmSelected-1));
            IMfilm2.setImage(filmImage.get(filmSelected));
            IMfilm3.setImage(filmImage.get(0));
        }
        setInfo();
    }


    @FXML
    void handleButtonActionBUminusstandart(ActionEvent event) {
        if (reservation.getNumberGuest() >= 1)
            reservation.setNumberGuest(reservation.getNumberGuest()-1);
        setInfo();
    }

    @FXML
    void handleButtonActionBUaddstandart(ActionEvent event) {
        reservation.setNumberGuest(reservation.getNumberGuest()+1);
        setInfo();
    }

    @FXML
    void handleButtonActionBUminusregular(ActionEvent event) {
        if (reservation.getNumberStandard() >= 1)
            reservation.setNumberStandard(reservation.getNumberStandard()-1);
        setInfo();
    }

    @FXML
    void handleButtonActionBUaddregular(ActionEvent event) {
        reservation.setNumberStandard(reservation.getNumberStandard()+1);
        setInfo();
    }

    @FXML
    void handleButtonActionBUminussenior(ActionEvent event) {
        if (reservation.getNumberSenior() >= 1)
            reservation.setNumberSenior(reservation.getNumberSenior()-1);
        setInfo();
    }

    @FXML
    void handleButtonActionBUaddsenior(ActionEvent event) {
        reservation.setNumberSenior(reservation.getNumberSenior()+1);
        setInfo();
    }

    @FXML
    void handleButtonActionBUminuschildren(ActionEvent event) {
        if (reservation.getNumberChildren() >= 1)
            reservation.setNumberChildren(reservation.getNumberChildren()-1);
        setInfo();
    }

    @FXML
    void handleButtonActionBUaddchidren(ActionEvent event) {
        reservation.setNumberChildren(reservation.getNumberChildren()+1);
        setInfo();
    }

    @FXML
    void handleButtonActionBUbook(ActionEvent event) throws IOException {
        if (user == null) {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("ece/fr/View/FrameBooking.fxml"));
            Parent home = loader.load();
            Booking bookingController = loader.getController();
            bookingController.transferReservation(reservation);
            Scene scene = new Scene(home);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("ece/fr/View/FrameBooking.fxml"));
            Parent home = loader.load();
            Booking bookingController = loader.getController();
            bookingController.transferUser(user);
            bookingController.transferReservation(reservation);
            Scene scene = new Scene(home);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
        }
    }

    @FXML
    void handleButtonActionBUback(ActionEvent event) throws IOException {
        Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FrameSignIn.fxml")));
        Scene scene = new Scene(home);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    private void setInfo() {
        LApricestandardInput.setText(Integer.toString(listFilms.get(filmSelected).getPriceGuest()));
        LApricechildrenInput.setText(Integer.toString(listFilms.get(filmSelected).getPriceChildren()));
        LApriceseniorInput.setText(Integer.toString(listFilms.get(filmSelected).getPriceSenior()));
        LApriceregularInput.setText(Integer.toString(listFilms.get(filmSelected).getPriceRegular()));

        LAfilmnameInput.setText(listFilms.get(filmSelected).getName());
        LAfilmdescriptionInput.setText(listFilms.get(filmSelected).getDescription());
        LAfilmtypeInput.setText(listFilms.get(filmSelected).getGender());

        LApricestandardInput1.setText(Integer.toString(reservation.getNumberGuest()));
        LApricestandardInput11.setText(Integer.toString(reservation.getNumberStandard()));
        LApricestandardInput111.setText(Integer.toString(reservation.getNumberSenior()));
        LApricestandardInput1111.setText(Integer.toString(reservation.getNumberChildren()));

        int totalPlace = reservation.getNumberGuest() + reservation.getNumberStandard() + reservation.getNumberSenior() + reservation.getNumberChildren();
        LAtotalplaceoutput.setText(Integer.toString(totalPlace));

        reservation.setTotPrice((reservation.getNumberGuest() * listFilms.get(filmSelected).getPriceGuest()) + (reservation.getNumberStandard() * listFilms.get(filmSelected).getPriceRegular()) + (reservation.getNumberSenior() * listFilms.get(filmSelected).getPriceSenior()) + (reservation.getNumberChildren() * listFilms.get(filmSelected).getPriceChildren()));
        LAtotalpriceoutput.setText(Integer.toString(reservation.getTotPrice()));
    }

    private void setFilmImage() throws FileNotFoundException {
        filmImage = new ArrayList<>();
        for (int i = 0; i < listFilms.size(); i++) {
            FileInputStream inputStream = new FileInputStream(listFilms.get(i).getImage());
            filmImage.add(new Image(inputStream));
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DatabaseConn db = new DatabaseConn();
        FileInputStream inputstream = null;
        reservation = new Reservation(0, null, null, null, 0, 0, 0, 0);
        try {
            listFilms = db.getFilm();
            inputstream = new FileInputStream("Ressources/userLogo/guest.png");

            setFilmImage();

        } catch (FileNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        assert inputstream != null;

        Image logo = new Image(inputstream);

        IMfilm1.setImage(filmImage.get(0));
        IMfilm2.setImage(filmImage.get(1));
        IMfilm3.setImage(filmImage.get(2));

        setInfo();

        IVuserlogo.setImage(logo);
        LAusername.setText("Guest");
    }

    @FXML
    public void transferUser(AuthentificatedUser user) {
        FileInputStream inputstream = null;
        this.user = user;
        if (user.getType() == 1 && user.getGender().equals("M")) {
            try {
                inputstream = new FileInputStream("Ressources/userLogo/youngBoy.png");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            IVuserlogo.setImage(logo);
        } else if (user.getType() == 1 && user.getGender().equals("W")) {
            try {
                inputstream = new FileInputStream("Ressources/userLogo/youngGirl.png");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            IVuserlogo.setImage(logo);
        } else if (user.getType() == 2 && user.getGender().equals("M")) {
            try {
                inputstream = new FileInputStream("Ressources/userLogo/boy.png");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            IVuserlogo.setImage(logo);
        } else if (user.getType() == 2 && user.getGender().equals("W")) {
            try {
                inputstream = new FileInputStream("Ressources/userLogo/gril.png");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            IVuserlogo.setImage(logo);
        } else if (user.getType() == 3 && user.getGender().equals("M")) {
            try {
                inputstream = new FileInputStream("Ressources/userLogo/oldBoy.png");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            IVuserlogo.setImage(logo);
        } else if (user.getType() == 3 && user.getGender().equals("W")) {
            try {
                inputstream = new FileInputStream("Ressources/userLogo/oldGirl.png");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            IVuserlogo.setImage(logo);
        }
        assert user != null;
        LAusername.setText(user.getFirstName() + " " + user.getName());
    }
}
