/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closestvector;

import java.util.ArrayList;

/**
 *
 * @author ubilecen
 */
public class Point {

    int lineNumber;
    ArrayList<Double> coordinates;

    public Point() {
        this.lineNumber = 0;
        this.coordinates = new ArrayList<>();
    }
       
    
    public Point(int lineNumber, ArrayList<Double> coordinates) {
        this.lineNumber = lineNumber;
        this.coordinates = coordinates;
    }
    
      public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }


    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }
}
