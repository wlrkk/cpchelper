package com.nanyue.cpchelper.controller;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Window;


import java.io.File;

@FXMLController
public class TestController {

    @FXML
    private Pane rootStage;

    @FXML
    private Label helloLabel;

    @FXML
    private TextField nameField;

     //Be aware: This is a Spring bean. So we can do the following:
//    @Autowired
//    private AwesomeActionService actionService;

    @FXML
    private void setHelloText(final Event event) {
        final String textToBeShown = nameField.getText();
        helloLabel.setText(textToBeShown);
        //打开浏览文件夹
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png"),
                new FileChooser.ExtensionFilter("ZIP", "*.zip")
        );
        fileChooser.setTitle("浏览文件");
        Window window = rootStage.getScene().getWindow();
        File file = fileChooser.showOpenDialog(window);//获取windows
       helloLabel.setText("文件名： " + file.getName() + "， 文件路径： " + file.getAbsolutePath());

    }

}
