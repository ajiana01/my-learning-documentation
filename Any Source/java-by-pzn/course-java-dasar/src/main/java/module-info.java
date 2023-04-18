module ajianantaunnes.coursejavadasar {
    requires javafx.controls;
    requires javafx.fxml;


    opens ajianantaunnes.coursejavadasar to javafx.fxml;
    exports ajianantaunnes.coursejavadasar;
}