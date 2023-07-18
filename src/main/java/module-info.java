 module com.example.lawson4950 {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires mysql.connector.java;
    requires java.desktop;
    requires com.google.gson;


    opens com.example.lawson4950 to javafx.fxml;
    exports com.example.lawson4950;
    exports com.example.lawson4950.Controllers;
    exports com.example.lawson4950.Controllers.Admin;
    exports com.example.lawson4950.Controllers.Client;
    exports com.example.lawson4950.Models;
    exports com.example.lawson4950.Views;
    opens com.example.lawson4950.Controllers to javafx.fxml;
}