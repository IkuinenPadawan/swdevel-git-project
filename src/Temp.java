Public class Temp {
    public static void main(String [] args) {

    }

    static void print(String text) {
        System.out.println(text);
    }

    static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    static void printHelloWorld(int times) {
        for(int i = 0; i < times; i++) {
            printHelloWorld();
        }
    }
}
