package notifier;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage window) {
        Button button = new Button("Update");
        TextField text = new TextField();
        Label label = new Label();
        
        button.setOnAction((event) -> {
            label.setText(text.getText());
        });
        
        VBox layout = new VBox();
        layout.getChildren().add(text);
        layout.getChildren().add(button);
        layout.getChildren().add(label);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

}
