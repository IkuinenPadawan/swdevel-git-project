import java.util.ArrayList;

/**
 * A simple calculator app for simple calculations.
 * 
 * Asks user for input, and then performs that calculation. Prints result
 * in console.
 */
class Calculator {
  public static void main (String[] args) {
    boolean keepRunning = true;
    ArrayList<Double> results = new ArrayList<>();
    
    System.out.println("Welcome to Calculator! This is a simple calculator app.");
    System.out.println("Supports input in following form: (num) (operator) (num)");
    System.out.println("F. ex. '100 / 50' or '1 + 1'");
    System.out.println("Press ctrl + c to quit at any time.");
    
    while (keepRunning) {
      System.out.println("What would you like to calculate?");
      String[] input = splitInput(Util.getInputString());
      double result = handleCalculation(input);
      results.add(result);
      System.out.println("result: " + result);
      System.out.println("previous results: ");
      System.out.println(results);
    }
  }

  //TODO: Implement commands "avg" "sum" and "exit" here
  public static void handleInput() {
    
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

  /**
   * Based on user input which has been taken through splitInput(), finds
   * which method to call from MathUtils to perform the wanted calculation.
   *
   * @param parsedInput User input which has been split into an array
   * @return result of the resulting calculation.
   */
  private static double handleCalculation(String[] parsedInput) {
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