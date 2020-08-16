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
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author brau
 */
public class InicioController implements Initializable {
    LinkedList<Menu> dbMenu;
    @FXML
    private MenuItem ConsulInvent;
    @FXML
    private MenuItem ConsulMenu;
    @FXML
    private BorderPane border;

    public void setDbMenu(LinkedList<Menu> dbMenu) {
        this.dbMenu = dbMenu;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
        bc.setDbMenu(dbMenu);
        this.border.setCenter(pAnchor);
    }    

    @FXML
    private void AltaMenu(ActionEvent event) {
        this.border.setCenter(null);
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("AltaMenu.fxml"));
        AnchorPane pAnchor= null;
        try{
            pAnchor = (AnchorPane) lectorPrimario.load();
        }catch(IOException e){
            System.out.println("El FXML no se encontro");
        }
        
        AltaMenuController AltaCOn = lectorPrimario.getController();
        AltaCOn.setBorder(border);
        AltaCOn.setDbMenu(dbMenu);
        this.border.setCenter(pAnchor);

    }

    @FXML
    private void BajaMenu(ActionEvent event) {
        this.border.setCenter(null);
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("BajaMenu.fxml"));
        AnchorPane pAnchor= null;
        try{
            pAnchor = (AnchorPane) lectorPrimario.load();
        }catch(IOException e){
            System.out.println("El FXML no se encontro");
        }
        
        BajaMenuController baja = lectorPrimario.getController();
        baja.setBorder(border);
        this.border.setCenter(pAnchor);

    }

    @FXML
    private void ModificarMenu(ActionEvent event) {
        this.border.setCenter(null);
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("ModificarMenu.fxml"));
        AnchorPane pAnchor= null;
        try{
            pAnchor = (AnchorPane) lectorPrimario.load();
        }catch(IOException e){
            System.out.println("El FXML no se encontro");
        }
        
        ModificarMenuController mmc = lectorPrimario.getController();
        mmc.setBorder(border);
        this.border.setCenter(pAnchor);
    }
}
