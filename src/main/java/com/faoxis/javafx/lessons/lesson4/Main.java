package com.faoxis.javafx.lessons.lesson4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by Sergei on 12.05.2016.
 * Компонент Button
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        File file = new File("D:\\1.jpg");
        Image image = new Image(file.toURI().toString());
        ImageView img = new ImageView(image);

        img.setFitWidth(40);
        img.setFitHeight(40);


        Button button = new Button();
        button.setText("Click me!");
        button.setGraphic(img);

        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.GREEN);
        shadow.setRadius(40);

        button.setStyle("-fx-base: #b6e7c9");


        button.setOnAction(event -> {
            button.setEffect(shadow);
        });


        root.getChildren().addAll(button);
        Scene scene = new Scene(root, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
