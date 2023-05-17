import java.util.*;

class A extends Thread {
    public void run(){
        for(int i=0;i<100;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(40);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class B extends Thread {
    public void run() {
        for(int i=0;i<100;i++) {
            System.out.println("Bye");
            try {
                Thread.sleep(40);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();  
        a.start();
        b.start();
    }
}
