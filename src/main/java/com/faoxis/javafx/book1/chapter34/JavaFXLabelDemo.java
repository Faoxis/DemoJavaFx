package com.faoxis.javafx.book1.chapter34;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by Sergei on 17.05.2016.
 */
public class JavaFXLabelDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    // переопределить метод start()
    public void start(Stage myStage) throws InterruptedException {

        // присвоить заголовок подмосткам
        myStage.setTitle("Demonstrate a JavaFX label.");

        // использовать панель типа FlowPane в качестве корневого узла
        FlowPane rootNode = new FlowPane();

        // создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);

        // установить сцену на подмостки
        myStage.setScene(myScene);

        // Создать метку
        Label myLabel = new Label("This is a JavaFX label");

        // ввести метку в граф сцены
        rootNode.getChildren().add(myLabel);

        // показать подмостки и сцену
        myStage.show();

    }
}
