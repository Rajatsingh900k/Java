package FileHandling;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class MainSub {
    public static void main(String[] args) {
        /* // create new file
        // File myFile = new File("FileCreated.txt");
        // try {
        //     myFile.createNewFile();
        // } catch (IOException e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
            }*/

        // write to a file
        // try {
        //     FileWriter fw=new FileWriter("FileCreated.txt");
        //     fw.write("This file is created using file writer\n okay now bye");
        //     fw.close();
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println(e.getMessage());
        // }

        // reading a file
        File myfile=new File("FileCreated.txt");
        try {
            
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }   
}
