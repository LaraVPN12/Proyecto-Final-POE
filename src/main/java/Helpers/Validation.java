
package Helpers;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Validation {
    public static boolean isTextFieldEmpty(TextField textField) {
        boolean res = false;
        if (textField.getText().length() == 0 || textField.getText().isEmpty()) {
            res = true;
        }
        return res;
    }
    
    public static boolean isTextFieldEmpty(TextField textField, Label errorLabel, String errorMessage) {
        boolean res = false;
        String msg = null;
        textField.getStyleClass().remove("error");
        if (isTextFieldEmpty(textField)) {
            msg = errorMessage;
            textField.getStyleClass().add("error");
            res = true;
        }
        errorLabel.setText(msg);
        return res;
    }
     
    public static boolean isNotReMatch(TextField textField, String re, Label errorLabel, String errorMessage) {
        boolean res = false;
        String msg = null;
        textField.getStyleClass().remove("error");
        if (!textField.getText().matches(re)) {
            msg = errorMessage;
            textField.getStyleClass().add("error");
            res = true;
        }
        errorLabel.setText(msg);
        return res;
    }

     public static boolean isComboBoxEmpty(ComboBox comboBox) {
        boolean res = false;
        if (comboBox.getValue() == null) {
            res = true;
        }
        return res;
    }

    public static boolean isComboBoxEmpty(ComboBox comboBox, Label errorLabel, String errorMessage) {
        boolean res = false;
        String msg = null;
        comboBox.getStyleClass().remove("error");
        if (isComboBoxEmpty(comboBox)) {
            msg = errorMessage;
            comboBox.getStyleClass().add("error");
            res = true;
        }
        errorLabel.setText(msg);
        return res;
    }
}
