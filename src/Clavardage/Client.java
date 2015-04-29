package Clavardage;

import javafx.application.Application;
import javafx.stage.Stage;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // On démarre la portion graphique de l'application
    public static void main(String[] args) {
        Panneau pan = new Panneau();
        pan.setTitle("Client de clavardage");
        pan.setVisible(true);
    }

}
