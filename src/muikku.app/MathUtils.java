import java.util.Arrays;
import java.util.Collections;

class MathUtils {
  public static int random(int min, int max) {
    return min + (int)(Math.random() * ((max - min) + 1));
  }
  
  public static int add(int a, int  b) {
    return a + b;
  }

  public static int sub(int a, int b) {
    return a - b;
  }

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static double div(int a, int b) {
    return (a * 1.0) / b;
  }

  public static int mul(int a, int b) {
    return a * b;
  }

  public static double avg(int[] arr) {
    int sum = sum(arr);
    int amount = arr.length;
    return (1.0 * sum) / amount;
  }

  public static int min(int[] arr) {
    Integer[] tmp = intToIntegerArray(arr);
    int min = Collections.min(Arrays.asList(tmp));
    return min;
  }

  public static int max(int[] arr) {
    Integer[] tmp = intToIntegerArray(arr);
    int max = Collections.max(Arrays.asList(tmp));
    return max;
  }

  private static Integer[] intToIntegerArray(int[] arr) {
    Integer[] integerArr = new Integer[arr.length];

    for (int i = 0; i < arr.length; i++) {
      integerArr[i] = Integer.valueOf(arr[i]);
    }
    return integerArr;
  }

  private static int[] IntegerToIntArray(Integer[] arr) {
    int[] intArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      intArr[i] = arr[i].intValue();
    }
    return intArr;
  }
}
