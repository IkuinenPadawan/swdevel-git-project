import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int min = 0;
    System.out.println("Welcome to randomizer! \n Please give a number: ");
    int max = Util.getInputInteger();
    System.out.println("Here's a number between 0 and " + max
       + MathUtils.random(min, max));
  }
}
