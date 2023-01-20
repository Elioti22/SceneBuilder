package com.example.scenebuilder;



import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;


public class HelloController {


    @FXML
    private ImageView cartewonder1;
    @FXML
    private ImageView cartewonder2;
    @FXML
    private ImageView cartewonder3;
    @FXML
    private ImageView cartewonder4;
    @FXML
    private ImageView cartewonder5;
    @FXML
    private ImageView cartewonder6;
    @FXML
    private ImageView cartewonder7;




    public void Baaaw1() {

        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(2), cartewonder1);
        transition1.setToX(200);
        transition1.setToY(320);
        Rotate rotate1 = new Rotate(270);
        cartewonder1.getTransforms().add(rotate1);
        transition1.play();
    }
    public void Baaaw2() {
        TranslateTransition transition2 = new TranslateTransition(Duration.seconds(2), cartewonder2);
        transition2.setToX(200);
        transition2.setToY(320);
        Rotate rotate2 = new Rotate(270);
        cartewonder2.getTransforms().add(rotate2);
        transition2.play();
    }
    public void Baaaw3() {

        TranslateTransition transition3 = new TranslateTransition(Duration.seconds(2), cartewonder3);
        transition3.setToX(200);
        transition3.setToY(320);
        Rotate rotate3 = new Rotate(330);
        cartewonder3.getTransforms().add(rotate3);
        transition3.play();
    }
    public void Baaaw4() {

        TranslateTransition transition4 = new TranslateTransition(Duration.seconds(2), cartewonder4);
        transition4.setToX(200);
        transition4.setToY(320);
        Rotate rotate4 = new Rotate(0);
        cartewonder4.getTransforms().add(rotate4);
        transition4.play();

        TranslateTransition transition5 = new TranslateTransition(Duration.seconds(2), cartewonder5);
        transition5.setToX(200);
        transition5.setToY(320);
        Rotate rotate5 = new Rotate(30);
        cartewonder5.getTransforms().add(rotate5);
        transition5.play();

        TranslateTransition transition6 = new TranslateTransition(Duration.seconds(2), cartewonder6);
        transition6.setToX(200);
        transition6.setToY(320);
        Rotate rotate6 = new Rotate(75);
        cartewonder7.getTransforms().add(rotate6);
        transition6.play();

        TranslateTransition transition7 = new TranslateTransition(Duration.seconds(2), cartewonder7);
        transition7.setToX(200);
        transition7.setToY(320);
        Rotate rotate7 = new Rotate(90);
        cartewonder7.getTransforms().add(rotate7);
        transition7.play();

    }


}