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
    private Label lblIdade, lblSituacao;
    public TextField txtAno;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        int ano = Integer.parseInt(txtAno.getText());
        int idade = 2020 - ano;
        lblIdade.setText(Integer.toString(idade));
        String sit = ((idade>=16 && idade<18) || (idade>70))?"VOTO OPCIONAL":"DEVE VOTAR";
        lblSituacao.setText(sit);

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // todo
    }    
}
