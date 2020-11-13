module Controller {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires java.base;
    requires java.sql;
    requires jasperreports;
    requires java.desktop;
    
    opens Controller to javafx.fxml;
    exports Controller;
    
    
}
