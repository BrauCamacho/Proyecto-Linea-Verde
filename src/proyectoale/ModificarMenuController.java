/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoale;

import Clases.Menu;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author brau
 */
public class ModificarMenuController implements Initializable {
private BorderPane border;
LinkedList<Menu> dbMenu;
    public void setDbMenu(LinkedList<Menu> dbMenu) {
        this.dbMenu = dbMenu;
    }
    public void setBorder(BorderPane border) {
        this.border = border;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

@FXML
    private void Cancelar(ActionEvent event) {
        this.border.setCenter(null);
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("Bienvenido.fxml"));
        AnchorPane pAnchor= null;
        try{
            pAnchor = (AnchorPane) lectorPrimario.load();
        }catch(IOException e){
            System.out.println("El FXML no se encontro");
        }
        BienvenidoController bc = lectorPrimario.getController();
        bc.setBorder(border);
        this.border.setCenter(pAnchor);
    }


    @FXML
    private void Guardar(ActionEvent event) {
    }
    
}
