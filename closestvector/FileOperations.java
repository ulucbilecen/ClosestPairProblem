/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package closestvector;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ubilecen
 */
public class FileOperations {

    private static String readTextFromFile(String path) {

        String text = "";
        File file = new File(path);

        if (file.exists()) {
            try {
                text = new String(Files.readAllBytes(Paths.get(path)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return text;
    }

    public static boolean writeTextToFile(String text, String fileName) {
        boolean result = false;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(text);
            bw.close();
            result = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static File[] findAllFiles(String location, String extension) {
        File files = new File(location);

        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extension);
            }
        };

        return files.listFiles(filter);
    }
    
    public static String createRandomInput() {
        Random random = new Random();       
        int dimension = random.nextInt(95) + 5;
        int size = random.nextInt(9990) + 10;

        String fileName = "./test/InputFiles/sample_input_" + dimension + "_" + size + ".tsv";

        String output = "";

        for (int i = 0; i < size; i++) {
            String line = "";
            for (int j = 0; j < dimension; j++) {
                line = line + "" + (random.nextDouble() * 20000 - 10000) + "\t";
            }
            output = output + line + "\n";
        }

        if (writeTextToFile(output, fileName)) {
            System.out.println("Successfuly created test file. \n");
        } else {
            System.out.println("Error in creating file.\n");
        }
        
        return fileName;
    }

    public static ArrayList<Point> prepareInputFile(String path) {
        FileReader fr;
        BufferedReader br;
        
        String textFromFile;
        String line;
        int index = 0;
        
        ArrayList<Double> coordinates;
        ArrayList<Point> pointList;

        Point p;
        
        pointList = new ArrayList<Point>();
        

        try {
            
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                coordinates = new ArrayList<>();
                p = new Point();
                String[] lines = line.split("\t");

                for (int i = 0; i < lines.length; i++) {
                    coordinates.add(Double.parseDouble(lines[i]));
                }

                p.setLineNumber(++index);
                p.setCoordinates(coordinates);
                pointList.add(p);
            }
            br.close();

        } catch (Exception ex) {
            //throw ex;
        }

       
        return pointList;
    }
}
