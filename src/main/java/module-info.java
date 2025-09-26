module shapesapp.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens shapesapp.demo to javafx.fxml;
    exports shapesapp.demo;
}