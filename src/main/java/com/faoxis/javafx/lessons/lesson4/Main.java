package com.faoxis.javafx.lessons.lesson4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by Sergei on 12.05.2016.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        Button button = new Button();
        button.setText("Click me!");

        File file = new File("/home/sergei/1.png");
        Image image = new Image(file.toURI().toString());
        ImageView img = new ImageView(image);

      //  Image image = new Image(getClass().getResourceAsStream("/home/sergei/1.png"));
        //ImageView img = new ImageView(image);
        img.setFitWidth(40);
        img.setFitHeight(40);

        button.setGraphic(img);

        root.getChildren().addAll(button);
        Scene scene = new Scene(root, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
