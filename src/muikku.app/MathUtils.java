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
}
