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
        print("Hello Molecules!");
    }

    public static void greetAtoms() {
        print("Hello Atoms!");
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
        print("Hello greeters of greeterers!");
    }

    public static void emptyMethod() {

    }

    public static int getSeven() {
        return 7;
    }

    public static int getFive() {
        return 5;
    }

    public static int getOne() {
        return 1;
    }

    public static int getMillion() {
        return 1000000;
    }

    public static int getTwo() {
        return 2;
    }

    public static void uselessMethodOne() {
        print("This is a useless method no 1");
    }

    public static void uselessMethodTwo() {
        print("This is a useless method no 2");
    }

    public static void uselessMethodThree() {
        print("This is a useless method no 3");
    }
}
