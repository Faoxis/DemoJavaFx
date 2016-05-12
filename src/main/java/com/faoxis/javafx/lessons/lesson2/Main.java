package com.faoxis.javafx.lessons.lesson2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Sergei on 12.05.2016.
 * Мекты
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane root = new BorderPane(); // BorderPane располагает элементы аналогично BorderLayout
        VBox vbox = new VBox(10); // Эта панелька размещает элементы по вертикале
        HBox hBox = new HBox(10); // А эта по горизонтале
        hBox.setAlignment(Pos.CENTER);


        Button btn1 = addButton("1");
        Button btn2 = addButton("2");
        Button btn3 = addButton("3");
        Button btn4 = addButton("4");
        Button btn5 = addButton("5");
        Button btn6 = addButton("6");

        vbox.getChildren().addAll(btn1, btn2, btn3);
        hBox.getChildren().addAll(btn4, btn5, btn6);

        root.setTop(hBox);
        root.setLeft(vbox);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button addButton(String name) {
        Button btn = new Button(name);
        btn.setPrefSize(70, 20);
        return btn;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
