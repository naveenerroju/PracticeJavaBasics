package basicpractice;

public class Thread2{
    public static class MyRunnable implements Runnable {
        public void run(){
            System.out.println("Thread is being executed");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread( new MyRunnable() );
        t1.start();
    }
}
