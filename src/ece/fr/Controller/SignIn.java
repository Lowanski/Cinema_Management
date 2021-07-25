package ece.fr.Controller;

import ece.fr.Controller.Database.DatabaseConn;
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
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * The type Sign in.
 */
public class SignIn implements Initializable {

    @FXML
    private Button BUquit;
    @FXML
    private Button BUsavepricechange;

    @FXML
    private Label LApassword;

    @FXML
    private Label LAemail;

    @FXML
    private Label LAerrormessage;

    @FXML
    private TextField TFemailinput;

    @FXML
    private TextField TFpasswordinput;

    @FXML
    private Label LAsignin;

    @FXML
    private Button BUcreateaccount;

    @FXML
    private Button BUvalidate;

    @FXML
    private Button BUsigninguest;

    @FXML
    private ImageView IVimageaccueil;

    @FXML
    private Label LAgrospathe;

    /**
     * Create new account. handle button to create a new account
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void createNewAccount(ActionEvent event) throws IOException {
        Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FrameNewAccount.fxml")));
        Scene scene = new Scene(home);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    /**
     * Sign in as guest. handle the event of to sign in as a guest
     *
     * @param event the event
     * @throws IOException the io exception
     */
    @FXML
    void signInAsGuest(ActionEvent event) throws IOException {
        Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FrameAccueil.fxml")));
        Scene scene = new Scene(home);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }


    /**
     * Validate credential. validate the signin form
     *
     * @param event the event
     * @throws IOException    the io exception
     * @throws SQLException   the sql exception
     * @throws ParseException the parse exception
     */
    @FXML
    void validateCredential(ActionEvent event) throws IOException, SQLException, ParseException {

        DatabaseConn db = new DatabaseConn();
        ArrayList<AuthentificatedUser> listUser;
        listUser = db.getUser();

        for (AuthentificatedUser user:listUser) {
            if (TFemailinput.getText().equals(user.getEmail()) && TFpasswordinput.getText().equals(user.getPassword()) && user.getType() == 5){
                FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("ece/fr/View/FrameAdmin.fxml"));
                Parent home = loader.load();
                Admin adminController = loader.getController();
                adminController.imageinitialize();
                adminController.movieinitialize();
                adminController.sessioninitialize();
                Scene scene = new Scene(home);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
                break;
            }else if(TFemailinput.getText().equals(user.getEmail()) && TFpasswordinput.getText().equals(user.getPassword())){
                FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("ece/fr/View/FrameAccueil.fxml"));
                Parent home = loader.load();
                Accueil accueilController = loader.getController();
                accueilController.transferUser(user);
                Scene scene = new Scene(home);
                Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                appStage.setScene(scene);
                appStage.show();
                break;
            }
        }
        LAerrormessage.setText("ERROR : Bad email or password");
    }

    /**
     * Quit application.
     *
     * @param event the event
     */
    @FXML
    void quitApplication(ActionEvent event) {
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FileInputStream inputstream = null;
        try {
            inputstream = new FileInputStream("Ressources/undraw_movie_night_fldd.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image cinema = new Image(inputstream);
        IVimageaccueil.setImage(cinema);
    }
}
