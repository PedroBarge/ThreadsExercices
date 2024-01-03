public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 5");
        System.out.println("5. Write a Java program to create a thread by implementing a Runnable interface\n");

        Thread threadEx5 = new Thread(new ThreadWithRunnable());
        threadEx5.start();
    }
}