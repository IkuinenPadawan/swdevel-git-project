Public class Hello {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printHelloWorld() {
        print("Hello World!");
    }

    public static void printHelloWorld(int times) {
        for(int i = 0; i < times; i++) {
            printHelloWorld();
        }
    }

    public static void printHello100() {
        for(int i = 0; i < 100; i++) {
            printHelloWorld();
        }
    }

    public static void printDyslexicHello() {
        print("Hlelo Wrlod!");
    }

    public static void printHelloSpace() {
        print("Hello Space!");
    }

    public static void statePurpose() {
        print("Unknown");
    }
    public static void jelloBeforeHello() {
        print("Jello Hello");
    }

    public static void helloBeforeJello() {
        print("Hello Jello");
    }

    public static int getHelloJelloPurpose() {
        return 42;
    }

    public static int howManyHellosToGreetEveryone() {
        return 7;
    }
    public static boolean areEveryoneGreeted(int helloAmount) {
        if (howManyHellosToGreetEveryone() >= 7) {
            return true;
        }
        return false;
    }  
    public static void greetContinents() {
        print("Hello Europe!");
        print("Hello North America!");
        print("Hello South America!");
        print("Hello Africa!");
        print("Hello Asia!");
        print("Hello Australia!");
        print("Hello Antarctica!");
    }

    public static void greetOceans() {
        print("Hello Arctic Ocean!");
        print("Hello Southern Ocean!");
        print("Hello Indian Ocean!");
        print("Hello Atlantic Ocean!");
        print("Hello Pacific Ocean!");
    }

    public static void greetMolecules() {
        print("Hello molecules!");
    }

    public static void greetAtoms() {
        print("Hello atoms!");
    }

    public static void greetAllMatter() {
        greetContinents();
        greetOceans();
        greetMolecules();
        greetAtoms();
    }

    public static void isGreetingAllMatterRelevant() {
        print("Categorical no.");
    }

    public static void greetGreeters() {
        print("Hello greeters!");
    }

    public static void greetGreetersOfGreeters() {
    }
}
