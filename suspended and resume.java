import java.util.Objects;

class resumethread extends Thread{
    public void run(){
        for(int i =0;i<5;i++){
            try{
                sleep(500);
                System.out.println(Thread.currentThread().getName());
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class Main {
    public static void main(String args[]){

        // creating 3 threads
        resumethread t1 = new resumethread();
        resumethread t2 = new resumethread();
        resumethread t3 = new resumethread();

        // call these 3 threads
        t1.start();
        t2.start();
        // suspend t2 thread
        t2.suspend();
        t3.start();
        t2.resume();

    }

}