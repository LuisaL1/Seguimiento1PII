module co.edu.cue.s1programacion2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.cue.s1programacion2 to javafx.fxml;
    exports co.edu.cue.s1programacion2;
}