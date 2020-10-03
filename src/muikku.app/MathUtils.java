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

  public static int min(Integer[] arr) {
    int min = Collections.min(Arrays.asList(arr));
    return min;
  }
}
