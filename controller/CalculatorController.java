package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import model.Calculator;

public class CalculatorController {
    @FXML private TextField display; // Display field in UI
    private final Calculator calculator = new Calculator(); // Model object

    public void onButtonClick(javafx.event.ActionEvent e) {
        Button b = (Button) e.getSource(); // Get which button was clicked
        String text = b.getText(); // Read button text
        switch (text) {
            case "C" -> calculator.clear(); // Clear input
            case "=" -> calculator.evaluate(); // Evaluate expression
            default -> calculator.input(text); // Append digit/operator
        }
        display.setText(calculator.getDisplayText()); // Update UI
    }
}