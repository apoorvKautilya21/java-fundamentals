import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


class Logger {
  private String path;

  public Logger(String path) {
    this.path = path;
  }

  public void log(String message) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
      writer.write(message);
      writer.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

public class FileHandlingCustomLogger {
  public static void main(String[] args) {
    Logger logger = new Logger("app.log");
    logger.log("Application started again");
  }
}