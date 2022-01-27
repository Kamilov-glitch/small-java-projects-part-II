package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class InputView {
    private Dictionary dict;
    
    public InputView(Dictionary dict) {
        this.dict = dict;
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        
        TextField wordField = new TextField();
        TextField trField = new TextField();
        Button button = new Button("Add the word pair");
        
        layout.add(new Label("Word"), 0, 0);
        layout.add(wordField, 0, 1);
        layout.add(new Label("Translation"), 0, 2);
        layout.add(trField, 0, 3);
        layout.add(button, 0, 4);
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10 ,10 ,10));
        
        button.setOnMouseClicked((event) -> {
            String word = wordField.getText();
            String tr = trField.getText();
            this.dict.add(word, tr);
            
            wordField.clear();
            trField.clear();
        });
        
        return layout;
    }
}
