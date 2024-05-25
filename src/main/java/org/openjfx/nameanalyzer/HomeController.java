package org.openjfx.nameanalyzer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {
    @FXML
    private Text welcomeTxt;

    @FXML
    protected void handleLogoutAction(ActionEvent event) throws IOException {
        // Load login.fxml on logout
        App.setRoot("login");
    }
}
