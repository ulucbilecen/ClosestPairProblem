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
public class ClosestPairCalculator {

    /*
        
     */
    public static Result GetClosestPair(ArrayList<Point> pointList) {

        long startTime = 0L;
        long endTime = 0L;

        Point p1 = null;
        Point p2 = null;
        Result result;

        double distance = Double.MAX_VALUE;
        String error = "";

        startTime = System.currentTimeMillis();

        if (pointList.size() == 2) {
            p1 = pointList.get(0);
            p2 = pointList.get(1);
            distance = distance(p1, p2);

        } else if (pointList.size() < 2) {
            if (pointList.size() == 0) {
                error = "Could not find any point for the calculation.";
            } else {
                error = "At least 2 points needed for calculation.";
            }

        } else {

            for (int i = 0; i < pointList.size() - 1; i++) {
                for (int j = i + 1; j < pointList.size(); j++) {
                    if (checkDimension(pointList.get(i), pointList.get(j))) {

                        double tempDistance = distance(pointList.get(i), pointList.get(j));
                        if (tempDistance < distance) {
                            p1 = pointList.get(i);
                            p2 = pointList.get(j);
                            distance = tempDistance;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

        endTime = System.currentTimeMillis();

        result = new Result();

        if (error.equals("")) {
            result.setPoint1(p1);
            result.setPoint2(p2);
            result.setDistance(distance);
            result.setTime((endTime - startTime));
            result.setError("No Error");
        } else {
            result.setError(error);
        }

        return result;

    }

    private static double distance(Point p1, Point p2) {

        double distance;
        double difference;

        distance = 0;
        difference = 0;

        for (int i = 0; i < p1.coordinates.size(); i++) {
            difference = p1.coordinates.get(i) - p2.coordinates.get(i);
            distance = distance + Math.pow(difference, 2);
        }

        return Math.sqrt(distance);
    }

    private static boolean checkDimension(Point p1, Point p2) {
        boolean status = false;

        if (p1.coordinates.size() == p2.coordinates.size()) {
            status = true;
        } else {
            status = false;
        }

        return status;
    }
}
