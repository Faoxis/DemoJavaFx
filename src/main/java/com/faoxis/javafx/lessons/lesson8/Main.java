package com.faoxis.javafx.lessons.lesson8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by Sergei on 18.05.2016.
 */
public class Main extends Application {
    @Override
    public void start(Stage myStage) {

        GridPane root = new GridPane();
        root.setPadding(new Insets(10, 10, 10, 10)); // отступы внутри панели, левый, верхний, нижний правый
        root.setHgap(5); // горизонтальный отступ между строками
        root.setVgap(5); // вертикальный между столбцами

        TextField name = new TextField("Your name");
        GridPane.setConstraints(name, 0, 0);
        root.getChildren().add(name);

        TextField lastName = new TextField();
        GridPane.setConstraints(lastName, 0, 1);
        root.getChildren().add(lastName);

        TextField comment = new TextField();
        comment.setPromptText("Enter your comment");
        GridPane.setConstraints(comment, 0, 2);
        root.getChildren().add(comment);

        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);
        root.getChildren().add(submit);

        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        root.getChildren().add(clear);

        Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        root.getChildren().add(label);

        submit.setOnAction(event -> {
            if (!comment.getText().isEmpty()) {
                label.setText(name.getText() + " " + lastName.getText() + ", " + "thank you for your comment");
            } else  {
                label.setText("You have not left a comment");
            }
        });


        clear.setOnAction(event -> {
            name.clear();
            lastName.clear();
            comment.clear();
            label.setText(null);
        });

        Scene scene = new Scene(root, 400, 400);
        myStage.setScene(scene);
        myStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
