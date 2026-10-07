package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) {
        String original = "Welcome, Chilufya Mwansa!";
        Label message = new Label(original);

        Button startButton = new Button("Start");
        Button resetButton = new Button("Reset");

        startButton.setOnAction(event ->
                message.setText("Great! You clicked the button."));
        resetButton.setOnAction(event ->
                message.setText(original));

        HBox buttons = new HBox(10, startButton, resetButton);
        buttons.setAlignment(Pos.CENTER);

        VBox layout = new VBox(20, message, buttons);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 500, 300);
        stage.setTitle("My First JavaFX Application - 202512269");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}