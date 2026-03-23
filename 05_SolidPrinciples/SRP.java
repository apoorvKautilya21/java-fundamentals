import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Only one responsibility - to log messages
class LoggerSRP {
  public String path;

  LoggerSRP(String path) {
    this.path = path;
  }

  void log(String message) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
      writer.write(message);
      writer.newLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

public class SRP {
  public static void main(String[] args) {
    LoggerSRP logger = new LoggerSRP("app.log");
    logger.log("Application started");
  }
}
