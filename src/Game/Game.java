  
import java.util.Scanner;

public class Game {

    protected Scanner scanner
      
    public Game() {
      this.scanner = new Scanner(System.in);
    }

    public void start() {
        startingRoom();
    }

    public void startingRoom() {
        System.out.println("You are in a dark room.")
    }

}