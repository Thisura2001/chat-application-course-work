package lk.ijse.Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import lk.ijse.Controller.Client.Client;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    private final String[] emojis = {
            "\uD83D\uDE00", // 😀
            "\uD83D\uDE01", // 😁
            "\uD83D\uDE02", // 😂
            "\uD83D\uDE03", // 🤣
            "\uD83D\uDE04", // 😄
            "\uD83D\uDE05", // 😅
            "\uD83D\uDE06", // 😆
            "\uD83D\uDE07", // 😇
            "\uD83D\uDE08", // 😈
            "\uD83D\uDE09", // 😉
            "\uD83D\uDE0A", // 😊
            "\uD83D\uDE0B", // 😋
            "\uD83D\uDE0C", // 😌
            "\uD83D\uDE0D", // 😍
            "\uD83D\uDE0E", // 😎
            "\uD83D\uDE0F", // 😏
            "\uD83D\uDE10", // 😐
            "\uD83D\uDE11", // 😑
            "\uD83D\uDE12", // 😒
            "\uD83D\uDE13"  // 😓
    };
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
