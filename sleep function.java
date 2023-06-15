
class demo_Sleep extends Thread{
    public void run(){
        for(int i =1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
 class Main {
    public static void main(String args[]){
        // creating 2 threads
        demo_Sleep t1 = new demo_Sleep();
        demo_Sleep t2 = new demo_Sleep();

        //start the given threads
        t1.start();
        t2.start();
    }

}
