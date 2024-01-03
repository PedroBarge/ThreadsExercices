public class ThreadEx8 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread start");
        try {
            System.out.println("Thread.sleep(2000) is running");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread done");
    }


}
