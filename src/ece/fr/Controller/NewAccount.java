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
import javafx.scene.control.*;
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

public class NewAccount implements Initializable {
    @FXML
    private ImageView IMpetitlogod;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton RBman;

    @FXML
    private RadioButton RBwomen;

    @FXML
    private TextField TFfirstname;

    @FXML
    private TextField TFname;

    @FXML
    private TextField TFemail;

    @FXML
    private TextField TFpassword;

    @FXML
    private DatePicker TFage;

    @FXML
    private TextField TFcheckpassword;

    @FXML
    private Button BUvalidate;

    @FXML
    private Label LAerror;

    @FXML
    private Button BUback;

    @FXML
    private ImageView IMpetitlogog;

    @FXML
    void goToSignIn(ActionEvent event) throws IOException {
        Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FrameSignIn.fxml")));
        Scene scene = new Scene(home);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(scene);
        appStage.show();
    }

    @FXML
    void validateFormular(ActionEvent event) throws SQLException, IOException {
        DatabaseConn db = new DatabaseConn();
        ArrayList<AuthentificatedUser> listUser;
        listUser = db.getUser();
        int isValide = 0;

        for (AuthentificatedUser user : listUser) {
            if((TFfirstname.getText().equals(user.getFirstName()) && TFname.getText().equals(user.getName())) || TFemail.getText().equals(user.getEmail())){
                isValide++;
            }
        }

        if(TFfirstname.getText().isEmpty() || TFname.getText().isEmpty() || TFage.getValue().toString().isEmpty() || TFemail.getText().isEmpty() || TFpassword.getText().isEmpty() || TFcheckpassword.getText().isEmpty())
            isValide++;

        if (isValide>0){
            LAerror.setText("Email, Firstname, Name already used or blank textfield");
        }else {
            String gender;
            if (RBman.isSelected()){
                gender="M";
            }else {
                gender="W";
            }
            if (TFpassword.getText().equals(TFcheckpassword.getText())){
                if(2021 - TFage.getValue().getYear() < 18){
                    db.createUser(gender,TFfirstname.getText(),TFname.getText(),2021 - TFage.getValue().getYear(),TFemail.getText(),TFpassword.getText(), 1);

                    Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FrameSignIn.fxml")));
                    Scene scene = new Scene(home);
                    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    appStage.setScene(scene);
                    appStage.show();

                }else if(2021-TFage.getValue().getYear() > 60){
                    db.createUser(gender,TFfirstname.getText(),TFname.getText(),2021 - TFage.getValue().getYear(),TFemail.getText(),TFpassword.getText(), 3);

                    Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FrameSignIn.fxml")));
                    Scene scene = new Scene(home);
                    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    appStage.setScene(scene);
                    appStage.show();

                }else {
                    db.createUser(gender,TFfirstname.getText(),TFname.getText(),2021 - TFage.getValue().getYear(),TFemail.getText(),TFpassword.getText(), 2);

                    Parent home = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("ece/fr/View/FrameSignIn.fxml")));
                    Scene scene = new Scene(home);
                    Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    appStage.setScene(scene);
                    appStage.show();
                }
            }
            LAerror.setText("The two emails are not the same");
        }



    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FileInputStream inputstream = null;
        FileInputStream inputstream2 = null;
        try {
            inputstream = new FileInputStream("Ressources/camera.png");
            inputstream2 = new FileInputStream("Ressources/movie-tickets.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert inputstream != null;
        Image camera = new Image(inputstream);
        assert inputstream2 != null;
        Image ticket = new Image(inputstream2);
        IMpetitlogod.setImage(camera);
        IMpetitlogog.setImage(ticket);

    }

}
