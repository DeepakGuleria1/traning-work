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

OUTPUT-->
    Thread-0
    1
    Thread-2
    1
    Thread-1
    1
    Thread-0
    2
    Thread-2
    2
    Thread-1
    2
    Thread-0
    3
    Thread-2
    3
    Thread-1
    3
    Thread-0
    4
    Thread-2
    4
    Thread-1
    4
