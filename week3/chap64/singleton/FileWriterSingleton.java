package week3.chap64.singleton;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSingleton {
    // 싱글톤 패턴은 static을 많이 사용한다. 
    private static FileWriterSingleton instance = null; // 처음엔 null. 두번째부터는 재사용 한다. 

    private FileWriter fileWriter;

    public FileWriterSingleton() {
        try {
            this.fileWriter = new FileWriter("exercise/week3/chap64/text.txt"); // 스스로 만들기 
        } catch (IOException e) { // FileWriter는 만들때 IOException 발생할 수 있으므로 
            e.printStackTrace();
        }
        
    }
    // 싱글톤 -> 멀티스레드가 재사용되므로 동기화 문제가 발생할 수 o -> synchronized 동기화처리. 
    public synchronized static FileWriterSingleton getInstance() { // 싱글톤의 핵심 
        if(instance == null){ // null이면 새로만들고 
            instance = new FileWriterSingleton();
        }
        return instance; // null이 아니면 instance를 내보내라
    }
    
    public void writeToFile(String message){
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeFile(){
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}

