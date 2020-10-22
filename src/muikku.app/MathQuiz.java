class MathQuiz {
  public static void main(String[] args) {
    final String success = "You are absolutely correct! ";
    final String failure = "You are very wrong! "; 

    System.out.println("Welcome to MathQuiz! ");
    int answer = generateQuestion();
    int input = Util.getInputInteger();
    String result = (input == answer) ? success : failure;
    System.out.println(result);
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
