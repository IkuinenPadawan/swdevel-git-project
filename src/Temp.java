Public class Temp {
    public static void main(String [] args) {

    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World!");
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
}
