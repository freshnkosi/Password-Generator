module com.example.passwordgenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;
    requires org.junit.jupiter.api;


    opens com.example.passwordgenerator to javafx.fxml;
    exports com.example.passwordgenerator;
}