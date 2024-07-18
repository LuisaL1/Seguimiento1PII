package co.edu.cue.s1programacion2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RestauranteController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}