public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("10. Write a Java program to create multiple threads");
        System.out.println("11. Write a Java program to demonstrate the Thread.join() method");
        System.out.println("12. Write a Java program to sleep a thread\n");

        for (int i = 1; i < 6; i++) {
            Thread thread = new ThreadEx();
            System.out.println("Thread number: " + i);
            thread.start();
            thread.join();
        }

        System.out.println();
        System.out.println("+------------------------------------------------------+");
        System.out.println("15. Write a Java program to create a group of a thread");
        System.out.println("18. Write a Java program to count active threads of a thread group");
        System.out.println("19. Write a Java program to destroy a thread group\n");
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");
        Thread thread1 = new Thread(threadGroup, new ThreadEx(), "Thread1");
        Thread thread2 = new Thread(threadGroup, new ThreadEx(), "Thread2");

        thread1.start();
        thread2.start();
        System.out.println("Active Threads in Thread Group : " + threadGroup.activeCount());
        threadGroup.interrupt();
        thread1.join();
        thread2.join();

        System.out.println();
        System.out.println("+------------------------------------------------------+");
        System.out.println("16. Write a Java program to get thread priority\n");
        Thread threadEx16 = new ThreadEx();
        threadEx16.getPriority();
        threadEx16.start();
        threadEx16.join();

        System.out.println();
        System.out.println("+------------------------------------------------------+");
        System.out.println("17. Write a Java program to set thread priority\n");
        Thread threadEx17 = new ThreadEx();
        threadEx17.setPriority(2);
        threadEx17.start();
        threadEx17.join();
        System.out.println();
        System.out.println("+------------------------------------------------------+");
        System.out.println("20. Write a Java program to get information of the current executing thread\n");
        Thread currentThread = Thread.currentThread();
        // Print thread information
        System.out.println("Thread Name : " + currentThread.getName());
        System.out.println("Thread ID : " + currentThread.getId());
        System.out.println("Thread Priority : " + currentThread.getPriority());
        System.out.println("Thread State : " + currentThread.getState());
        System.out.println("Thread is Daemon : " + currentThread.isDaemon());
        System.out.println("Thread is Alive : " + currentThread.isAlive());
        System.out.println("Thread is Interrupted : " + currentThread.isInterrupted());
    }
}