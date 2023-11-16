module com.example.helloworldfx {
    requires javafx.fxml;
    requires javafx.controls;


    opens com.example.helloworldfx to javafx.fxml;
    exports com.example.helloworldfx;
}