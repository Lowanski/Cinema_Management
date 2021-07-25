package ece.fr.Controller;

import ece.fr.Controller.Database.DatabaseConn;
import ece.fr.Model.Film;
import ece.fr.Model.Session;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javafx.collections.ObservableList;

import static java.lang.Integer.parseInt;

public class Admin {
private int imageconvoyerbell=1;
    @FXML
    private Label LAdol21;

    @FXML
    private Label LAdol20;

    @FXML
    private Label LAdol23;

    @FXML
    private Label LAdol22;

    @FXML
    private Label LAdol24;

    @FXML
    private Label LAcashseniorinput3;

    @FXML
    private Label LAcashseniorinput2;

    @FXML
    private Label LAcashseniorinput5;

    @FXML
    private Label LAcashseniorinput4;

    @FXML
    private Label LAcashseniorinput6;

    @FXML
    private Label LAregular6;

    @FXML
    private Label LAregular5;

    @FXML
    private Label LAregular4;

    @FXML
    private Label LAregular3;

    @FXML
    private Label LAregular2;

    @FXML
    private TextField TFregularpriceinput2;

    @FXML
    private Label LAregular1;

    @FXML
    private TextField TFregularpriceinput1;

    @FXML
    private Label LAtiketsoldeguestinput2;

    @FXML
    private Label LAtiketsoldeguestinput1;

    @FXML
    private TextField TFregularpriceinput6;

    @FXML
    private TextField TFregularpriceinput5;

    @FXML
    private TextField TFregularpriceinput4;

    @FXML
    private TextField TFregularpriceinput3;

    @FXML
    private TextField TFseniorpriceinput6;

    @FXML
    private TextField TFseniorpriceinput5;

    @FXML
    private TextField TFseniorpriceinput4;

    @FXML
    private TextField TFseniorpriceinput3;

    @FXML
    private TextField TFseniorpriceinput2;

    @FXML
    private Label LAticket3;

    @FXML
    private TextField TFseniorpriceinput1;

    @FXML
    private Label LAticket4;

    @FXML
    private Label LAticket1;

    @FXML
    private Label LAdol10;

    @FXML
    private Label LAticket2;

    @FXML
    private Label LAdol12;

    @FXML
    private Label LAdol11;

    @FXML
    private Label LAdol14;

    @FXML
    private Label LAticket5;

    @FXML
    private Label LAdol13;

    @FXML
    private Label LAticket6;

    @FXML
    private Button BUnext;

    @FXML
    private Label LAcashregularinput6;

    @FXML
    private Label LAt2;

    @FXML
    private Label LAt1;

    @FXML
    private Label LAtiketsoldechildreninput6;

    @FXML
    private Label LAtiketsoldechildreninput3;

    @FXML
    private Label LAt6;

    @FXML
    private Label LAtiketsoldechildreninput2;

    @FXML
    private Label LAt5;

    @FXML
    private Label LAmovie6inpout;

    @FXML
    private Label LAt4;

    @FXML
    private Label LAtiketsoldechildreninput5;

    @FXML
    private Label LAt3;

    @FXML
    private Label LAtiketsoldechildreninput4;

    @FXML
    private Label LAtiketsoldeguestinput4;

    @FXML
    private TextField TFchildrenpriceinput5;

    @FXML
    private Label LAtiketsoldeguestinput3;

    @FXML
    private TextField TFchildrenpriceinput4;

    @FXML
    private Label LAtiketsoldechildreninput1;

    @FXML
    private TextField TFchildrenpriceinput3;

    @FXML
    private Label LAtiketsoldeguestinput6;

    @FXML
    private TextField TFchildrenpriceinput2;

    @FXML
    private Label LAtiketsoldeguestinput5;

    @FXML
    private TextField TFchildrenpriceinput6;

    @FXML
    private Label LAtiketsolderegularinput4;

    @FXML
    private Label LAtiketsolderegularinput3;

    @FXML
    private Label LAtiketsolderegularinput6;

    @FXML
    private Label LAtiketsolderegularinput5;

    @FXML
    private TextField TFchildrenpriceinput1;

    @FXML
    private Label LAtiketsolderegularinput2;

    @FXML
    private Label LAtiketsolderegularinput1;

    @FXML
    private Label LAsenior3;

    @FXML
    private Label LAsenior4;

    @FXML
    private Label LAsenior1;

    @FXML
    private Label LAsenior2;

    @FXML
    private Label LAcashregularinput1;

    @FXML
    private Label LAsenior5;

    @FXML
    private Label LAsenior6;

    @FXML
    private Label LAcashregularinput4;

    @FXML
    private Label LAcashregularinput2;

    @FXML
    private Label LAcashregularinput3;

    @FXML
    private Label LAmovie5inpout;

    @FXML
    private Label LAcashguestinput6;

    @FXML
    private Label LAcashguestinput5;

    @FXML
    private Label LAcashguestinput4;

    @FXML
    private Label LAcashguestinput3;

    @FXML
    private Label LAcashguestinput2;

    @FXML
    private Label LAcashguestinput1;

    @FXML
    private Label LAcashinput1;

    @FXML
    private Label LAcashinput4;

    @FXML
    private Label LAdol63;

    @FXML
    private Label LAcashinput5;

    @FXML
    private Label LAdol62;

    @FXML
    private Label LAcashinput2;

    @FXML
    private Label LAcashinput3;

    @FXML
    private Label LAdol64;

    @FXML
    private Label LAmovie1inpout;

    @FXML
    private Label LAcashinput6;

    @FXML
    private TextField TFguestpriceinput2;

    @FXML
    private TextField TFguestpriceinput1;

    @FXML
    private TextField TFguestpriceinput4;

    @FXML
    private TextField TFguestpriceinput3;

    @FXML
    private TextField TFguestpriceinput6;

    @FXML
    private Label LAdol61;

    @FXML
    private TextField TFguestpriceinput5;

    @FXML
    private Label LAdol60;

    @FXML
    private Label LAguest4;

    @FXML
    private Label LAguest3;

    @FXML
    private Label LAguest6;

    @FXML
    private Label LAmovie4inpout;

    @FXML
    private Label LAguest5;

    @FXML
    private Label LAchildren4;

    @FXML
    private Label LAchildren5;

    @FXML
    private Label LAtiketsoldinput6;

    @FXML
    private Label LAchildren6;

    @FXML
    private Label LAtiketsoldinput3;

    @FXML
    private Label LAdol52;

    @FXML
    private Label LAtiketsoldinput2;

    @FXML
    private Label LAdol51;

    @FXML
    private Label LAtiketsoldinput5;

    @FXML
    private Label LAdol54;

    @FXML
    private Label LAtiketsoldinput4;

    @FXML
    private Label LAdol53;

    @FXML
    private Label LAtiketsoldinput1;

    @FXML
    private Label LAguest2;

    @FXML
    private Label LAdol50;

    @FXML
    private Label LAguest1;

    @FXML
    private Label LAmovie3inpout;

    @FXML
    private Label LAdol41;

    @FXML
    private Label LAchildren1;

    @FXML
    private Label LAdol40;

    @FXML
    private Label LAchildren2;

    @FXML
    private Label LAdol43;

    @FXML
    private Label LAchildren3;

    @FXML
    private Label LAdol42;

    @FXML
    private Label LAdol44;

    @FXML
    private Label LAroom4;

    @FXML
    private Label LAroom3;

    @FXML
    private Label LAroom2;

    @FXML
    private Label LAroom1;

    @FXML
    private Label LAcashchildreninput4;

    @FXML
    private Label LAcashchildreninput3;

    @FXML
    private Label LAcashseniorinput1;

    @FXML
    private Label LAcashchildreninput6;

    @FXML
    private Label LAcashchildreninput5;

    @FXML
    private Label LAmovie2inpout;

    @FXML
    private Label LAdol30;

    @FXML
    private Button BUprevious;
    @FXML
    private Button BUdeletesession;
    @FXML
    private Label LAdol32;

    @FXML
    private Label LAtiketsoldeseniorinput5;

    @FXML
    private Label LAdol31;

    @FXML
    private Label LAtiketsoldeseniorinput6;

    @FXML
    private Label LAtiketsoldeseniorinput3;

    @FXML
    private Label LAdol34;

    @FXML
    private Label LAdol33;

    @FXML
    private DatePicker DPreleasedate;

    @FXML
    private DatePicker DPaddsessioninput;

    @FXML
    private Label LAtiketsoldeseniorinput4;

    @FXML
    private Label LAtiketsoldeseniorinput1;

    @FXML
    private Label LAtiketsoldeseniorinput2;

    @FXML
    private Label LAcashchildreninput2;

    @FXML
    private Label LAcashchildreninput1;
    @FXML
    private TextField TFaddmovienameinput;
    @FXML
    private TextField TFaddmoviegenreinput;
    @FXML
    private TextField TFaddmoviedescreptioninput;
    @FXML
    private TextField TFaddsessiontimeinput;
    @FXML
    private TextField TFaddsessionroominput;
    @FXML
    private ImageView IVaddlist1;
    @FXML
    private ImageView IVaddlist2;
    @FXML
    private ImageView IVaddlist3;
    @FXML
    private ChoiceBox CBmanagesessionselectmovie;
    @FXML
    private ChoiceBox CBdeletemovie;
    @FXML
    private ChoiceBox CBsessiondelete;
    @FXML
    private TableView <Integer>TVsession;
    @FXML
    private TableColumn<Integer, String> TVid;
    @FXML
    private TableColumn<Integer, String> TCdate;
    @FXML
    private TableColumn<Integer, String> TVtime;
    @FXML
    private TableColumn<Integer, String> TVroom;
    @FXML
    private TableColumn<Integer, String> TVleft;

    @FXML
    void ActionBUaddmovie(ActionEvent event) throws SQLException, IOException {
        DatabaseConn db = new DatabaseConn();
        ArrayList<Film> listMovies;
        listMovies = db.getFilm();
        ArrayList<String> listlink;
        listlink = db.getImage();
        int isValide = 0;
        for (Film movie : listMovies) {
            if (TFaddmovienameinput.getText().equals(movie.getName())) {
                isValide = 1;
            }
        }
        if (isValide == 1){

        }
        else {
            //A object FILM is created and after add to the data base
            Film newFilm = new Film (isValide ,TFaddmovienameinput.getText(),TFaddmoviegenreinput.getText(),TFaddmoviedescreptioninput.getText(), Date.valueOf(DPreleasedate.getValue()),listlink.get(imageconvoyerbell));
            db.createFilm(newFilm.getName(), newFilm.getGender(), newFilm.getDescription(), newFilm.getPriceChildren(), newFilm.getPriceGuest(), newFilm.getPriceRegular(), newFilm.getPriceSenior(), newFilm.getDate(),Integer.toString(imageconvoyerbell+1));
            movieinitialize();
            imageinitialize();
        }
    }
    @FXML
    public void imageinitialize () throws SQLException {
        imageconvoyerbell =1;
        DatabaseConn db = new DatabaseConn();
        ArrayList<String> listlink;
        listlink = db.getImage();
        ArrayList<Image> listImage = new ArrayList<>();
        for (int i =0;i<3;i++) {

            FileInputStream inputstream = null;
            String link = "Ressources/Films/"+listlink.get(i);
            try {
                inputstream = new FileInputStream(link);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            listImage.add(logo);
        }
        IVaddlist1.setImage(listImage.get(0));
        IVaddlist2.setImage(listImage.get(1));
        IVaddlist3.setImage(listImage.get(2));

    }
    @FXML
    public void movieinitialize () throws SQLException {
        DatabaseConn db = new DatabaseConn();
        ArrayList<Film> films;
        films = db.getFilm();
        CBmanagesessionselectmovie.getItems().clear();
        CBdeletemovie.getItems().clear();
        for (int i = 0; i < films.size(); i++) {
            CBmanagesessionselectmovie.getItems().add(films.get(i));
            CBdeletemovie.getItems().add(films.get(i));
        }
        CBmanagesessionselectmovie.getSelectionModel().select(0);
        CBdeletemovie.getSelectionModel().select(0);
        LAmovie1inpout.setText(films.get(0).getName());
        LAtiketsoldinput1.setText(String.valueOf(db.getticketsold(films.get(0).getID())));
        TFguestpriceinput1.setText(String.valueOf(films.get(0).getPriceGuest()));
        TFchildrenpriceinput1.setText(String.valueOf(films.get(0).getPriceChildren()));
        TFseniorpriceinput1.setText(String.valueOf(films.get(0).getPriceSenior()));
        TFregularpriceinput1.setText(String.valueOf(films.get(0).getPriceRegular()));
    }
    @FXML
    public void sessioninitialize () throws SQLException {
        DatabaseConn db = new DatabaseConn();
        CBsessiondelete.getItems().clear();
        TVsession.getItems().clear();;
        TVsession.getColumns().clear();

        ArrayList<Session> listSession;
        int filmID = 0;
        ArrayList<Film> films;
        films = db.getFilm();
        Object filmname = CBmanagesessionselectmovie.getValue();
        for (int i = 0; i < films.size(); i++) {
            if (filmname.toString().equals(films.get(i).getName())) {
                filmID = films.get(i).getID();
            }
        }
        listSession = db.getListSession(filmID);
        ArrayList<String> id=new ArrayList<>();
        ArrayList<String> date=new ArrayList<>();
        ArrayList<String> time=new ArrayList<>();
        ArrayList<String> room=new ArrayList<>();
        ArrayList<String> place=new ArrayList<>();
        for (int i = 0; i < listSession.size(); i++) {
            CBsessiondelete.getItems().add(listSession.get(i));
            TVsession.getItems().add(i);
            id.add(String.valueOf(listSession.get(i).getIDsession()));
            date.add(listSession.get(i).getDate());
            time.add(listSession.get(i).getTime());
            room.add(String.valueOf(listSession.get(i).getRoom()));
            place.add(String.valueOf(listSession.get(i).getLeftPlaces()));
            //TVsession.setItems(String.valueOf(listSession.get(i).getIDsession()));


            TVid.setCellValueFactory(cellData -> {
                Integer rowIndex = cellData.getValue();
                return new ReadOnlyStringWrapper(id.get(rowIndex));
            });
            TCdate.setCellValueFactory(cellData -> {
                Integer rowIndex = cellData.getValue();
                return new ReadOnlyStringWrapper(date.get(rowIndex));
            });
            TVtime.setCellValueFactory(cellData -> {
                Integer rowIndex = cellData.getValue();
                return new ReadOnlyStringWrapper(time.get(rowIndex));
            });
            TVroom.setCellValueFactory(cellData -> {
                Integer rowIndex = cellData.getValue();
                return new ReadOnlyStringWrapper(room.get(rowIndex));
            });
            TVleft.setCellValueFactory(cellData -> {
                Integer rowIndex = cellData.getValue();
                return new ReadOnlyStringWrapper(place.get(rowIndex));
            });

            TVsession.getColumns().clear();
            TVsession.getColumns().add(TVid);
            TVsession.getColumns().add(TCdate);
            TVsession.getColumns().add(TVtime);
            TVsession.getColumns().add(TVroom);
            TVsession.getColumns().add(TVleft);

            /*
            TVid.s(listSession.get(i).getIDsession());
            TCdate.getColumns().add(listSession.get(i).getDate());
            TVtime.getColumns().add(listSession.get(i).getTime());
            TVroom.getColumns().add(listSession.get(i).getRoom());
            TVleft.getColumns().add(listSession.get(i).getLeftPlaces());

             */
        }
        CBsessiondelete.getSelectionModel().select(0);
        TVsession.setPlaceholder(new Label("No sessions to display"));
    }


    @FXML
    void ActionCBuptadesession(ActionEvent event) throws SQLException {
        sessioninitialize();
    }
    @FXML
    void ActionBUdeletesession(ActionEvent event) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        int sessionID = 0;
        sessionID = parseInt(CBsessiondelete.getValue().toString());
        db.deleteSession(sessionID);
        sessioninitialize();
    }

    @FXML
    void ActionBUaddnext(ActionEvent event) throws SQLException {
        imageconvoyerbell=imageconvoyerbell+1;
        DatabaseConn db = new DatabaseConn();
        ArrayList<String> listlink;
        listlink = db.getImage();
        if (imageconvoyerbell> listlink.size())
            imageconvoyerbell=imageconvoyerbell- listlink.size();
        ArrayList<Image> listImage = new ArrayList<>();
        for (int i =imageconvoyerbell-1;i<imageconvoyerbell+2;i++) {
            int u= i;
            if (u>listlink.size()-1)
                u=u- listlink.size();
            FileInputStream inputstream = null;
            String link = "Ressources/Films/"+listlink.get(u);
            try {
                inputstream = new FileInputStream(link);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            listImage.add(logo);
        }
        IVaddlist1.setImage(listImage.get(0));
        IVaddlist2.setImage(listImage.get(1));
        IVaddlist3.setImage(listImage.get(2));
    }

    @FXML
    void ActionBUaddprevious(ActionEvent event) throws SQLException {
        imageconvoyerbell=imageconvoyerbell-1;
        DatabaseConn db = new DatabaseConn();
        ArrayList<String> listlink;
        listlink = db.getImage();
        if (imageconvoyerbell< 1)
            imageconvoyerbell=imageconvoyerbell+ listlink.size();
        ArrayList<Image> listImage = new ArrayList<>();
        for (int i =imageconvoyerbell-1;i<imageconvoyerbell+2;i++) {
            int u= i;
            if (u>listlink.size()-1)
                u=u- listlink.size();
            FileInputStream inputstream = null;
            String link = "Ressources/Films/"+listlink.get(u);
            try {
                inputstream = new FileInputStream(link);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            assert inputstream != null;
            Image logo = new Image(inputstream);
            listImage.add(logo);
        }
        IVaddlist1.setImage(listImage.get(0));
        IVaddlist2.setImage(listImage.get(1));
        IVaddlist3.setImage(listImage.get(2));

    }

    @FXML
    void ActionBUaddsession(ActionEvent event) throws SQLException {
        Date date = Date.valueOf(DPaddsessioninput.getValue());
        String time = new String(date.toString()+" "+TFaddsessiontimeinput.getText());
        //System.out.println(time);
        DatabaseConn db = new DatabaseConn();
        int isValide = 0;


        if (isValide == 1){

        }
        else {
            Object filmname = CBmanagesessionselectmovie.getValue();
            int filmID=0;
            ArrayList<Film> films;
            films = db.getFilm();
            for(int i = 0; i < films.size(); i++){
                //System.out.println(filmname.toString());
                //System.out.println(films.get(i).getName());
                if (filmname.toString().equals(films.get(i).getName())) {
                    filmID = films.get(i).getID();

                }
            }
            //System.out.println(filmID);

            db.createSession(80, Timestamp.valueOf(time),Integer.valueOf(TFaddsessionroominput.getText()),filmID);
        }
        sessioninitialize();

    }

    @FXML
    void ActionBUdeletemovie(ActionEvent event) throws SQLException {
        DatabaseConn db = new DatabaseConn();
        Object filmname = CBdeletemovie.getValue();
        int filmID=0;
        ArrayList<Film> films;
        films = db.getFilm();
        //Find the correct film ID
        for(int i = 0; i < films.size(); i++){
            if (filmname.toString().equals(films.get(i).getName())) {
                filmID = films.get(i).getID();
            }
        }
        db.deleteMovie(filmID);
        imageinitialize();
        movieinitialize();
        sessioninitialize();

    }

    @FXML
    void ActioncurentpermovieBUprevious(ActionEvent event) {

    }

    @FXML
    void ActioncurrentpermovieBUnext(ActionEvent event) {

    }

    @FXML
    void TFaddmoviedescreptioninput(ActionEvent event) {

    }
}
