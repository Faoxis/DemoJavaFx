package com.faoxis.javafx.book1.chapter34;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by Sergei on 17.05.2016.
 * Шилд, Java 8 - Полное руководство
 */
public class JavaFXSkel extends Application {
    public static void main(String[] args) {
        System.out.println("Запуск JavaFX-приложения.");

        // JavaFX - приложение запускается через вызов метода launch()
        launch(args);
    }

    // Переопределяем метод init()
    public void init() {
        System.out.println("В теле метода init().");
    }

    // Переопределяем метод start() в котором все и происходит
    public void start (Stage myStage) {
        System.out.println("В теле метода start().");

        // Присвоить заголовок подмосткам
        myStage.setTitle("JavaFX Skeleton.");
        //Скелет JavaFX-приложения


        // Создать корневой узел. В данном случае используется панель поточной компоновки,
        // хотя возможны и другие варианты компоновки
        FlowPane rootNode = new FlowPane();

        // Создать сцену
        Scene myScene = new Scene(rootNode, 600, 400);

        // Установить сцену на подмостках
        myStage.setScene(myScene);

        // Показать подмостки и сцену на них
        myStage.show();
    }


    // переопределить метод stop()
    public void stop() {
        System.out.println("В теле метода stop().");
    }

}
