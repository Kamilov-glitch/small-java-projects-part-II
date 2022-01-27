package buttonandlabel;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;


public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        Button button = new Button("Le button");
        Label textComponent = new Label("La friend de la button");
        
        FlowPane group = new FlowPane();
        group.getChildren().add(button);
        group.getChildren().add(textComponent);
        
        Scene scene = new Scene(group);
        window.setScene(scene);
        window.show();
    }

}
