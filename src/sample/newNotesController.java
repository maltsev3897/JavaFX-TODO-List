package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class newNotesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane label2;

    @FXML
    void initialize() throws Exception {
        //FileInputStream fileInputStream = new FileInputStream("M:\\DMITRY\\DEVELOPMENT\\JAVA\\save.ser");
        //ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        //Notes notes = (Notes) objectInputStream.readObject();

        //System.out.println(notes);
    }
}