package paket;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class Kontrolcu implements Initializable {

    @FXML
    private Slider sldSicaklik;

    @FXML
    private TextField txtFahrenheit;

    @FXML
    private TextField txtCelcius;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	//initialize methodu program baþladýðýnda otomatik olarak çalýþan bir methoddur.
	//The initalize method is run automatically when the program starts.
		sldSicaklik.valueProperty().addListener(new ChangeListener<Number>() {
	//ChangeListener = Holds the values of Slider and changed method is gonna run.
	//ChangeListener = Sliderdaki deðerleri tutuyor ve deðiþtiði anda changed methodu çalýþýyor.
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				double celcius = newValue.doubleValue();
				DecimalFormat formatci = new DecimalFormat("#.##");
				txtCelcius.setText("Celcius: " + formatci.format(celcius));
				double fahrenheit = celcius * 1.8+32;
				txtFahrenheit.setText("Fahrenheit: " + formatci.format(fahrenheit));
			}
		});
		
	}
    
    
    

}
