package io.github.gtmadureira;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblResultado;
    public TextField txtN1, txtN2;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        int n1 = Integer.parseInt(txtN1.getText());
        int n2 = Integer.parseInt(txtN2.getText());
        int s = n1 + n2;
        lblResultado.setText(Integer.toString(s));
        System.out.format("%s + %s = %s \n", 
        Integer.toString(n1), 
        Integer.toString(n2), 
        Integer.toString(s));
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // todo
    }    
}
