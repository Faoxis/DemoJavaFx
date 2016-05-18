package com.faoxis.javafx.book1.chapter35;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Sergei on 18.05.2016.
 */
public class ButtonImageDemo extends Application  {
    private Label response;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Use Images with Buttons");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 200, 450);
        primaryStage.setScene(scene);

        response = new Label("Push a Button");

        ImageView imageView1 = new ImageView("file:./img/hourglass.jpg");
        imageView1.setFitHeight(150);
        imageView1.setFitWidth(150);
        Button btnHourglass = new Button("Hourglass", imageView1);


        ImageView imageView2 = new ImageView("file:./img/analogclock_.gif");
        imageView2.setFitHeight(150);
        imageView2.setFitWidth(150);
        Button btnAnalogClock = new Button("", imageView2);
        btnAnalogClock.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);


        // Расположить текст под изображением
        btnHourglass.setContentDisplay(ContentDisplay.TOP);
        btnAnalogClock.setContentDisplay(ContentDisplay.TOP);

        btnHourglass.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Hourglass pressed");
            }
        });

        btnAnalogClock.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Analog Clock Pressed");
            }
        });


        rootNode.getChildren().addAll(btnHourglass, btnAnalogClock, response);
        primaryStage.show();
    }

    private String getImagePath(String s) {
        return new File("img/" + s).toURI().toString();
    }
}
