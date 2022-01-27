package textstatistics;
import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        HBox texts = new HBox();
        texts.setSpacing(10);
        Label lettersLabel = new Label("Letters: 0");
        texts.getChildren().add(lettersLabel);
        Label wordsLabel = new Label("Words: 0");
        texts.getChildren().add(wordsLabel);
        Label longestLabel = new Label("The longest word is:");
        texts.getChildren().add(longestLabel);
        
        layout.setBottom(texts);
        TextArea textArea = new TextArea();
        layout.setCenter(textArea);
        
        textArea.textProperty().addListener((change, oldval, newval) -> {
            int characters = newval.length();
            String[] parts = newval.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst().get();
            wordsLabel.setText("Words: " + words);
            longestLabel.setText("The longest word is: " + longest);
            lettersLabel.setText("Letters: " + characters);
            
        });
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }

}
