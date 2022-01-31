package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!asdasd");
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        yAxis.setTickUnit(2500);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Savings");

        VBox top = new VBox();

        BorderPane monthly = new BorderPane();
        Label forMonthly = new Label("Monthly savings");
        Slider monthlySlider = new Slider(25, 250, 50);
        monthlySlider.setShowTickMarks(true);
        monthlySlider.setShowTickLabels(true);
        monthlySlider.setSnapToTicks(true);
        monthlySlider.setBlockIncrement(25);
        monthlySlider.setMajorTickUnit(25);
        monthlySlider.setMinorTickCount(0);
        monthlySlider.setMinWidth(550.0);
        monthlySlider.setMaxWidth(550.0);
        monthlySlider.setPrefWidth(550);
        Label monthlySliderNum = new Label("50");
        
        XYChart.Series monthlyData = new XYChart.Series();
        lineChart.getData().add(monthlyData);
        
        monthlySlider.valueProperty().addListener((change, oldval, newval) -> {
            monthlySlider.setValue(newval.intValue());
            monthlySliderNum.setText(newval.toString());
            monthlyData.getData().clear();
            for (int i = 0; i <= 30; i++) {
                monthlyData.getData().add(new XYChart.Data(i, newval.intValue() * 12 * i));
                
                
            }
        });
        monthly.setLeft(forMonthly);
        monthly.setCenter(monthlySlider);
        monthly.setRight(monthlySliderNum);

        BorderPane yearly = new BorderPane();
        Label forYearly = new Label("Yearly interest rate");
        Slider yearlySlider = new Slider(0, 10, 0);
        yearlySlider.setShowTickMarks(true);
        yearlySlider.setShowTickLabels(true);
        yearlySlider.setSnapToTicks(true);
//        yearlySlider.setBlockIncrement(1);
//        yearlySlider.setMajorTickUnit(1);
//        yearlySlider.setMinorTickCount(0);
        yearlySlider.setMinWidth(550.0);
        yearlySlider.setMaxWidth(550.0);
        yearlySlider.setPrefWidth(550);
        Label yearlySliderNum = new Label("0");
        
        XYChart.Series yearlyData = new XYChart.Series();
        lineChart.getData().add(yearlyData);
        
        yearlySlider.valueProperty().addListener((change, oldval, newval) -> {
            yearlySlider.setValue(newval.intValue());
            yearlySliderNum.setText(newval.toString());
            
            yearlyData.getData().clear();
            
            double monthlySaving = monthlySlider.getValue();
            double yearlySaving = 0;
            double previousYearsSum = 0;
            for (int i = 0; i <= 30; i++) {
                yearlySaving = monthlySaving * 12 + previousYearsSum;
                double yearlySavingWithPercentage = yearlySaving + yearlySaving * newval.intValue()/100;
                System.out.println(yearlySavingWithPercentage);
                yearlyData.getData().add(new XYChart.Data(i, yearlySaving));
                previousYearsSum = yearlySavingWithPercentage;
            }
        });
        yearly.setLeft(forYearly);
        yearly.setCenter(yearlySlider);
        yearly.setRight(yearlySliderNum);

        top.getChildren().add(monthly);
        top.getChildren().add(yearly);

        top.setSpacing(10);
        top.setPadding(new Insets(10, 10, 10, 10));

        layout.setTop(top);
        layout.setCenter(lineChart);

        Scene view = new Scene(layout, 800, 600);
        window.setScene(view);
        window.show();
    }

}
