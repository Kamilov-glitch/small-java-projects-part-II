package buttonandtextfield;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
        System.out.println("Hello world!");
    }
    
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        layout.setTop(new TextField("NORTH"));
        layout.setLeft(new Button("la button"));
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }

}
