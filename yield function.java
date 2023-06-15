import com.sun.source.tree.YieldTree;
import java.util.*;
import java.util.*;
class yieldthread extends Thread{
    public void run(){
        for (int i =0;i<3;i++){
            System.out.println(Thread.currentThread().getName() + " in controll");
        }
    }
}
class Main {
    public static void main(String args[]){
        yieldthread t1  = new yieldthread();
        yieldthread t2 = new yieldthread();

        t1.start();
        t2.start();

for(int i=0;i<3;i++){
    t1.yield();
    System.out.println(Thread.currentThread().getName() + " in controll");
}
    }

}

OUTPUT-->
Thread-0 in controll
Thread-0 in controll
Thread-0 in controll
main in controll
Thread-1 in controll
Thread-1 in controll
Thread-1 in controll
main in controll
main in controll









