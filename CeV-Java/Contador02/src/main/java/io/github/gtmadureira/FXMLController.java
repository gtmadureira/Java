package io.github.gtmadureira;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblContagem;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        int cc = 1;
        String contagem = "";

        while (cc<=12) {
            contagem += cc + " ";
            cc++;
        }

        lblContagem.setText(contagem);

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // todo
    }    
}
