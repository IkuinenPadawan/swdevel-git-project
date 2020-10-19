import java.util.Scanner;

/**
 * Class containing universally useful utility methods.
 */
class Util {
  static Scanner scanner = new Scanner(System.in);

  /**
   * Method to ask for user input in console
   * 
   * @return user input as an int
   */
  public static int getInputInteger() {
    return Integer.parseInt(scanner.nextLine());
  }

  /**
   * Method to ask for user input in console
   * 
   * @return user input as a string
   */
  public static String getInputString() {
    return scanner.nextLine();
  }
}