package com.nanyue.cpchelper;

import com.nanyue.cpchelper.views.TestView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 重新springboot主启动类
 */
@SpringBootApplication
public class CpchelperApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        //SpringApplication.run(CpchelperApplication.class, args);
        launch(CpchelperApplication.class, TestView.class,args);
    }

    /**
     * 创建窗口视图前回调函数
     * @param stage
     * @param ctx
     */
    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        //stage.initStyle(StageStyle.TRANSPARENT);
        //stage.setMaximized(true);
        super.beforeInitialView(stage, ctx);
    }
}
