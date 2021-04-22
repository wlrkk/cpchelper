package com.nanyue.cpchelper.views;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.FXMLView;
import javafx.scene.layout.VBox;

import javax.annotation.PostConstruct;

@FXMLView(value = "/testviews/test.fxml")
public class TestView extends AbstractFxmlView {

    @PostConstruct
    private void init(){
        VBox pane = (VBox) this.getView(); //获取rootNote
        pane.getStylesheets().add("/org/kordamp/bootstrapfx/bootstrapfx.css"); //加入bootstrapfx.css
    }

}
