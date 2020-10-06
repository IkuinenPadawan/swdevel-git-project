/**
 * A simple calculator app for simple calculations.
 * 
 * Asks user for input, and then performs that calculation. Prints result
 * in console.
 */
class Calculator {
  public static void main (String[] args) {
    System.out.println("Welcome to Calculator! What would you like to calculate?");
    String[] input = splitInput(Util.getInputString());
    double result = handleInput(input);
    System.out.println("result: " + result);
  }

  /**
   * Splits an input string into three pieces and returns them in an array.
   * Input is assumed to be like this "(int) (operator) (int)" f. ex: "10 / 5"
   *
   * @param s the string to be split.
   * @return array containing the split pieces.
   */
  private static String[] splitInput(String s) {
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