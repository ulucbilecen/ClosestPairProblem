package closestvector;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ubilecen
 */
public class Main {

    public static final String LOCATION = "../test/InputFiles/";
    public static final String TESTLOCATION = "../test/TestCases/";
    public static final String EXTENSION = ".tsv";

    /**
     * @param args the command line arguments
     */
    public static void menuCreator() {
        System.out.println("Welcome Closest Distance Calculator");
        System.out.println("1) Run selected input file");
        System.out.println("2) Run test cases");
        System.out.println("3) Create random file and run");
        System.out.println("0) Exit");

    }
        

    public static void main(String[] args) {
             
        String selectedInputFile = "";
        boolean status = true;
        String readString = "";
        int choice = 0;
        ArrayList<Point> pointList;
        Result result;
        Scanner scanner;
        ClosestPairCalculator cpc;

        pointList = new ArrayList<Point>();
        FileOperations fo = new FileOperations();
        scanner = new Scanner(System.in);

        

        menuCreator();
        readString = scanner.nextLine();

        try {
            if (!readString.equals(null) && !readString.equals("")) {
                choice = Integer.parseInt(readString);
                if (choice == 1) {
                    
                    File[] files = fo.findAllFiles(LOCATION, EXTENSION);
                    
                    for (int i = 0; i < files.length; i++) {
                        System.out.println("(" + (i + 1) + ") file:" + files[i].getName());
                    }

                    System.out.print("Please select input file: ");

                    readString = scanner.nextLine();

                    if (!readString.equals(null) && !readString.equals("")) {
                        choice = Integer.parseInt(readString);
                        if (choice > 0 && choice <= files.length) {
                            selectedInputFile = files[choice - 1].getPath();

                            pointList = fo.prepareInputFile(selectedInputFile);

                            cpc = new ClosestPairCalculator();
                            result = cpc.GetClosestPair(pointList);

                            System.out.println(result.toString());

                        } else {
                            System.out.println("Please select in range." + "1 to " + files.length);
                        }

                    } else {
                        System.out.println("You need to specify a input file ");
                    }
                } else if (choice == 2) {
                    File[] testFiles = fo.findAllFiles(TESTLOCATION, EXTENSION);

                    for (int i = 0; i < testFiles.length; i++) {

                        selectedInputFile = testFiles[i].getPath();
                        pointList = fo.prepareInputFile(selectedInputFile);
                        cpc = new ClosestPairCalculator();
                        result = cpc.GetClosestPair(pointList);
                        System.out.println(result.toString());
                    }

                } else if (choice == 3) {
                    selectedInputFile = fo.createRandomInput();
                    pointList = fo.prepareInputFile(selectedInputFile);

                    cpc = new ClosestPairCalculator();
                    result = cpc.GetClosestPair(pointList);

                    System.out.println(result.toString());

                } else if (choice == 0) {
                    System.exit(0);
                }
            } else {
                System.out.println("Please select an operation");
            }

        } catch (NumberFormatException nfe) {
            System.err.println("Invalid Format!");

        } catch (Exception ex) {
            System.err.println("Try Again");
        }

    }
}
