/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideetimpera.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author lollo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField nome;
    
    @FXML
    private TextField cognome;
    
    @FXML
    private AnchorPane rootPane;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            System.out.println("SONO QUI");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/divideetimpera/view/FXML_Lezioni.fxml"));
            AnchorPane pane = (AnchorPane) loader.load();
            rootPane.getChildren().setAll(pane);
            FXML_LezioniController lezioniController = loader.getController();
            lezioniController.setBenvenuto(nome.getText(), cognome.getText());
            System.out.println("You clicked me!");
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            System.out.println("ERRORE NEL PRENDERE L'FXML, FORSE PERCORSO SBAGLIATO");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
