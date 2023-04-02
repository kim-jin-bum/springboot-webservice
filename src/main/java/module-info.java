module com.example.springboot_project {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.springboot_project to javafx.fxml;
    exports com.example.springboot_project;
}