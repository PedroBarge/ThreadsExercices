public class Main {
    public static void main(String[] args) {
        System.out.println("8. Write a Java program to suspend and resume a thread\n");

        Thread threadEx8 = new ThreadEx9();
        threadEx8.start();
        threadEx8.stop();
    }
}