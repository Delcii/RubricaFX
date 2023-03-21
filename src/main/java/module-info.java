module com.example.rubricagrafica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rubricagrafica to javafx.fxml;
    exports com.example.rubricagrafica;
}