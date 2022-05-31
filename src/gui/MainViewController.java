package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {

	@FXML
	MenuItem menuItemVendedor;

	@FXML
	MenuItem menuItemDepartamento;

	@FXML
	MenuItem menuItemSobre;

	@FXML
	public void onMenuItemAcaoVendedor() {
		System.out.println("VENDEDOR");
	}

	@FXML
	public void onMenuItemAcaoDepartamento() {
		System.out.println("DEPARTAMENTO");
	}

	@FXML
	public void onMenuItemAcaoSobre() {
		loadView("/gui/about.fxml");

	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}
	
	private void loadView(String absoluteName) {
		try {
			
		FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
		VBox newVbox = loader.load();
		
		Scene mainScene = Main.getMainScene();
		VBox vboxPrincipal = (VBox)((ScrollPane) mainScene.getRoot()).getContent();
		
		Node menuPrincipal = vboxPrincipal.getChildren().get(0);
		vboxPrincipal.getChildren().clear();
		vboxPrincipal.getChildren().add(menuPrincipal);
		vboxPrincipal.getChildren().addAll(newVbox.getChildren());
		
		
		} catch(IOException e) {
			Alerts.showAlert("ERRO DE ENTRADA", "Impossível abrir: " + e.getMessage() , AlertType.WARNING);
		}
	}

}
