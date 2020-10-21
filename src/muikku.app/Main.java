class Main {
  public static void main(String[] args) {
    System.out.println("Yo welcome to this magnificent app! ");
    String input = Util.getInputString();
    appChooser(input, args);
    System.out.println("Bye! ");
  }

  private static void appChooser(String input, String[] args) {
    switch (input) {
      case "rng":
        Rng.main(args);
        break;
      case "calc":
        Calculator.main(args);
        break;
      default:
        System.out.println("try again.");
    }
  }
}
