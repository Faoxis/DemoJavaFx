package com.faoxis.javafx.lessons.lesson6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Sergei on 18.05.2016.
 */
public class Main extends Application {
    @Override
    public void start(Stage myStage) {
        BorderPane root = new BorderPane();

        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

        ToggleButton tb1 = new ToggleButton("Green");
        ToggleButton tb2 = new ToggleButton("Blue");
        ToggleButton tb3 = new ToggleButton("Red");

        ToggleGroup group = new ToggleGroup();

        tb1.setToggleGroup(group);
        tb2.setToggleGroup(group);
        tb3.setToggleGroup(group);

        tb1.setUserData(Color.LIGHTGREEN);
        tb2.setUserData(Color.LIGHTBLUE);
        tb3.setUserData(Color.SALMON);


        buttons.getChildren().addAll(tb1, tb2, tb3);

        Rectangle rect = new Rectangle(300, 300);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.DARKGOLDENROD);
        rect.setStrokeWidth(2); // ширина контура
        rect.setArcHeight(50); // округлить края прямоугольника
        rect.setArcWidth(50);


        group.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if(group.getSelectedToggle() != null) {
                ToggleButton tbtn = (ToggleButton) newValue;
                rect.setFill((Color) tbtn.getUserData());
            } else {
                rect.setFill(Color.WHITE);
            }
        });


        tb1.setStyle("-fx-base: lightgreen");
        tb2.setStyle("-fx-base: lightblue");
        tb3.setStyle("-fx-base: salmon");

        tb2.fire();

        root.setTop(buttons);
        root.setCenter(rect);
        Scene scene = new Scene(root, 400, 400);
        myStage.setScene(scene);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
