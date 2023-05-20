package egghunt.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;



public class Controller {
    @FXML
    public Pane maze;

    @FXML
    private TextField Difficulty_Level;
    @FXML
    private Button btnUp;
    @FXML
    private Button btnLeft;
    @FXML
    private Button btnRun;
    @FXML
    private Button btnRight;
    @FXML
    private Button btnDown;
    @FXML
    private TextField lblSteps;
    @FXML
    private TextField lblEggs;
    @FXML
    private TextField lblKeys;
    @FXML
    private TextField lblTime;
    @FXML
    private Button btnLoad;

    @FXML
    private Button btnSave;
    @FXML
    private Button btnHelp;
    //@FXML
    //private TextField btnquit;
}
