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

  public static double[] addDoubleToDoubleArray(double[] arr, double d) {
    double[] tmp = new double[arr.length + 1];

    for (int i = 0; i < tmp.length; i++) {
      if (i == tmp.length - 1) {
        tmp[i] = d;
      } else {
        tmp[i] = arr[i];
      }
    }
    return tmp;
  }

  public static int[] addIntToIntArray(int[] arr, int x) {
    int[] tmp = new int[arr.length + 1];

    for (int i = 0; i < tmp.length; i++) {
      if (i == tmp.length - 1) {
        tmp[i] = x;
      } else {
        tmp[i] = arr[i];
      }
    }
    return tmp;
  }
}