import java.util.ArrayList;

/**
 * A simple calculator app for simple calculations.
 * 
 * Asks user for input, and then performs that calculation. Prints previous
 * results in console. User can input additional commands, currently
 * the following are implemented: 'avg', 'sum', 'exit'.
 */
class Calculator {
  final static String EXIT_MSG = "exiting";
  final static String AVG_MSG = "Displaying avg of previous results: ";
  final static String SUM_MSG = "Displaying sum of previous results: ";
  static boolean keepRunning = true;

  public static void main (String[] args) {
    ArrayList<Double> results = new ArrayList<>();
    double result = 0;
    
    System.out.println("Welcome to Calculator! This is a simple calculator app.");
    System.out.println("Supports input in following form: (num) (operator) (num)");
    System.out.println("F. ex. '100 / 50' or '1 + 1'");
    System.out.println("Type 'exit' to quit. Additional commands: 'avg', 'sum'");
    
    while (keepRunning) {
      System.out.println("What would you like to calculate?");
      String input = Util.getInputString();
      String inputResult = handleInput(input);
      
      // Convert ArrayList -> Double[] -> double[]
      Double[] tmp = new Double[results.size()];
      tmp = results.toArray(tmp);
      double[] arr = MathUtils.nonPrimitiveDoubleToPrimitiveDoubleArray(tmp);

      switch (inputResult) {
        case EXIT_MSG:
          keepRunning = false;
          System.out.println(inputResult);
          break;
        case AVG_MSG:
          System.out.println(AVG_MSG + MathUtils.avg(arr));
          break;
        case SUM_MSG:
          System.out.println(SUM_MSG + MathUtils.sum(arr));
          break;
        default:
          result = handleCalculation(splitInput(inputResult));
          results.add(result);
          System.out.println("result: " + result);
          System.out.println("previous results: ");
          System.out.println(results);
      }
    }
  }

  /**
   * Takes in a string input. Depending on the input returns a different string.
   * This method is used to handle commands that the user can execute when
   * running the app.
   * 
   * @param input String to handle.
   * @return If input is a command, returns a string reflecting it, else returns itself.
   * 
   */
  public static String handleInput(String input) {
    String returnString = "";
    switch (input) {
      case "exit":
        returnString = EXIT_MSG;
        break;
      case "avg":
        returnString = AVG_MSG;
        break;
      case "sum":
        returnString = SUM_MSG;
        break;
      default:
        returnString = input;
    }
    return returnString;
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