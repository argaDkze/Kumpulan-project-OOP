module com.mycompany.smartlibrary {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.smartlibrary to javafx.fxml;
    exports com.mycompany.smartlibrary;
}
