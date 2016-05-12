package com.faoxis.javafx.lessons.lesson3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Sergei on 12.05.2016.
 * Изучаем label
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        Label label = new Label(); // метка с текстом
        label.setText("This is a label");


//        Image image = new Image(getClass().getResourceAsStream("1.jpg")); // метка с картинкой
//        ImageView img = new ImageView(image);
//        img.setFitHeight(200);
//        img.setFitWidth(250);

        Label labelImg = new Label();
//        labelImg.setGraphic(img);
        labelImg.setTranslateX(75);
        labelImg.setTranslateY(100);

        labelImg.setText("City");
        labelImg.setGraphicTextGap(20);
        labelImg.setContentDisplay(ContentDisplay.TOP);

        Label magicLabel = new Label();
        magicLabel.setText("This is a MAGIC LABEL!");
        magicLabel.setTranslateX(140);
        magicLabel.setTranslateY(350);

        root.getChildren().addAll(label, labelImg, magicLabel);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
