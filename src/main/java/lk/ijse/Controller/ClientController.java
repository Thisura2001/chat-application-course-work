package lk.ijse.Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import lk.ijse.Controller.Client.Client;

public class ClientController {
    @FXML
    private AnchorPane emojiAnchorpane;

    @FXML
    private GridPane emojiGridpane;

    @FXML
    private AnchorPane root;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private JFXTextField txtMsgArea;

    @FXML
    private VBox vBox;

    public void writeMessage(String message) {
    }

    public void setImage(byte[] bytes, String utf) {
    }

    public void setClient(Client client) {
    }

    public void btnImageOnAction(ActionEvent actionEvent) {
    }

    public void btnImojiOnAction(ActionEvent actionEvent) {
    }

    public void btnSendOnAction(ActionEvent actionEvent) {
    }
}
