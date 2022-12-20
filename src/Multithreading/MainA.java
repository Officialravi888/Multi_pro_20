package Multithreading;
class MainA implements Runnable {
    @Override
    public void run() {
        System.out.println("Multhreading");
    }

    public static void main(String[] args) {
        MainA obj= new MainA();
        Thread obj1 = new Thread(obj);

        obj1.start();
    }
}
