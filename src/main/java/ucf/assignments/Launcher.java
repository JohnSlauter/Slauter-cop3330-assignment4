package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 John Slauter
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application{

    private static final String fxml_address = "/fxml/Assignment4UI.fxml";

    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource(fxml_address));

        Scene UI = new Scene(root);

        primaryStage.setTitle("Assignment4");

        primaryStage.setScene(UI);

        primaryStage.show();

    }

}
