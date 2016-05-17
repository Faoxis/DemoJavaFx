package com.faoxis.javafx.book1.chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.File;

import static javafx.application.Application.launch;

/**
 * Created by Sergei on 17.05.2016.
 */
public class ImageDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage myStage) {

        // Присвоить заголовок подмосткам
        myStage.setTitle("Display an Image");

        // Использовать панель поточной компоновки FlowPane в качестве корневого узла
        FlowPane rootNode = new FlowPane();

        // Выполнить выравнивание по центру
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode);

        // Установить сцену на подмостках
        myStage.setScene(myScene);

        // Создать объект изображения
        Image hourglass = new Image("hourglass.jpg");

        // Создать представление этого изображения
        ImageView hourglassIV = new ImageView(hourglass);

        // Ввести изображения в граф сцены
        rootNode.getChildren().addAll(hourglassIV);


        myStage.show();
    }
}
