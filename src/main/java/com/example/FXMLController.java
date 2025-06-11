package com.example;
/*
Put header here


 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label lblOut;

    @FXML
    private Label lblCount;

    private int count = 0;
    
    @FXML
    private void btnClickAction(ActionEvent event) {
        lblOut.setText("Hello World!");
    }

    @FXML
    private void btnCount(ActionEvent event) {
        count++;
        lblCount.setText(String.format("%d", count));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
