class MathQuiz {
  public static void main(String[] args) {
    int answer = generateQuestion();
    int input = Util.getInputInteger();
    System.out.println(answer == input);
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
