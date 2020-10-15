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

  // TODO: Find a way to do all the below array adding methods with just one method instead.
  // There's some disgusting code duplication going on
}