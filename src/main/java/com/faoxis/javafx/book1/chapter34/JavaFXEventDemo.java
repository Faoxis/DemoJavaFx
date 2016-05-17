package com.faoxis.javafx.book1.chapter34;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by Sergei on 17.05.2016.
 */
public class JavaFXEventDemo extends Application {

    Label response;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage myStage) {
        // присвоить заголовок подмосткам
        myStage.setTitle("Demostrate JavaFX Buttons and Events.");

        // Использовать панель поточно компоновки FlowPane в качестве корневого узла.
        // Установить промежутки мужду элементами управления по горизонтали и вертикали равными 10
        FlowPane rootNode = new FlowPane(10, 10);

        // Выровнять элементы управления по центру сцены
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 100);

        // Установить сцену на подмостках
        myStage.setScene(myScene);

        // создать метку
        response = new Label("Push a Button");

        // создать две экранные кнопки
        Button btnAlpha = new Button("Alpha");
        Button btnBeta = new Button("Beta");

        // Обработать события действия от кнопки Alpha
        btnAlpha.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae){
                response.setText("Alpha was pressed.");
            }
        });

        // Обработать события действия от кнопки Beta
        btnBeta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Beta was pressed.");
            }
        });

        // ввести метку и кнопки в граф сцены
        rootNode.getChildren().addAll(btnAlpha, btnBeta, response);

        // показать подсмотки и сцену на них
        myStage.show();
    }



}
