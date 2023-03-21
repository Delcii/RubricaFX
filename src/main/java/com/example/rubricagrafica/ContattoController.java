package com.example.rubricagrafica;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ContattoController {
    @FXML
    private TextField Nome,Cognome,Telefono,Mail,Citta,Cap,Nazione,Indirizzo;

    @FXML
    private Button Aggiungi;

    public void initialize() {
        Aggiungi.disableProperty().bind(Nome.textProperty().isEmpty() .or(Cognome.textProperty().isEmpty()));
    }
}
