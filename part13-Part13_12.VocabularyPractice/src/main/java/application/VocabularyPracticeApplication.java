package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;


// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    private Dictionary dict;

    public static void main(String[] args) {
        launch(VocabularyPracticeApplication.class);
    }
    
    @Override
    public void init() {
        this.dict = new Dictionary();
    }
    
    @Override
    public void start(Stage window) {
        InputView inputView = new InputView(this.dict);
        PracticeView practiceView = new PracticeView(this.dict);
        
        BorderPane layout = new BorderPane();
        HBox top = new HBox();
        
        Button inputButton = new Button("Enter new Words");
        Button practiceButton = new Button("Practice");
        
        top.getChildren().add(inputButton);
        top.getChildren().add(practiceButton);
        layout.setTop(top);
        
        inputButton.setOnMouseClicked((event) -> {
            layout.setCenter(inputView.getView());
        });
        
        practiceButton.setOnMouseClicked((event) -> {
            layout.setCenter(practiceView.getView());
        });
        
        layout.setCenter(inputView.getView());
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
}
