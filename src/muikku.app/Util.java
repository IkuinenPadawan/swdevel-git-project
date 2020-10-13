import java.util.Scanner;

class Util {
  static Scanner scanner = new Scanner(System.in);

  public static int getInputInteger() {
    return Integer.parseInt(scanner.nextLine());
  }

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
}