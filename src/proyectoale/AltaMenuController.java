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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author brau
 */
public class AltaMenuController implements Initializable {

    @FXML
    private TextField Nombre_Id;
    @FXML
    private TextField Tipo_Id;
    @FXML
    private TextField Precio_id;
    @FXML
    private TextField Descripcion_id;
    @FXML
    private TextField Tamaño_id;
    private BorderPane border;

    public void setBorder(BorderPane border) {
        this.border = border;
    }
    LinkedList<Menu> dbMenu;

    public void setDbMenu(LinkedList<Menu> dbMenu) {
        this.dbMenu = dbMenu;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dbMenu = new LinkedList<>();
    }

    @FXML
    private void Regresar(ActionEvent event) {
        this.border.setCenter(null);
        FXMLLoader lectorPrimario = new FXMLLoader(getClass().getResource("Bienvenido.fxml"));
        AnchorPane pAnchor = null;
        try {
            pAnchor = (AnchorPane) lectorPrimario.load();
        } catch (IOException e) {
            System.out.println("El FXML no se encontro");
        }
        BienvenidoController bc = lectorPrimario.getController();
        bc.setBorder(border);
        bc.setDbMenu(dbMenu);
        this.border.setCenter(pAnchor);

    }

    @FXML
    private void Guardar(ActionEvent event) {
        String Nombre, tipo, precio, descripcion, tamanio;
        Nombre = Nombre_Id.getText();
        tipo = Tipo_Id.getText();
        precio = Precio_id.getText();
        descripcion = Descripcion_id.getText();
        tamanio = Tamaño_id.getText();
        if (validarN(Nombre)) {
            if (validarPrecio(precio)) {
             //  if (validarTamanio(tamanio)) {
                    if (validarTipo(tipo)) {
                        dbMenu.add(new Menu(dbMenu.size(), Nombre, tipo, Double.valueOf(precio), descripcion, tamanio));
                        Nombre_Id.setText("");
                        Tipo_Id.setText("");
                        Precio_id.setText("");
                        Descripcion_id.setText("");
                        Tamaño_id.setText("");
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Cambios guardados con éxito");
                        alert.setHeaderText(null);
                        alert.setContentText("Menu validado");
                        alert.showAndWait();
                        Regresar(event);
                    }
               // }
            }
        }
    }

    public static boolean validarN(String Nombre) {
        boolean b = true;
        if (!Nombre.matches("[A-z]{1,30}")) {
            b = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Nombre no valido");
            alert.setHeaderText(null);
            alert.setContentText("Inserte un nombre valido");
            alert.showAndWait();
        }
        return b;
    }

    public static boolean validarTipo(String Nombre) {
        boolean b = true;
        if (!Nombre.matches("[A-z]{1,30}")) {
            b = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("tipo No valido");
            alert.setHeaderText(null);
            alert.setContentText("Inserte un tipo valido");
            alert.showAndWait();
        }
        return b;
    }

    public static boolean validarPrecio(String Nombre) {
        boolean b = true;
        if (!Nombre.matches("[0-9]{1,}")) {
            b = false;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("precio no valido");
            alert.setHeaderText(null);
            alert.setContentText("Inserte un precio valido");
            alert.showAndWait();
        }
        return b;
    }

    
}
