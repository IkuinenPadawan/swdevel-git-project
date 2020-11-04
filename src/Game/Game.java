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
      playerName = askPlayerName();
      System.out.println("What kind of name is that? Well, anyway, have fun " 
                          + playerName + "!" + "\n\n\n\n");
      wait(1000);
      System.out.println("Now, sleep tight. *BONK*");
      wait(1000);
      System.out.println("Life doesn't even have a chance to flash before your"
                         +  "eyes, as you instantly fall unconscious.");               
      wait(2000);
    }
    // Handling long strings in java is a bitch
    private void startingRoom() {
        System.out.println("You wake up in a dark room feeling groggy and" 
                            + "utterly alone. What do you do?");
        System.out.println("  1. Carefully feel yourself around the room to" 
                            + "get clues of where you are.");
        System.out.println("  2. Open your eyes");

        int action = Integer.parseInt(Utils.getRawInput());

        switch(action) {
          case 1:
              System.out.println("You fumble about the room. You almost trip" 
                              + "on something that makes a metallic noise" 
                              + "when you stumble upon it. Air feels chilly." 
                              + "There's a draft. You reach out carefully"
                              + "and finally make contact with a wall of" 
                              + "sorts. You feel around. The wall seems to" 
                              + "be made out of slabs of stone. Your" 
                              + "immediate thought of your whereabouts is" 
                              + "a medieval dungeon. Cold chill rund" 
                              + "through your body. What the hell has" 
                              + "happened? You trace along the wall and" 
                              + "reach an opening.");

              System.out.println("  1. Move through the opening.");
              System.out.println("  2. Open your eyes");
              action = Integer.parseInt(Utils.getRawInput());
              if (action == 1) {
                roomOne(1);
              }
            break;

          case 2:
              System.out.println("Brightest lights you have ever seen sear"
                              + "through your retina. You close your eyes" 
                              + "immediately in utter pain while falling"
                              + "to your knees. Hard stone floor almost"
                              + "shatters your knees and you cry out in" 
                              + "mindnumbing pain. Pain induced tears" 
                              + "start to form up in your eyes, increasing"
                              + "the burning feeling. The pain is almost"
                              + "intolerable.");

              System.out.println("  1. You remember that pee helps to reduce"
                              + "burning pain. Contort yourself to a"
                              + "position where you can pee in your eyes.");

              System.out.println("  2. Crawl forward in search of"
                              + "a light switch");

              action = Integer.parseInt(Utils.getRawInput());
            break;
        }

    }

    private void roomOne(int caseNo) {
      if (caseNo == 1) {
        System.out.println("You move through the opening and go forward"
                            + "hugging the cold wall. You seem to have"
                            + "entered in some kind of a corridor.");
      }
    }
    
    private void wait(int milliseconds) {
      try {
        Thread.sleep(milliseconds);
      } catch (Exception e) {
        //TODO: handle exception
      }
    }

    // To be used somewhere
    // Could be moved to another class
    private String randomizeName() {
      String[] names = {"Ivan", "Rodrigo", "Drumpf", "Vicky", "Fat-Joe"};
      int random = (int) (Math.random() * names.length);
      return names[random];
    }

    private String askPlayerName() {
      String input = Utils.getRawInput();
      if(input.equals("random")) {
        return randomizeName();
      } else {
        return input;
      }
    }

}