package lk.ijse.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import lk.ijse.Controller.Client.Client;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class LoggingController implements Initializable {
    @FXML
    private TextField txtUserName;
    public void btnLoggingOnAction(ActionEvent actionEvent) {
        try {
            if (Pattern.matches("^[a-zA-Z\\s]+", txtUserName.getText())) {
                Client client = new Client(txtUserName.getText());

                Thread thread = new Thread(client);
                thread.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

