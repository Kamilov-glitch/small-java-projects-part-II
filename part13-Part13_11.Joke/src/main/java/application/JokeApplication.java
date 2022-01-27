package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        launch(JokeApplication.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Label question = new Label("What do you call a bear with no teeth?");
        Label answer = new Label("A gummy bear.");
        Label explanation = new Label("bluh bluh");
        Button joke = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explain = new Button("Explanation");
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().add(joke);
        buttons.getChildren().add(answerButton);
        buttons.getChildren().add(explain);
        buttons.setAlignment(Pos.CENTER);
        
        layout.setTop(buttons);
        layout.setCenter(question);
        layout.setPrefSize(400, 200);
        
        joke.setOnAction((event) -> {
            layout.setCenter(question);
        });
        
        answerButton.setOnAction((event) -> {
            layout.setCenter(answer);
        });
        
        explain.setOnAction((event) -> {
            layout.setCenter(explanation);
        });
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
    }
}
