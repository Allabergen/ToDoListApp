package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML Button addButton;
    @FXML TextField addDescription;
    @FXML DatePicker datePicker;
    @FXML ListView<LocalEvent> eventList;

    ObservableList<LocalEvent> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        datePicker.setValue(LocalDate.now());
    }

    @FXML
    private void addEvent() {
        list.add(new LocalEvent(datePicker.getValue(), addDescription.getText()));
        eventList.setItems(list);
        refresh();
    }

    @FXML
    private void addKeyEvent(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
            addEvent();
        }
    }

    private void refresh() {
        datePicker.setValue(LocalDate.now());
        addDescription.clear();
    }
}
