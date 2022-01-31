package smiley;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Canvas paintingCanvas = new Canvas(700, 520);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        painter.setFill(Color.BLACK);
        painter.fillRect(200, 300, 350, 50);
        painter.fillRect(200, 50, 50, 50);
        painter.fillRect(500, 50, 50, 50);
        painter.fillRect(150, 250, 50, 50);
        painter.fillRect(550, 250, 50, 50);
        
        
        layout.setCenter(paintingCanvas);
        Scene view = new Scene(layout, 800, 620, Color.WHITE);
        window.setScene(view);
        window.show();
    }

}
