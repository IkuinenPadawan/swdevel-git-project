import java.util.Arrays;
import java.util.Collections;

/**
 * Contains math related utility methods.
 */
class MathUtils {
  
  /**
   * Method to get a random int between two ints.
   * 
   * @param min min, included
   * @param max max, included
   * @return random number between min and max, both included.
   */
  public static int random(int min, int max) {
    return min + (int)(Math.random() * ((max - min) + 1));
  }
  
  /**
   * Method to add two ints together
   * 
   * @param a first int
   * @param b second int
   * @return a + b
   */
  public static int add(int a, int  b) {
    return a + b;
  }

  /**
   * Method to substract two ints from one another
   * 
   * @param a first int
   * @param b second int
   * @return a - b
   */
  public static int sub(int a, int b) {
    return a - b;
  }

  /**
   * Method to sum together all doubles in a double[] array.
   * 
   * @param arr array containing doubles.
   * @return sum of all elements in a double array.
   */
  public static double sum(double[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  /**
   * Method for division calculation
   * 
   * @param a first int
   * @param b second int
   * @return a / b, as a double to preserve decimals
   */
  public static double div(int a, int b) {
    return (a * 1.0) / b;
  }

  /**
   * Method for multiplication calculation
   * 
   * @param a first int
   * @param b second int
   * @return a * b
   */
  public static int mul(int a, int b) {
    return a * b;
  }

  /**
   * Method to get an average of elements in a double array
   * 
   * @param arr array to find avg from
   * @return average number from an array of ints
   */
  public static double avg(double[] arr) {
    double sum = sum(arr);
    int amount = arr.length;
    return (1.0 * sum) / amount;
  }

  /**
   * Method to get the smallest int in an int array
   * 
   * @param arr int array
   * @return smallest number in an int array
   */
  public static int min(int[] arr) {
    Integer[] tmp = intToIntegerArray(arr);
    int min = Collections.min(Arrays.asList(tmp));
    return min;
  }

  /**
   * Method to get biggest number in an int array
   * 
   * @param arr int array
   * @return biggest number in an int array
   */
  public static int max(int[] arr) {
    Integer[] tmp = intToIntegerArray(arr);
    int max = Collections.max(Arrays.asList(tmp));
    return max;
  }

  /**
   * Converts an int array into an Integer array
   * 
   * @param arr int array to be converted
   * @return same array as an Integer array
   */
  public static Integer[] intToIntegerArray(int[] arr) {
    Integer[] integerArr = new Integer[arr.length];

    for (int i = 0; i < arr.length; i++) {
      integerArr[i] = Integer.valueOf(arr[i]);
    }
    return integerArr;
  }

  /**
   * Converts an Integer array to an int array
   * 
   * @param arr Integer array to be converted
   * @return same array as an int array
   */
  public static int[] integerToIntArray(Integer[] arr) {
    int[] intArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      intArr[i] = arr[i].intValue();
    }
    return intArr;
  }

  /**
   * Converts a Double[] to a double[]
   * 
   * @param arr Double[] to be converted
   * @return same array as double[]
   */
  public static double[] nonPrimitiveDoubleToPrimitiveDoubleArray(Double[] arr) {
    double[] doubleArr = new double[arr.length];

    for (int i = 0; i < arr.length; i++) {
      doubleArr[i] = arr[i].doubleValue();
    }
    return doubleArr;
  }

  /**
   * Converts double[] to a Double[]
   * 
   * @param arr double[] to be converted
   * @return same array as Double[].
   */
  public static Double[] primitiveDoubleToNonPrimitiveDoubleArray(double[] arr) {
    Double[] doubleArr = new Double[arr.length];

    for (int i = 0; i < arr.length; i++) {
      doubleArr[i] = Double.valueOf(arr[i]);
    }
    return doubleArr;
  }
}
