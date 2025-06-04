package com.example.kando.funnyairlinesgui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FunnyAirlinesController implements Initializable {
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // ComboBox
        List<String> comboStrOptions = new ArrayList<>();
        comboStrOptions.add("átlagártól olcsóbbakat");
        comboStrOptions.add("átlagártól drágábbakat");
        ObservableList<String> comboOptions = FXCollections.observableList(comboStrOptions);
        airlineCombo.setItems(comboOptions);
    }
}