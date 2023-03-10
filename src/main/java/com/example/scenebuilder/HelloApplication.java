package com.example.scenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader0 = new FXMLLoader(HelloApplication.class.getResource("plateau7joueurs.fxml"));
        Scene scene0 = new Scene(fxmlLoader0.load(), 960, 1033);
        stage.setTitle("Chargement ...");
        stage.setScene(scene0);
        stage.show();

    }




    public static void main(String[] args) {
        launch();
    }
}