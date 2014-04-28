/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw7;

import java.io.*;
import java.util.LinkedList;

/**
 *
 * @author studhaal
 */
public class SolidFileIO {

    public static Cube[] readSolids(String fileName){
        int number = 1;
        String line;
        File file = new File("C:\\HSLU\\FS14\\PRG2\\Projects\\SW7\\src\\sw7\\"+fileName);
        LinkedList<Cube> list = new LinkedList();
        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("[: ]");

                switch (tokens[0]) {
                    case "C":
                        int s1 = Integer.parseInt(tokens[2]);
                        int s2 = Integer.parseInt(tokens[3]);
                        int s3 = Integer.parseInt(tokens[4]);
                        list.add(new Cube(number, s1, s2, s3));
                        break;
                    default:
                        break;
                }
                number++;
            }
            return list.toArray(new Cube[list.size()]);

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }
}
