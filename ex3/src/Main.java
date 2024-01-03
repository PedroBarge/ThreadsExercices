public class Main {
    public static void main(String[] args) {
        System.out.println("Execise 3");
        System.out.println("3. Write a Java program to check thread is alive or not");
        System.out.println();

        ThreadEx3 threadEx3 = new ThreadEx3();
        threadEx3.start();
        System.out.println("Is the thread alive? "+threadEx3.isAlive());
    }
}