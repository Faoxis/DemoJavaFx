package com.faoxis.javafx.book1.chapter35;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by Sergei on 18.05.2016.
 */
public class ToggleButtonDemo extends Application {

    private Label response;
    private ToggleButton tbOnOff;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Demonstrate a Toggle Button");

        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene myScene = new Scene(rootNode, 320, 120);
        primaryStage.setScene(myScene);

        response = new Label("Push the Button");

        tbOnOff = new ToggleButton("On/Off");

        // Обработка событий от переключателя
        tbOnOff.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tbOnOff.isSelected()) response.setText("Button is on.");
                else response.setText("Button is off.");
            }
        });


        rootNode.getChildren().addAll(tbOnOff, response);
        primaryStage.show();
    }
}
