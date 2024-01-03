public class Main {
    public static void main(String[] args) {
        System.out.println("Exercice 4");
        System.out.println("4. Write a Java program to suspend a thread\n");

        ThreadEx4 threadEx4 = new ThreadEx4();
        threadEx4.start();
        threadEx4.interrupt();
    }
}