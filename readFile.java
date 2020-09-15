import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class readFile {
    public static void main(String[] args) {
      try {
        File file_name = new File("our_zoo_.txt");
        if (file_name.createNewFile()) {
          System.out.println("File created: " + file_name.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
  }