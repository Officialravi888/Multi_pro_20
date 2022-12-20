
//Program to illustrate the use of SetDaemon() and is Daemon() method
package Multithreading;

 class MainC extends Thread {
    public void DaemonThread(String name) {


    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + "is Daemon thread");
        }
        else
        {

    System.out.println(getName()+"is user thread");
}
}
public static void main(String[]args){
        DaemonThread t1=new DaemonThread();
        DaemonThread t2=new DaemonThread();
        DaemonThread t3=new DaemonThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.setDaemon(true);
        t3.start();
        }
        }