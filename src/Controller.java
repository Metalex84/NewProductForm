import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	
	private class Message {
		private final static String fineHeader = "¡Todo en orden";
		private final static String fineText = "El instrumento ha sido dado de alta correctamente";
		private final static String warnHeader = "¡Cuidado!";
		private final static String warnText = "Formulario reiniciado. Vuelve a empezar"; 
	}
	
	private void showAlert(AlertType type, String title, String content) {
		Alert alerta = new Alert(type);
		alerta.setTitle(title);
		alerta.setHeaderText(null);
		alerta.setContentText(content);
		alerta.showAndWait();
	}
	
	
	@FXML
	//private TextField serial;
	
	//Instrument newInstrument = new Instrument();
	//String serialNumber;
	
	public void initialize() {
		
	}
	
	@FXML
	public void buttonConfirm(ActionEvent event) {
//		serialNumber = serial.getText();
//		System.out.println("Correcto!" + serialNumber);
//		newInstrument.setSerial(serialNumber);
		showAlert(AlertType.CONFIRMATION, Message.fineHeader, Message.fineText);		
	}
	
	@FXML
	public void buttonClean(ActionEvent event) {
		showAlert(AlertType.WARNING, Message.warnHeader, Message.warnText);
	}
	
}
