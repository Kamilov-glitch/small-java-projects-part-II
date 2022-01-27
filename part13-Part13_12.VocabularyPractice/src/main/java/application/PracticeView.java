package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PracticeView {
    private Dictionary dict;
    private String word;
    
    public PracticeView(Dictionary dict) {
        this.dict = dict;
        this.word = dict.getRandomWord();
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        
        Button check = new Button("Check");
        TextField textField = new TextField();
        Label suggestion = new Label("Translate the word " + this.word);
        Label feedback = new Label();
        
        layout.add(suggestion, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(check, 0, 2);
        layout.add(feedback, 0, 3);
        
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        check.setOnMouseClicked((event) -> {
            String tr = textField.getText();
            if (!this.dict.get(this.word).equals(tr)) {
                feedback.setText("False, correct answer was " + this.dict.get(this.word) + ".");
                return;
            }
            feedback.setText("Correct, you're doing a good job!");
            this.word = this.dict.getRandomWord();
            suggestion.setText("Translate the word " + this.word);
            textField.clear();
        });
        
        return layout;
    }
}
