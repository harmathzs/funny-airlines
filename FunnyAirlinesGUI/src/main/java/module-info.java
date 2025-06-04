module com.example.kando.funnyairlinesgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kando.funnyairlinesgui to javafx.fxml;
    exports com.example.kando.funnyairlinesgui;
}