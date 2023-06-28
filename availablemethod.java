import java.nio.file.FileStore;
import java.util.*;
import java.io.FileInputStream;
public class IOStream {
    public static void main(String args[]) {
        // To check the no. of available bytes we use available method:
        try {
            FileInputStream input = new FileInputStream("C:\\Users\\deepak\\OneDrive\\Desktop\\input.txt");

            System.out.println("No of bytes at beggening:" + input.available());

            // read 2 byte of data
            input.read(); // read only one byte of data
            input.read();
            System.out.println("No of bytes after reading" + input.available());
            input.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }}

