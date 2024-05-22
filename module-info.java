module com.example.inclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inclass to javafx.fxml;
    exports com.example.inclass;
}