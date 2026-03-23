import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileHandling {
  public static void main(String[] args) {
    try {
      File file = new File("example.txt");
      if (file.exists()) {
        System.out.println("File exists");
      } else {
        file.createNewFile();
        System.out.println("File created: " + file.getName());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    BufferedWriter writer = null;

    try {
      writer = new BufferedWriter(new FileWriter("example.txt", true));
      // Append text to the file
      writer.write("Hello, this is a test file.");
      writer.newLine();
      writer.write("This file is used for demonstrating file handling in Java.");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      try {
        writer.close();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }  
}
