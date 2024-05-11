package week3.chap64.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    private String filename;

    public FileWriterExample(String filename) {
        this.filename = filename;
    }

    public void writeToFile(String message) {
        try {
            FileWriter fileWriter = new FileWriter(filename,true); // FileWriter라는 IOstream 열고
            fileWriter.write(message + "\n"); 
            fileWriter.flush(); // write하면 적어줘야함 
            fileWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
