package ece.fr.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class NewAccount implements Initializable {
    @FXML
    private ImageView IMpetitlogod;

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
    void validateFormular(ActionEvent event) {
        




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
        Image camera = new Image(inputstream);
        Image ticket = new Image(inputstream2);
        IMpetitlogod.setImage(camera);
        IMpetitlogog.setImage(ticket);

    }
}
