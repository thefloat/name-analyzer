package org.openjfx.nameanalyzer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class HomeController {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private Label resultLabel;

    public void submitName() {
        String firstName = firstNameTextField.getText();
        String apiUrl = "https://api.genderize.io?name=" + firstName;
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                // Parse JSON response
                JSONObject jsonResponse = new JSONObject(response.toString());
                int count = jsonResponse.getInt("count");
                String name = jsonResponse.getString("name");
                String gender = jsonResponse.getString("gender");
                double probability = jsonResponse.getDouble("probability");

                resultLabel.setText("Name: " + name + "\n" +
                        "Count: " + count + "\n" +
                        "Gender: " + gender + "\n" +
                        "Probability: " + probability);
            } else {
                resultLabel.setText("Error: Unable to retrieve gender prediction.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            resultLabel.setText("Error: Unable to retrieve gender prediction.");
        }
    }
}
