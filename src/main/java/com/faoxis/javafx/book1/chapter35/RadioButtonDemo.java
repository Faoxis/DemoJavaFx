package com.faoxis.javafx.book1.chapter35;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

/**
 * Created by Sergei on 18.05.2016.
 */
public class RadioButtonDemo extends Application {
    private Label response;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Demonstrate Radio Buttons");
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootNode, 220, 120);
        primaryStage.setScene(scene);

        response = new Label("Hello Hello Hello");

        RadioButton rbTrain = new RadioButton("Train");
        RadioButton rbCar   = new RadioButton("Car");
        RadioButton rbPlane = new RadioButton("Plane");

        ToggleGroup tg = new ToggleGroup();

        rbCar.setToggleGroup(tg);
        rbPlane.setToggleGroup(tg);
        rbTrain.setToggleGroup(tg);

        rbTrain.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Transport selected is train.");
            }
        });

        rbPlane.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Transport selected is plane");
            }
        });

        rbCar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("Transport selected is car");
            }
        });


        /* Альтернативный выбор переключателя не по отдельной кнопке а по всей группу */
        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {

                // Привести новое значение к типу RadioButton
                RadioButton rb = (RadioButton) newValue;

                // Отобразить результат выбора
                response.setText("Transport selected is " + rb.getText());
            }
        });




        // Инициация события от кнопки rbTrain. В итоге переключатель выпадет на нее
        rbTrain.fire();
        rbTrain.setSelected(true);

        rootNode.getChildren().addAll(rbTrain, rbCar, rbPlane, response);
        primaryStage.show();

    }
}
