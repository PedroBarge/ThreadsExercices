public class Main {
    public static void main(String[] args) {
        System.out.println("6. Write a Java program to set and print thread name\n");

        Thread threadEx6 = new ThreadEx6();
        threadEx6.start();
        threadEx6.setName("Exercise 6");
        System.out.println(threadEx6.getName());
    }
}