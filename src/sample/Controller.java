package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnDeleteNote;

    @FXML
    private Button btnNewNote;

    @FXML
    private AnchorPane label1;

    @FXML
    private TextField lblDate;

    @FXML
    private TextField lblName;

    @FXML
    private TextField lblNote;

    @FXML
    private ListView<String> taskList;

    private ObservableList<String> tasks;

    @FXML public void handleMouseClick(MouseEvent arg0) {
        //System.out.println("clicked on " + taskList.getSelectionModel().getSelectedItem());
    }

    @FXML
    void initialize() throws IOException {

        //String[] labelName = {""};
        //String[] labelText = {""};
        //String[] labelDate = {""};

        //Notes notes = new Notes(labelName, labelText, labelDate);

        btnNewNote.setOnAction(e -> addTask());
        btnNewNote.setDefaultButton(true);
        btnDeleteNote.setOnAction(e -> removeTask());

        tasks = FXCollections.observableArrayList();
        taskList.setItems(tasks);

        //FileOutputStream outputStream = new FileOutputStream("M:\\DMITRY\\DEVELOPMENT\\JAVA\\save.ser");
        //ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        //objectOutputStream.writeObject(notes);
        //objectOutputStream.close();

        /*taskList.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("newNotes.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 259, 266);
                    Stage stage = new Stage();
                    stage.setTitle("Note");
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    Logger logger = Logger.getLogger(getClass().getName());
                    logger.log(Level.SEVERE, "Failed to create new Window.", e);
                }
            }
        });*/
    }

    private void addTask() {
        String task = lblName.getText();
        String task2 = lblNote.getText();
        String task3 = lblDate.getText();
        if (!task.isEmpty()&&!task2.isEmpty()&&!task3.isEmpty()) {
            tasks.add(task+": "+task2+" "+"(Дата напоминания: "+task3+")");
        }
    }

    private void removeTask() {
        int selectedIndex = taskList.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            taskList.getItems().remove(selectedIndex);
        }
    }
}