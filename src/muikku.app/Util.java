import java.util.Scanner;

/**
 * Class containing universally useful utility methods.
 */
class Util {
  static Scanner scanner = new Scanner(System.in);

  public static int getInputInteger() {
    return Integer.parseInt(scanner.nextLine());
  }

  public static String getInputString() {
    return scanner.nextLine();
  }
}