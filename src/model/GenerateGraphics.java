/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Dimension;
import java.awt.PopupMenu;
import java.io.IOException;
import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;



/**
 *
 * @author Jece Xavier
 */
public class GenerateGraphics {
    //Attributes
    //Constructor
    //My Functions
    private static CategoryDataset createDataSet(ArrayList times){
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        int j = 0;
        
        for (int i = 0; i < times.size(); i++) {
            
            if(j < 100){
                j += 10;
            }else if(j < 1000){
                j += 100;
            }else if(j < 10000){
                j += 1000;
            }else{
                j += 10000;
            }
            
            dataSet.addValue((Number) times.get(i), j, "");
        }
        
        return dataSet;
        
    }
    
    private static JFreeChart createChart(CategoryDataset dataSet, enumSortType method,  enumOrdertype order){
        
        JFreeChart graph = ChartFactory.createBarChart(
                "Tempo de Execução do " + method.getAlgorithm() + " com daos " + order.getOrder(),
                "Quantidade de Elementos", 
                "Tempo (s)", 
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        
        return graph;
    }
    
    public static ChartPanel createGraphic(enumSortType method, enumOrdertype order) throws IOException{
        
        String name  = method.getAlgorithm() + "-" + order;
        
        ArrayList times = ManipulationDirectories.readReport(name);
        
        CategoryDataset dataSet = GenerateGraphics.createDataSet(times);
        
        JFreeChart graph = GenerateGraphics.createChart(dataSet, method, order);
        
        ChartPanel panelGraph = new ChartPanel(graph);
        panelGraph.setPreferredSize(new Dimension(800,800));
        
        return panelGraph;
    }
    
    //Gents and Sets

    public static PopupMenu createGraphic(ArrayList times) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
