class demoThread extends Thread implements Runnable {
     public void run() {
         int i = 1;
         while (i != 5) {
             try {
                 System.out.println(Thread.currentThread().getName());
                 sleep(2000);
             } catch (Exception e) {
                 System.out.println(e);
             }
             i++;
         }
     }
     public void stopThread(){
         boolean r = false;
     }
 }
 class Main {
    public static void main(String args[]){

      demoThread t1 = new demoThread();
      demoThread t2 = new demoThread();
      demoThread t3 = new demoThread();
      demoThread t4 = new demoThread();
      demoThread t5 = new demoThread();


        t1.start();
        t1.setName("Thread 1");
        t2.start();
        t2.setName("Thread 2");
        t3.start();
        t3.setName("Thread 3");
        t4.start();
        t4.setName("Thread 4");
        t5.start();
        t5.setName("Thread 5");


        t3.stopThread();
        System.out.println("Thread 3 is stopped");
    }

}
