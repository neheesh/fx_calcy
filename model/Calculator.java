package model;

import util.ExpressionParser;

public class Calculator {
    private final StringBuilder inputBuilder = new StringBuilder(); // Store raw input
    private String display = ""; // Whats shown in the UI

    public void input(String value) {
        inputBuilder.append(value); // Add user input to builder
        display = inputBuilder.toString(); // Update display string
    }

    public void clear() {
        inputBuilder.setLength(0); // Clear the input
        display = "";
    }

    public void evaluate() {
        try {
            double result = ExpressionParser.evaluate(inputBuilder.toString()); // Parse and evaluate
            display = String.valueOf(result); // Show result
            inputBuilder.setLength(0); // Reset input
            inputBuilder.append(display); // Store result for further operations
        } catch (Exception e) {
            display = "Error"; // Display error on exception
        }
    }

    public String getDisplayText() {
        return display; // Getter for the current display text
    }
}