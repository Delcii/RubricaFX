package com.example.rubricagrafica;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class RubricaController {

    @FXML
    private TextField Nome,Cognome,Telefono,Mail,Citta,Cap,Nazione,Indirizzo,Cerca;

    @FXML
    private ListView Dati;

    @FXML
    private void AggiungiClick() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("contatto.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Login");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}