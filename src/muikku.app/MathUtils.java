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
}
