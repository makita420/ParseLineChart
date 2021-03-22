/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package linecharttest;

import static java.lang.Math.PI;
import java.text.DecimalFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class FXMLDocumentController {

    private int clicks = 0;
    
    @FXML
    private Button button1;

    @FXML
    private LineChart<String, Number> lineChart;

    @FXML
    private CategoryAxis timeAxis;

    @FXML
    private NumberAxis levelAxis;
    
    @FXML
    private Label labelCoordinates;
    
    @FXML
    private Label tons;
    
    @FXML
    private Label clicksCount;

    @FXML
    void mouseMoved(MouseEvent event) {
        DecimalFormat df = new DecimalFormat("###.#");
        labelCoordinates.setText(timeAxis.getValueForDisplay(event.getX()) + "   " + df.format(levelAxis.getValueForDisplay(event.getY())));
        
       
    }
    
    
      @FXML
    void mouseClickedToTons(MouseEvent event) {
        clicks++;
        
        clicksCount.setText(Integer.toString(clicks));
        
        tons.setText("Один раз clicked");
        
        if(event.getButton().equals(MouseButton.PRIMARY)){
            if(clicks%2 == 0){
                tons.setText("Double click");
            }
        }
        
        
    }
    
    @FXML
    void clicked(ActionEvent event) {
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Сет нейм");
        series1.getData().add(new XYChart.Data<>("кк44444444444444444444кккккккккккккккккк1", 20));
        
        series1.getData().add(new XYChart.Data<>("2", 10));
        
        series1.getData().add(new XYChart.Data<>("3", 13));
        series1.getData().add(new XYChart.Data<>("4", 25));
        series1.getData().add(new XYChart.Data<>("5", 12));
        series1.getData().add(new XYChart.Data<>("6", 20));
        series1.getData().add(new XYChart.Data<>("7", 20));
        series1.getData().add(new XYChart.Data<>("8", 20));
        series1.getData().add(new XYChart.Data<>("9", 20));
        series1.getData().add(new XYChart.Data<>("10", 20));
        series1.getData().add(new XYChart.Data<>("11", 20));
        series1.getData().add(new XYChart.Data<>("15", 21.5));
        
        
        lineChart.getData().add(series1);
    }

}