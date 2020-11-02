import java.util.Scanner;

public class Utils {
  /**
   * Method to get user input from command line.
   * 
   * @return user input as a string
   */
  public static String getRawInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}