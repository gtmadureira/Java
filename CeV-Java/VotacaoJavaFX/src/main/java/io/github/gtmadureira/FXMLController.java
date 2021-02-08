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
    private Label lblResultado, lblIdade;
    public TextField txtAno;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {

        int anoNasc = Integer.parseInt(txtAno.getText());
        int idade = 2020 - anoNasc;

        lblIdade.setText("Você tem " + idade + " anos.");

        if (idade < 16) {
            lblResultado.setText("Você não pode votar!");
        }   else if ((idade >= 16 && idade<18) || (idade > 70)) {
                lblResultado.setText("Seu voto é opcional!");
            } else {
                lblResultado.setText("Seu voto é obrigatório!");
            }        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // todo
    }    
}
