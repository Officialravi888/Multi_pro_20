package Multithreading;

public class MainE extends Thread{
    public void run(){
        try {
            System.out.println("hay:"+currentThread().getName()+"hay");

        }catch (Exception e){
            System.out.println("");
        }
    }

    }


