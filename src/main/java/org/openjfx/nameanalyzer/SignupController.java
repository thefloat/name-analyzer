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

public class SignupController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    protected void handleSignupAction(ActionEvent event) {
        // Add signup logic here
    }

    @FXML
    protected void handleBackToLoginAction(ActionEvent event) throws IOException {
        // Load login.fxml
        App.setRoot("login");
    }
}
