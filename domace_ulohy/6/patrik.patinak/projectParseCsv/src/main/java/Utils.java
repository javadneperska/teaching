/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Boss
 */
public class Utils {
    
    public Utils()
    {
        //empty constructor
    }
    
    public String scanFileName(){
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        return fileName;
    }
    
    public void printEnterFileName(){
        System.out.println("Enter the name of the file with information :"); 
    };
    
    /*GETS THE FILE FROM SYSTEM DOCUEMNTS BY GIVEN FILE NAME*/
    public String[][] get2dArrayFromFile(String fileName){
        String fName = System.getProperty("user.home") +"\\" + "Documents"+"\\";
        System.out.println("Full Path to the fileName:" + fileName + " " + fName+fileName); 
        String thisLine;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fName+fileName);
            DataInputStream myInput = new DataInputStream(fis);
            List<String[]> lines = new ArrayList<String[]>();
            while ((thisLine = myInput.readLine()) != null) {
                lines.add(thisLine.split(","));
            }


            String[][] array = new String[lines.size()][0];
            lines.toArray(array);

            return array;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

 
}
