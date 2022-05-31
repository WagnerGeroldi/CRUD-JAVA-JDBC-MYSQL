package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.entities.Department;

public class DepartmentListController implements Initializable {

	@FXML
	Button btnNewDepartment;

	@FXML
	TableView<Department> tableViewDepartment;

	@FXML
	TableColumn<Department, Integer> tableColumnId;

	@FXML
	TableColumn<Department, String> tableColumnName;
	
	@FXML
	public void onBtnNewAction() {
		System.out.println("clicou botao");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
