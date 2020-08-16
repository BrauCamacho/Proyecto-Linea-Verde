/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoale;

import Clases.Menu;
import java.io.IOException;
import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author brau
 */
public class ProyectoAle extends Application {
     LinkedList<Menu> dbMenu; 
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("Inicio.fxml"));
        BorderPane pborder = (BorderPane) lectorPrimario.load();
        InicioController principalCon = lectorPrimario.getController();
        Scene escena = new Scene(pborder);
        dbMenu = new LinkedList<>();
        InicioController inic =  lectorPrimario.getController();
        inic.setDbMenu(dbMenu);
        primaryStage.setScene(escena);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
