import java.util.Scanner;

class Calculator {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Calculator! What would you like to calculate?");
    int a = Integer.parseInt(input.nextLine());
    int b = Integer.parseInt(input.nextLine());
    System.out.println("result: " + MathUtils.add(a, b)); 
  }
}