package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {
    @FXML
    private Label miMensaje;
    public void boton(ActionEvent actionEvent) {
        Random rand = new Random();
        int myrand = rand.nextInt(50)+1;
        miMensaje.setText(Integer.toString(myrand));
        //System.out.println(Integer.toString(myrand));
    }
}
