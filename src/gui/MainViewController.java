package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("SOBRE");

	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}

}
