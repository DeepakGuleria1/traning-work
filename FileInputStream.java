import java.nio.file.FileStore;
import java.util.*;
import java.io.FileInputStream;
public class IOStream {
    public static void main(String args[]){
        try {
            // represent the path
            FileInputStream input = new FileInputStream("C:\\Users\\deepak\\OneDrive\\Desktop\\input.txt");
            // data inside the file
            System.out.println("Data is the file is given below:");
            // read first bit of data
            int i = input.read();// read() method read single byte from the file
            while(i!=-1){
                System.out.println((char)i);// casting
                // persue to next values also
                i = input.read();
            }
            input.close();// fileinputstream object is closed know;
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
