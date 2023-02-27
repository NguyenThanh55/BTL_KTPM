module com.ntt.btlktpm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.ntt.btlktpm to javafx.fxml;
    exports com.ntt.btlktpm;
}
