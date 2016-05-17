package com.faoxis.javafx.lessons.lesson5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;

/**
 * Created by Sergei on 13.05.2016.
 * Изучаем Radio Button
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        HBox buttons = new HBox(10);
        buttons.setAlignment(Pos.CENTER); // выравнивание по центру

        HBox pic = new HBox();
        pic.setAlignment(Pos.CENTER);

        ToggleGroup group = new ToggleGroup(); // Группа для RadioButton'ов

        RadioButton rb1 = new RadioButton("Home");
        RadioButton rb2 = new RadioButton("Work");
        RadioButton rb3 = new RadioButton("Rest");

        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);

        rb1.setUserData("Home");
        rb2.setUserData("Work");
        rb3.setUserData("Rest");

//        ImageView img = new ImageView();

       // System.out.println(this.getClass().getResourceAsStream(String.valueOf(group.getSelectedToggle().getUserData())));
        File fileHome = new File("Home.png");
        File fileRest = new File("Rest.png");
        File fileWork = new File("Work.png");

        Image imgHome = new Image(fileHome.toURI().toString());
        Image imgRest = new Image(fileRest.toURI().toString());
        Image imgWork = new Image(fileWork.toURI().toString());

        ImageView img = new ImageView(imgHome);

        group.selectedToggleProperty().addListener(event -> {
            System.out.println(this.getClass().getResourceAsStream(group.getSelectedToggle().getUserData() + ".png"));
            img.setFitHeight(300);
            img.setFitWidth(300);
        });

        rb2.setSelected(true); // Выбранная кнопка по умолчанию

        buttons.getChildren().addAll(rb1, rb2, rb3);
        pic.getChildren().add(img);
        root.setTop(buttons);
        root.setCenter(pic); // Картинка по центру
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
