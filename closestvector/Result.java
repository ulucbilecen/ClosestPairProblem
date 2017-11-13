/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closestvector;

/**
 *
 * @author ubilecen
 */
public class Result {

    Point p1;
    Point p2;

    Double distance;
    Long operationTime;
    String errorMessage;

    public Result() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.distance = 0.0;
        this.operationTime = 0L;
        this.errorMessage ="";
    }

    public Result(Point p1, Point p2, double distance, long operationTime ) {
        this.p1 = p1;
        this.p2 = p2;
        this.distance = distance;
        this.operationTime = operationTime;
    }

    public void setPoint1(Point p1) {
        this.p1 = p1;
    }
    public void setPoint2(Point p2) {
        this.p2 = p2;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public void setTime(long operationTime) {
        this.operationTime = operationTime;
    }    
     public void setError(String error) {
        this.errorMessage = error;
    }
    
    
    @Override
    public String toString() {
        return    "Point 1: "
                + "lineNumber= " + p1.lineNumber
                + " ,coordinates= " + p1.coordinates + "\n"
                + "Point 2: "
                + "lineNumber= " + p2.lineNumber
                + " ,coordinates= " + p2.coordinates + "\n"
                + "Distance between p1 & p2= " + distance + "\n"
                + "Operation Time: " + operationTime + " miliseconds \n"
                + "Error: " + errorMessage;

    }
}
