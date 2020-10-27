/**
 * App which generates a random number.
 * 
 * This thing asks the user for a number range, and then
 * generates a random number from said range.
 */
class Rng {
  public static void main(String[] args) {
    System.out.println("This dumb app provides you with a random number. ");
    System.out.println("Provide a number range: ");
    System.out.println("min: ");
    int min = Util.getInputInteger();
    System.out.println("max: ");
    int max = Util.getInputInteger();

    System.out.println("Here's your random number: " + MathUtils.random(min + 1, max + 1));
  }
}