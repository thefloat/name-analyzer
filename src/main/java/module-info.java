module org.openjfx.nameanalyzer {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires org.json;

    opens org.openjfx.nameanalyzer to javafx.fxml;
    exports org.openjfx.nameanalyzer;
}