public class Game {
    private final String gameName = "SomeCleverGameName";
    private String playerName;
    private String nemesisName = randomizeName();

    public Game() {

    }

    public void start() {
      introduction();  
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
                         +  " eyes, as you instantly fall unconscious.");               
      wait(5000);
      startingRoom();
    }

    private void startingRoom() {
        System.out.println("You wake up in a dark room feeling groggy and" 
                            + " utterly alone. What do you do?");
        System.out.println("  1. Carefully feel yourself around the room to" 
                            + " get clues of where you are.");
        System.out.println("  2. Open your eyes");

        int action = Integer.parseInt(Utils.getRawInput());

        switch(action) {
          case 1:
              System.out.println("You fumble about the room. You almost trip" 
                              + " on something that makes a metallic noise" 
                              + " when you stumble upon it. Air feels chilly." 
                              + " There's a draft. You reach out carefully"
                              + " and finally make contact with a wall of" 
                              + " sorts. You feel around. The wall seems to" 
                              + " be made out of slabs of stone. Your" 
                              + " immediate thought of your whereabouts is" 
                              + " a medieval dungeon. Cold chill rund" 
                              + " through your body. What the hell has" 
                              + " happened? You trace along the wall and" 
                              + " reach an opening.");

              System.out.println("  1. Move through the opening.");
              System.out.println("  2. Open your eyes");
              action = Integer.parseInt(Utils.getRawInput());
              if (action == 1) {
                roomOne(1);
                break;
              }
          case 2:
              System.out.println("Brightest lights you have ever seen sear through your retina. You close your eyes immediately in utter pain while falling to your knees. Hard stone floor almost shatters your knees and you cry out in mindnumbing pain. Pain induced tears start to form up in your eyes, increasing the burning feeling. The pain is almost intolerable.");
              System.out.println("  1. You remember that pee helps to reduce burning pain. Contort yourself to a position where you can pee in your eyes.");
              System.out.println("  2. Crawl forward in search of a light switch");
              int action = Integer.parseInt(Utils.getRawInput());
              if (action == 1) {
                  roomOneContinued("urea");
              } else if (action == 2) {
                  System.out.println("You cannot find a light switch. The burning sensation in your eyes doesn't seem to get better.");
                  System.out.println("  1. You say out loud: 'Hello, is there anybody out there?'");
                  System.out.println("  2. You decide after all to pee on your eyes.");
                  int action = Integer.parseInt(Utils.getRawInput());
                  if (action == 1) {
                      System.out.println("'Yes how can I help you?'\n\n ");
                      System.out.println("You almost soil yourself as the voice booms from the corner somewhere. What the hell is this you wonder. You are glad that you didn't pee on your eyes.");
                      roomOneContinued();
                  } else if (action == 2) {
                      roomOneContinued("urea");
                  }
              }
            break;
        }
      }

    private void roomOneContinued(String state) {

    }

    private void roomOne(int caseNo) {
      switch (caseNo) {
         case 1: 
             System.out.println("You move through the opening and go forward" 
                                + "hugging the cold wall. You seem to have" 
                                + "entered some kind of a corridor."
                                + "Finally you stumble upon stairs."
                                + "You wonder if you could ascend the stairs"
                                + "rapidly even if you can't see anything.");
             System.out.println("  1. Run up the stairs.");
             System.out.println("  2. You might trip while running so ascend the stairs slowly and carefully.");
             System.out.println("  3. Go back to the room where you woke up to see if there is something useful.");
             int action = Integer.parseInt(Utils.getRawInput());
             if (action == 1) {
                  roomTwo('run');
             } else if (action == 2) {
                  roomTwo('walk');     
             } else if (action == 3) {
                  startingRoom(true);
             }
        break;
        case 2:
             
      }
    }

    private void roomTwo(String state) {
        switch (state) {
            case "walk":
            break;
            case "run":
            break;
    }

    private void wait(int milliseconds) {
      try {
        Thread.sleep(milliseconds);
      } catch (Exception e) {
        //TODO: handle exception
      }
    }

    // Could be moved to another class
    private String randomizeName() {
      String[] names = {"Ivan", "Rodrigo", "Drumpf", "Vicky", "Fat-Joe", "Morbidly-Obese-Susan",
      "Vladimir", "Jorma", "Diego", "Donovan"};
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

    private int randomDamage() {
      return (int) (Math.random() * 100) + 1;
    }

}
