package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }
    
    public void start(Stage window) {
        // First View
        BorderPane firstLayout = new BorderPane();
        firstLayout.setTop(new Label("First view!"));
        Button first = new Button("To the second view!");
        firstLayout.setCenter(first);
        Scene firstView = new Scene(firstLayout);
        
        // Second view
        VBox secondLayout = new VBox();
        secondLayout.setSpacing(10);
        Button second = new Button("To the third view!");
        secondLayout.getChildren().add(second);
        secondLayout.getChildren().add(new Label("Second view!"));
        Scene secondView = new Scene(secondLayout);
        
        // Third view
        GridPane thirdLayout = new GridPane();
        thirdLayout.add(new Label("Second view!"), 0, 0);
        Button third = new Button("To the first view!");
        thirdLayout.add(third, 1, 1);
        Scene thirdView = new Scene(thirdLayout);
        
        // Switcheroo
        first.setOnAction((event) -> {
            window.setScene(secondView);
        });
        
        second.setOnAction((event) -> {
            window.setScene(thirdView);
        });
        
        third.setOnAction((event) -> {
            window.setScene(firstView);
        });
        
        // set window
        window.setScene(firstView);
        window.show();
    }

}
