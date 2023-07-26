module com.example.techtacticians_pharmacymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.techtacticians_pharmacymanagementsystem to javafx.fxml;
    exports com.example.techtacticians_pharmacymanagementsystem;
}