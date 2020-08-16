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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author brau
 */
public class VentaController implements Initializable {

    private LinkedList<Menu> dbMenu;
    private BorderPane border;
    @FXML
    private ComboBox<String> combobox;
    @FXML
    private Label Total;
    @FXML
    private TableView<Menu> Compras;
    private double Costo = 0;

    public void setBorder(BorderPane border) {
        dbMenu = new LinkedList<>();
        this.border = border;
    }

    public void setDbMenu(LinkedList<Menu> dbMenu) {
        this.dbMenu = dbMenu;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TableColumn idColumn = new TableColumn("id");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn NombreColumn = new TableColumn("Nombre");
        NombreColumn.setCellValueFactory(new PropertyValueFactory<>("Nombre"));

        TableColumn tipoColumn = new TableColumn("tipo");
        tipoColumn.setCellValueFactory(new PropertyValueFactory<>("tipo"));

        TableColumn PrecioColumn = new TableColumn("Precio");
        PrecioColumn.setCellValueFactory(new PropertyValueFactory<>("Precio"));

        TableColumn DescripcionColumn = new TableColumn("Descripcion");
        DescripcionColumn.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));

        TableColumn tamanioColumn = new TableColumn("tamaño");
        tamanioColumn.setCellValueFactory(new PropertyValueFactory<>("tamanio"));
        Compras.getColumns().addAll(idColumn, NombreColumn, tipoColumn, PrecioColumn, DescripcionColumn, tamanioColumn);
    }

    @FXML
    private void Comprar(ActionEvent event) {

    }

    @FXML
    private void Cancelar(ActionEvent event) {
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
        this.border.setCenter(pAnchor);
    }

    public void llenarcmb() {
        this.combobox.getItems().clear();
        for (int i = 0; i < dbMenu.size(); i++) {
            this.combobox.getItems().add(this.dbMenu.get(i).getNombre());
        }
    }

    @FXML
    private void enstropical(ActionEvent event) {
        Menu m = new Menu(0, "Tropical", "Comida", 60, "N/A", "N/A");
        Costo += m.getPrecio();
        Total.setText(String.valueOf(Costo));
        Compras.getItems().add(m);
    }

    @FXML
    private void emplinver(ActionEvent event) {
        Menu m = new Menu(1, "Emparedado Linea verde", "Comida", 80, "N/A", "N/A");
        Costo += m.getPrecio();
        Total.setText(String.valueOf(Costo));
        Compras.getItems().add(m);

    }

    @FXML
    private void enscampera(ActionEvent event) {
        Menu m = new Menu(2, "Campera", "Comida", 50, "N/A", "N/A");
        Costo += m.getPrecio();
        Total.setText(String.valueOf(Costo));
        Compras.getItems().add(m);
    }

    @FXML
    private void ensmedite(ActionEvent event) {
        Menu m = new Menu(3, "Mediterranea", "Comida", 70, "N/A", "N/A");
        Costo += m.getPrecio();
        Total.setText(String.valueOf(Costo));
        Compras.getItems().add(m);

    }

    @FXML
    private void enslinver(ActionEvent event) {
        Menu m = new Menu(4, "Ensalada linea verde", "Comida", 100, "N/A", "N/A");
        Costo += m.getPrecio();
        Total.setText(String.valueOf(Costo));
        Compras.getItems().add(m);

    }

    @FXML
    private void ensmilania(ActionEvent event) {
        Menu m = new Menu(5, "Milaña", "Comida", 20, "N/A", "N/A");
        Costo += m.getPrecio();
        Total.setText(String.valueOf(Costo));
        Compras.getItems().add(m);

    }

    @FXML
    private void Borrar(ActionEvent event) {
        int sel = Compras.getSelectionModel().getSelectedIndex();
        if (Compras.getItems().size() > 0) {
            Costo -= Compras.getItems().get(sel).getPrecio();
            Total.setText(String.valueOf(Costo));
            Compras.getItems().remove(sel);
        }
    }

    @FXML
    private void Agregar(ActionEvent event) {
        int indice = -1;
        indice = this.combobox.getSelectionModel().getSelectedIndex();
        System.out.println(indice);
        if (indice != -1) {
        Menu nuevo = dbMenu.get(indice);
        System.out.println(nuevo.toString());
        }
    }

}
