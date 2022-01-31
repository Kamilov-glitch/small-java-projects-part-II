package application;

import java.nio.file.Paths;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        
        try(Scanner scan = new Scanner(Paths.get("partiesdata.tsv"))) {
            
            String[] years = scan.nextLine().split("\t");
            
            while (scan.hasNextLine()) {
                XYChart.Series data = new XYChart.Series();
                String[] line = scan.nextLine().split("\t");
                data.setName(line[0]);
                
                for (int i = 1; i < years.length; i++) {
                    if (line[i].equals("-")) {
                        continue;
                    }
                    int year = Integer.valueOf(years[i]);
                    double percentage = Double.valueOf(line[i]);
                    data.getData().add(new XYChart.Data(year, percentage));
                }
                
                lineChart.getData().add(data);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        Scene view = new Scene(lineChart, 700, 500);
        window.setScene(view);
        window.show();
    }

}
