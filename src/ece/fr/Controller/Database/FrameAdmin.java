package ece.fr.Controller.Database;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class FrameAdmin {

    @FXML
    private TextField TFaddmoviegenreinput;

    @FXML
    private ChoiceBox<?> CBmanagesessionselectmovie;

    @FXML
    private TextField TFaddsessiontimeinput;

    @FXML
    private PieChart PCtow;

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
    private Label LAregular1;

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
    private Button BUaddmovie;

    @FXML
    private DatePicker DPaddsessioninput;

    @FXML
    private Button BUnext;

    @FXML
    private TextField TFaddmovienameinput;

    @FXML
    private Label LAcashregularinput6;

    @FXML
    private Label LAt2;

    @FXML
    private Label LAt1;

    @FXML
    private Label LAt6;

    @FXML
    private Label LAt5;

    @FXML
    private Label LAt4;

    @FXML
    private Label LAt3;

    @FXML
    private TextField TFchildrenpriceinput5;

    @FXML
    private TextField TFchildrenpriceinput4;

    @FXML
    private TextField TFchildrenpriceinput3;

    @FXML
    private TextField TFchildrenpriceinput2;

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
    private Label LAcashguestinput6;

    @FXML
    private Label LAcashguestinput5;

    @FXML
    private TextField TFaddsessionroominput;

    @FXML
    private Label LAcashguestinput4;

    @FXML
    private Label LAcashguestinput3;

    @FXML
    private Label LAcashguestinput2;

    @FXML
    private Label LAcashguestinput1;

    @FXML
    private Label LAguest4;

    @FXML
    private Label LAguest3;

    @FXML
    private Label LAguest6;

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
    private Label LAtiketsoldinput2;

    @FXML
    private Label LAtiketsoldinput5;

    @FXML
    private Label LAtiketsoldinput4;

    @FXML
    private Label LAnextmovieinputroom1;

    @FXML
    private Label LAnextmovieinputroom2;

    @FXML
    private Label LAnextmovieinputroom3;

    @FXML
    private Label LAtiketsoldinput1;

    @FXML
    private Label LAnextmovieinputroom4;

    @FXML
    private Label LAguest2;

    @FXML
    private Label LAguest1;

    @FXML
    private Label LAchildren1;

    @FXML
    private Label LAchildren2;

    @FXML
    private Label LAchildren3;

    @FXML
    private Label LAmanagesessionsolde;

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
    private Label LAcurentmovieinputroom4;

    @FXML
    private Label LAcurentmovieinputroom2;

    @FXML
    private Label LAcurentmovieinputroom1;

    @FXML
    private Label LAtiketsoldeseniorinput5;

    @FXML
    private Label LAtiketsoldeseniorinput6;

    @FXML
    private Label LAtiketsoldeseniorinput3;

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
    private Label LAmanagesessiontime;

    @FXML
    private Label LAcurentmoroom3vieinput;

    @FXML
    private PieChart PCone;

    @FXML
    private Label LAcashseniorinput3;

    @FXML
    private Label LAcashseniorinput2;

    @FXML
    private Label LAcashseniorinput5;

    @FXML
    private Label LAmanagesessionroom;

    @FXML
    private Label LAcashseniorinput4;

    @FXML
    private Label LAcashseniorinput6;

    @FXML
    private Label LAdeletechoosemovieinput;

    @FXML
    private TextField TFregularpriceinput2;

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
    private Label LAtiketsoldechildreninput6;

    @FXML
    private Label LAtiketsoldechildreninput3;

    @FXML
    private Label LAtiketsoldechildreninput2;

    @FXML
    private Label LAmovie6inpout;

    @FXML
    private Label LAtiketsoldechildreninput5;

    @FXML
    private Label LAtiketsoldechildreninput4;

    @FXML
    private Label LAtiketsoldeguestinput4;

    @FXML
    private Label LAtiketsoldeguestinput3;

    @FXML
    private Label LAtiketsoldechildreninput1;

    @FXML
    private Label LAtiketsoldeguestinput6;

    @FXML
    private ChoiceBox<?> CBdeletemovie;

    @FXML
    private Label LAtiketsoldeguestinput5;

    @FXML
    private ImageView IVaddlist3;

    @FXML
    private StackedBarChart<?, ?> SBCone;

    @FXML
    private ImageView IVaddlist2;

    @FXML
    private Label LAmovie5inpout;

    @FXML
    private Label LAselectmovie;

    @FXML
    private Label LAselectedimage;

    @FXML
    private ImageView IVaddlist1;

    @FXML
    private Label LAcashinput1;

    @FXML
    private Button BUaddprevious;

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
    private Button BUdeletemovie;

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
    private Button BUaddnext;

    @FXML
    private Label LAmovie4inpout;

    @FXML
    private Label LAaddsession;

    @FXML
    private Label LAdol52;

    @FXML
    private Label LAseatsinputroom4;

    @FXML
    private Label LAdol51;

    @FXML
    private Label LAdol54;

    @FXML
    private Label LAdol53;

    @FXML
    private Label LAseatsinputroom1;

    @FXML
    private Label LAseatsinputroom3;

    @FXML
    private Label LAdol50;

    @FXML
    private Label LAseatsinputroom2;

    @FXML
    private LineChart<?, ?> LCone;

    @FXML
    private Label LAmovie3inpout;

    @FXML
    private Label LAdol41;

    @FXML
    private Label LAdol40;

    @FXML
    private Label LAdol43;

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
    private Text LAdeletemoviewarning;

    @FXML
    private Label LAaddmovie;

    @FXML
    private Label LAmovie2inpout;

    @FXML
    private Label LAmanagesessiondate;

    @FXML
    private Label LAdol30;

    @FXML
    private Button BUprevious;

    @FXML
    private Label LAdol32;

    @FXML
    private Label LAdol31;

    @FXML
    private Label LAdol34;

    @FXML
    private Label LAdol33;

    @FXML
    private Button BUaddsession;



    @FXML
    void ActioncurrentpermovieBUnext(ActionEvent event) {

    }

    @FXML
    void ActioncurentpermovieBUprevious(ActionEvent event) {

    }

    @FXML
    void c3000021(ActionEvent event) {

    }

    @FXML
    void ActionBUdeletemovie(ActionEvent event) {

    }


    @FXML
    void TFaddmoviedescreptioninput(ActionEvent event) {

    }

    @FXML
    void ActionBUaddprevious(ActionEvent event) {

    }

    @FXML
    void ActionBUaddnext(ActionEvent event) {

    }

    @FXML
    void ActionBUaddmovie(ActionEvent event) {

    }

    @FXML
    void ActionBUaddsession(ActionEvent event) {

    }

}

