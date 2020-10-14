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

  /**
   * Adds an element to an existing array of the same type.
   * 
   * @param arr existing array, can be empty
   * @param d double to add to the array
   * @return array with the new element added to the end
   */
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

    /**
   * Adds an element to an existing array of the same type.
   * 
   * @param arr existing array, can be empty
   * @param d double to add to the array
   * @return array with the new element added to the end
   */
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

  /**
   * Adds an element to an existing array of the same type.
   * 
   * @param arr existing array, can be empty
   * @param x float to add to the array
   * @return array with the new element added to the end
   */
  public static float[] addFloatToFloatArray(float[] arr, float x) {
    float[] tmp = new float[arr.length + 1];

    for (int i = 0; i < tmp.length; i++) {
      if (i == tmp.length - 1) {
        tmp[i] = x;
      } else {
        tmp[i] = arr[i];
      }
    }
    return tmp;
  }

  public static String[] addStringToStringArray(String[] arr, String s) {
    String[] tmp = new String[arr.length + 1];

    for (int i = 0; i < tmp.length; i++) {
      if (i == tmp.length - 1) {
        tmp[i] = s;
      } else {
        tmp[i] = arr[i];
      }
    }
    return tmp;
  }
}