public class Main {
    public static void main(String[] args) {
        System.out.println("7. Write a Java program to print the thread Id of a thread\n");

        Thread threadEx7 = new ThreadEx7();
        System.out.println(threadEx7.threadId());
        threadEx7.start();
    }
}