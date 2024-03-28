module com.example.javafxbase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxbase to javafx.fxml;
    exports com.example.javafxbase;
    exports com.example.javafxbase.userinterface;
    opens com.example.javafxbase.userinterface to javafx.fxml;
}