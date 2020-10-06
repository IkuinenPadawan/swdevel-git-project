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

    public static void greetContinents() {
        print("Hello Europe");
        print("North America");
        print("South America");
        print("Africa");
        print("Asia");
        print("Australia");
        print("Antarctica");
    }
}