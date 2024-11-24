class A8{

    public int c = 0;
    public synchronized void inc(){

        c++;
    }
}

public class Race_condition {

    public static void main(String args[]) throws InterruptedException{


        A8 obj = new A8();
        
        Runnable obj1 = () -> {

            for(int i = 0; i< 10000; i++){

                obj.inc();
            }
        };

        Runnable obj2 = () -> {

            for(int i = 0; i< 10000; i++){

                obj.inc();
            }
        };

        Thread t1 = new Thread(obj1);           // runnable-thread linking done 
        Thread t2 = new Thread(obj2);           // runnable-thread linking done 

        t1.start();
        t2.start();

        t1.join();      // it will tell main to wait for t1 and t2 to finish their execution then only after print the value of obj.c      
        t2.join();      // it will tell main to wait for t1 and t2 to finish their execution then only after print the value of obj.c

        // still need to optimize as some concurrent thread execution will cause race condition, thus mention synchronized keyword above in inc()
        System.out.println(obj.c);
    }
}