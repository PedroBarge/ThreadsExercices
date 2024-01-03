import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("10. Write a Java program to create multiple threads\n");
        System.out.println("11. Write a Java program to demonstrate the Thread.join() method\n");
        System.out.println("12. Write a Java program to sleep a thread\n");

        for (int i = 1; i < 6; i++) {
            Thread thread = new ThreadEx10();
            System.out.println("Thread number: " + i);
            thread.start();
            thread.join();
        }
    }
}