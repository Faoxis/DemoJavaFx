package com.faoxis.javafx.book1.chapter35;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by Sergei on 18.05.2016.
 */
public class LabelImageDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage myStage) {

        // Присвоить заголовок подмосткам
        myStage.setTitle("Use an Image in a Label");

        // Использовать панель поточной компоновки FlowPane в качестве корневого узла
        FlowPane rootNode = new FlowPane();

        // Выполнить выравнивание по центру
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 300);

        // Установить сцену на подмостки
        myStage.setScene(myScene);


        // Создать представление указанного изображения
        ImageView hourglassIV = new ImageView("file:/hourglass.jpg");
        hourglassIV.setFitWidth(150);
        hourglassIV.setFitHeight(200);

        // Создать метку, содержащую изображение и текст
        Label hourglassLabel = new Label("Hourglass", hourglassIV);

        // Расположение картинки относительно всего остального в label
        hourglassLabel.setContentDisplay(ContentDisplay.TOP);

        // Ввести метку в граф сцены
        rootNode.getChildren().add(hourglassLabel);

        // Показать подмостки и сцену на них
        myStage.show();

    }
}
