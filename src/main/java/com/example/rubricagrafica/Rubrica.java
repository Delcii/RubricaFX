package com.example.rubricagrafica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Rubrica {

    public static ArrayList<Contatto> rubrica = new ArrayList<>();

    public static void salva(FileOutputStream file) {
        try {
            ObjectOutputStream salva = new ObjectOutputStream(file);
            salva.writeObject(rubrica);
            salva.flush();
            salva.close();
        } catch (Exception IOException) {
            System.out.println("Errore nel generare il file.");
        }
    }

    public static void carica(FileInputStream file) {
        try {
            ObjectInputStream carica = new ObjectInputStream(file);
            rubrica = (ArrayList<Contatto>) carica.readObject();
        } catch (Exception IOException) {
            System.out.println("file non trovato o permessi mancanti.");
        }
    }
}
