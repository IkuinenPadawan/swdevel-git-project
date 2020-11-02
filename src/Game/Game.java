  
import java.util.Scanner;

public class Game {

    protected Scanner scanner;
      
    public Game() {
      this.scanner = new Scanner(System.in);
    }

    public void start() {
        startingRoom();
    }

    public void startingRoom() {
        System.out.println("You wake up in a dark room feeling groggy. What do you do?");
        System.out.println("  1. Carefully feel yourself around the room to get clues of where you are.");
        System.out.println("  2. Open your eyes");

        int action = Integer.parseInt(scanner.nextLine());

        switch(action) {
          case 1:
            break;

          case 2:
            break;
        }

    }

}