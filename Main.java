public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(String s, int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(s);
        }
    }
}