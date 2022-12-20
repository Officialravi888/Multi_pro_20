package Multithreading;

public class MainD extends  Thread{
    public void run() {
        System.out.println("Threadname:" + Thread.currentThread().getName());
        System.out.println("Cheack:" +Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DaemonThread t1=new DaemonThread();
        DaemonThread t2=new DaemonThread();
        t1.start();
        t1.setDaemon(true);
        t2.start();
    }
}
