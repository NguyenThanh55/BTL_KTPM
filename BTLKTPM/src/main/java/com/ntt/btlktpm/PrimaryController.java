package com.ntt.btlktpm;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;

public class PrimaryController {

//    @FXML
//    private void switchToSecondary() throws IOException {
//        App.setRoot("secondary");
//    }
    
    //File
    public void ActionSeeTourist() throws IOException {
        App.setRoot("list");
    }
  
    public void ActionClose() {
        Platform.exit();
        System.exit(0);
    }
    
    //Edit
    
    //Help
}
