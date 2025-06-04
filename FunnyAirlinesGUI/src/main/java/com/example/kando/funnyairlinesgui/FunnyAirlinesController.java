package com.example.kando.funnyairlinesgui;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FunnyAirlinesController {
    @FXML public TextField filterField;
    @FXML public ComboBox airlineCombo;
    @FXML public CheckBox bpCheckBox;
    @FXML public RadioButton ascRadio;
    @FXML public RadioButton descRadio;
    @FXML public Button filterButton;
    @FXML public Label countLabel;
    @FXML public Label sumLabel;
    @FXML public Label avgLabel;
    @FXML public TableView flightTable;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}