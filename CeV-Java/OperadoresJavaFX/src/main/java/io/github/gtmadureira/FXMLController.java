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
    private Label lblDiv, lblRes;
    public TextField txtNum, txtDen;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        float n = Float.parseFloat(txtNum.getText());
        float d = Float.parseFloat(txtDen.getText());
        float div = n / d;
        float res = (float) Math.sqrt(n);
        lblDiv.setText(Float.toString(div));
        lblRes.setText(Float.toString(res));

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // todo
    }    
}
