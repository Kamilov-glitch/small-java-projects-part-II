package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(2006, 2017, 2);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> linechart = new LineChart<>(xAxis, yAxis);
        linechart.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series uoh = new XYChart.Series();
        uoh.setName("University of Helsinki");
        
        uoh.getData().add(new XYChart.Data(2007, 73));
        uoh.getData().add(new XYChart.Data(2008, 68));
        uoh.getData().add(new XYChart.Data(2009, 72));
        uoh.getData().add(new XYChart.Data(2010, 72));
        uoh.getData().add(new XYChart.Data(2011, 74));
        uoh.getData().add(new XYChart.Data(2012, 73));
        uoh.getData().add(new XYChart.Data(2013, 76));
        uoh.getData().add(new XYChart.Data(2014, 73));
        uoh.getData().add(new XYChart.Data(2015, 67));
        uoh.getData().add(new XYChart.Data(2016, 56));
        uoh.getData().add(new XYChart.Data(2017, 56));
        
        linechart.getData().add(uoh);
        
        Scene view = new Scene(linechart, 700,500);
        window.setScene(view);
        window.show();
    }

}
