module com.example.escalaposto {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.escalaposto to javafx.fxml;
    exports com.example.escalaposto;
}