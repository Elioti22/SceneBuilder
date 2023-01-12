package com.example.scenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader0 = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene0 = new Scene(fxmlLoader0.load(), 629, 783);
        stage.setTitle("Chargement ...");
        stage.setScene(scene0);
        stage.show();

    }




    public static void main(String[] args) {
        launch();
    }
}