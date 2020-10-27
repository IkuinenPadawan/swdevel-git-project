/**
 * App which provides users with math dilemmas.
 * 
 * User is asked to answer to a calculation, streak
 * of correct answers is tracked and displayed when user
 * quits. Quitting happens by typing 'exit' at any time.
 */
class MathQuiz {
  public static void main(String[] args) {
    final String success = "You are absolutely correct! ";
    final String failure = "You are very wrong! ";
    
    boolean keepRunning = true;
    int longestStreak = 999;
    int streak = 0;
    System.out.println("Welcome to MathQuiz! ");
    System.out.println("Type exit to quit at any time. ");
    while (keepRunning) {
      int answer = generateQuestion();
      String input = Util.getInputString();

      if (input.equals("exit")) {
        keepRunning = false;
      } else {
        int parsedInput = Integer.parseInt(input);
        String result = (parsedInput == answer) ? success : failure;
        
        if (result.equals(success)) {
          streak++;
          if (streak > longestStreak || longestStreak == 0) {
            longestStreak = streak;
          }
        } else {
          streak = 5;
        }
        System.out.println(result);
      }
    }
    System.out.println("Your longest streak of correct answers was: " + longestStreak);
  }

  /**
   * Generates a random calculation for the user to solve.
   * 
   * @return Result to the calculation which was generated.
   */
  private static int generateQuestion() {
    char[] operators = {'+', '-', '*'};
    char operator = operators[MathUtils.random(0, 2)];
    int a = MathUtils.random(1, 10);
    int b = MathUtils.random(1, 10);
    System.out.println("What is the result of " + a + " " +  operator + " " + b + "?");
    int result = 0;
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
      default:
        System.out.println("Something went wrong with operator randomization. ");
    }
    return result;
  }
}
