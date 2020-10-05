class Calculator {
  public static void main (String[] args) {
    System.out.println("Welcome to Calculator! What would you like to calculate?");
    String[] input = parseInput(Util.getInputString());
    double result = handleInput(input);
    System.out.println("result: " + result);
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

  private static double handleInput(String[] parsedInput) {
    int a = Integer.parseInt(parsedInput[0]);
    int b = Integer.parseInt(parsedInput[2]);
    char operator = parsedInput[1].charAt(0);
    double result = 0.0;
    switch (operator) {
      case '+':
        result = MathUtils.add(a, b);
        break;
      case '-':
        result = MathUtils.sub(a, b);
        break;
      case '*':
        result = MathUtils.mul(a, b);
        break;
      case '/':
        result = MathUtils.div(a, b);
        break;
      default:
        System.out.println("Something went wrong.");
    }
    return result;
  }
}