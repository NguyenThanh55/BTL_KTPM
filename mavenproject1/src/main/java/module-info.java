module com.ntt.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ntt.mavenproject1 to javafx.fxml;
    exports com.ntt.mavenproject1;
}
