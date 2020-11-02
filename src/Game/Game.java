public class Game {
    private final String gameName = "SomeCleverGameName";
    private String playerName;
    
    public Game() {

    }

    public void start() {
      introduction();  
      startingRoom();
    }

    private void introduction() {
      System.out.println("Welcome to " + gameName + "!");
      System.out.println("What would you like to be called?: ");
      playerName = Utils.getRawInput();
      System.out.println("Have fun " + playerName + "!");
    }

    private void startingRoom() {
        System.out.println("You wake up in a dark room feeling groggy. What do you do?");
        System.out.println("  1. Carefully feel yourself around the room to get clues of where you are.");
        System.out.println("  2. Open your eyes");

        int action = Integer.parseInt(Utils.getRawInput());

        switch(action) {
          case 1:
            break;

          case 2:
            break;
        }

    }

}