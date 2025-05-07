# Fx Calcy

A simple calculator desktop app built using JavaFX. It supports basic arithmetic operations and has a clean file structure for better readability and maintainability.

![2025-05-07T21:13:27,844586618+05:30](https://github.com/user-attachments/assets/5bcdc652-fa85-489a-a6d1-731c7493d2ba)

```
fx_calcy
├── app
│   └── Main.java
├── controller
│   └── CalculatorController.java
├── model
│   └── Calculator.java
├── util
│   └── ExpressionParser.java
└── view
    └── CalculatorView.fxml
```

## Why This Structure?

This structure loosely follows the MVVM (Model-View-ViewModel) pattern for separation of UI and the code.

- `model/` - Handles the calculator's state and logic.
- `view/` - Declares the UI layout using FXML.
- `controller/` - Connects the view to the model, handles UI interactions.
- `util/` - Contains reusable utilities. In this case, the expression parser.
- `app/` - Entry point that bootstraps the application and starts the window.

## How it works

- `Main.java` - Loads the FXML and sets the stage.
- `CalculatorView.fxml` - Defines the layout of buttons and display.
- `CalculatorController.java` - Receives events and updates the UI using the Calculator model.
- `Calculator.java` - Collects user input, handles clear/evaluate, and sends expressions to the parser.
- `ExpressionParser.java` - Parses and evaluates math expressions manually.

## Features

- Basic arithmetic like `+`, `-`, `*`, `/`
- Decimal numbers using `.`
- Percentage calculation: `%` (acts as value divided by 100)
- Square root - `√`
- Clear input - `C`
- Evaluate expression - `=`
- Clickable buttons and display text field.

## Requirements

- Java 17.
- JavaFX SDK (with FXML).
- IDE like VS Code or IntelliJ.

## Known Issues

- Does not handle invalid inputs beyond showing a "Error".
- No keyboard input support (only mouse clicks).
