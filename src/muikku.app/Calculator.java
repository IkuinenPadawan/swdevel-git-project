class Calculator {
  public static void main (String[] args) {
    System.out.println("Welcome to Calculator! What would you like to calculate?");
    String input = Util.getInputString();
    System.out.println("result: " + input);
  }

  private static String[] parseInput(String s) {
    String[] arr = {"", "", ""};
    int index = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        index++;
      } else {
        arr[index] += s.charAt(i);
      }
    }
    return arr;
  }
}