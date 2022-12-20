 class MainB extends Thread{
     @Override
     public void run() {
         System.out.println("My thread program");
     }

     public static void main(String[] args) {
        MainB obj = new MainB();
        obj.start();

    }
}