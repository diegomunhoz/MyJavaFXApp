package myjavafxapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Classe responsável por iniciar aplicação web
 * @author Diego Munhoz
 * @since 23/02/2014
 */

public class MyJavaFXApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250);
        
        Button btn = new Button();
        btn.setLayoutX(20);
        btn.setLayoutY(20);
        btn.setText("Hello World");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });
        
        root.getChildren().add(btn);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}//fim da classe