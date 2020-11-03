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
      System.out.println("Have fun " + playerName + "!" + "\n\n\n\n");
    }

    private void startingRoom() {
        System.out.println("You wake up in a dark room feeling groggy and utterly alone. What do you do?");
        System.out.println("  1. Carefully feel yourself around the room to get clues of where you are.");
        System.out.println("  2. Open your eyes");

        int action = Integer.parseInt(Utils.getRawInput());

        switch(action) {
          case 1:
            System.out.println("You fumble about the room. You almost trip on something that makes a metallic noise when you stumble upon it. Air feels chilly. There's a draft. You reach out carefully and finally make contact with a wall of sorts. You feel around. The wall seems to be made out of slabs of stone. Your immediate thought of your whereabouts is a medieval dungeon. Cold chill rund through your body. What the hell has happened? You trace along the wall and reach an opening.");
            System.out.println("  1. Move through the opening.");
            System.out.println("  2. Open your eyes");
            break;

          case 2:
            break;
        }

    }

}