/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author i2wahid
 */
public class Record {
    // Name of the associated file
    private String filename;
    private static Record instance; //desired singleton object *private access modifier*
    
    //constructor: modified to private access modifier
    private Record(String n) {
        filename = n;
    }
    
    //to create a instance:
    public static Record getInstance(){
        if(instance == null){ //if object not created already then...
            instance = new Record("record.txt"); //create object
        }
        return instance; //otherwise, return the same object created already
    }
    
    // Effects: Reads and prints the contents of the associated
    // file to the standard output.
    public void read() {
        try {
            // Write the code here
            File file = new File(filename); //create file
            Scanner input = new Scanner(file); //open the file for reading
            while(input.hasNextLine()){ //check if there is another line
                System.out.println(input.nextLine()); //read the line and output it to the console
            }
            input.close(); //close the file opened for reading
        }
        
        //if excpetion caught:
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg) {
        try {
            // Write the code here
            FileWriter write = new FileWriter(filename, true); //open the file in writing mode
            write.write(msg); //write the given formal parameter 'msg' in the file opened
            write.close(); //close the file opened for writing
        }
        
        //if exception caught:
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    //main method:
    public static void main(String[] args) {
        // Fill the blank below that obtains the sole instance
        // of the Record class.
        // (You should not invoke the Record constructor here.)
        Record r = Record.getInstance(); //ONE object is created by calling the getInstance() method through the class, since that method is a static method
        
        // Do not modify the code below
        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " + "contains the following lines:");
        r.read();
    }
}
