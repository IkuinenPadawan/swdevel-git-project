class MathQuiz {
  public static void main(String[] args) {
    final String success = "You are absolutely correct! ";
    final String failure = "You are very wrong! ";
    
    boolean keepRunning = true;
    int longestStreak = 0;
    int streak = 0;
    System.out.println("Welcome to MathQuiz! ");
    System.out.println("Press ctrl + c to quit at any time. ");
    while (keepRunning) {
      int answer = generateQuestion();
      int input = Util.getInputInteger();
      String result = (input == answer) ? success : failure;
      if (result.equals(success)) {
        streak++;
      } else {
        if (streak > longestStreak) {
          longestStreak = streak;
        }
        streak = 0;
      }
      System.out.println(result);
    }
    System.out.println("Your longest streak of correct answers was: " + longestStreak);
  }

  private static int generateQuestion() {
    // either no divisions or just round everything to int
    // randomize operator & operands,
    // display as calculation
    // calculate result
    // return result to compare against

    int a = MathUtils.random(1, 10);
    int b = MathUtils.random(1, 10);
    System.out.println("What is the result of " + a + " + " + b + "?");
    return a + b;
  } 
}
