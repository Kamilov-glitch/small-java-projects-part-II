package application;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
        System.out.println("Hellow world! :3");
    }
    
    public void start(Stage window) {
        VBox firstLayout = new VBox();
        Label enterName = new Label("Enter your name and start.");
        TextField nameField = new TextField();
        Button button = new Button("Start");
        firstLayout.setSpacing(10);
        firstLayout.getChildren().add(enterName);
        firstLayout.getChildren().add(nameField);
        firstLayout.getChildren().add(button);
        firstLayout.setAlignment(Pos.CENTER);
        firstLayout.setPrefSize(300, 180);
        Scene first = new Scene(firstLayout);
        
        FlowPane secondLayout = new FlowPane();
        Label greet = new Label("");
        secondLayout.getChildren().add(greet);
        secondLayout.setAlignment(Pos.CENTER);
        secondLayout.setPrefSize(300, 180);
        Scene second = new Scene(secondLayout);
        
        button.setOnAction((event) -> {
            greet.setText("Welcome " + nameField.getText() + "!");
            window.setScene(second);
        });
        
        window.setScene(first);
        window.show();
    }
}
