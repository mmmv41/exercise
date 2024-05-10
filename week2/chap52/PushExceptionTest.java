package week2.chap52;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {
    public static void main(String[] args) {
        try {
            printFile("exercise/week2/chap51/text.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void printFile(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fs = getFileStream(fileName); // 미루기

        int i;
        
        while ((i = fs.read()) != -1){
            System.out.write(i);;
        }
    }

    static FileInputStream getFileStream(String filename) throws FileNotFoundException{ // 미루기
        FileInputStream fs = new FileInputStream(filename);
        
        return fs;
    }
}
