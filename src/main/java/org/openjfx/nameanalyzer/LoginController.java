package org.openjfx.nameanalyzer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void handleLoginAction(ActionEvent event) throws IOException {
        // Add login logic here

        // On successful login, load home.fxml
        App.setRoot("home");
    }

    @FXML
    protected void handleSignupAction(ActionEvent event) throws IOException {
        // Load signup.fxml
        App.setRoot("signup");
    }
}

