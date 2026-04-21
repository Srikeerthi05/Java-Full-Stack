// class A extends Thread{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Thread A: "+i);
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Thread B: "+i);
//         }
//     }
// }
// public class MultiThreading {
//     public static void main(String[] args) {
//         A a = new A();
//         B b = new B();
//         a.start();
//         b.start();
       
//     }
// }
// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Thread A: "+i);
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<5;i++){
//             System.out.println("Thread B: "+i);
//         }
//     }
// }
// public class MultiThreading {
//     public static void main(String[] args) {
//         Runnable a = new A();
//         Runnable b = new B();
//         Thread t1 = new Thread(a);
//         Thread t2 = new Thread(b);
//         t1.start();
//         t2.start();
//     }
// }


//Lamba Expression:
class Counter{
    int count = 0;
    public synchronized void increment(){
        count++;
         
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        Counter c=new Counter();
        Runnable a =()->{
            for (int i=1;i<=1000;i++){
            c.increment();
            }
        };
        Runnable b = ()->{
            for (int i=1;i<=1000;i++){
           c.increment();
            }
        };
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.count);
    }
}
