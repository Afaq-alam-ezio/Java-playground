class A7 extends Thread{

    public void run(){

        for(int i = 0; i < 9999; i++){

            System.out.println("hii");

            try{

                Thread.sleep(1000);         // sleep mode activated here
            }
            catch(InterruptedException e){
    
                System.out.println("error : " + e);
            }
        }
    }
}

class B7 extends Thread{

    public void run(){

        for(int i = 0; i < 9999; i++){

            System.out.println("hello");

            try{

                Thread.sleep(1000);         // sleep mode activated here
            }
            catch(InterruptedException e){
    
                System.out.println("error : " + e);
            }
        }
    }      
}


public class Priority_and_sleep{

    public static void main(String args[]){

        A7 obj1 = new A7();
        System.out.println(obj1.getPriority());

        // obj1.setPriority(Thread.MAX_PRIORITY);       uncommenting this will make this object to max priority thus all executions will be done first               

        B7 obj2 = new B7();
        System.out.println(obj2.getPriority());

        // obj2.setPriority(Thread.MIN_PRIORITY);       uncommenting this will make this object to min priority thus all executions will be done last


        obj1.start();                   // always use start() to use run() in class if the class extends Thread
        
        // try{                                     // this is also optional if you want some more sleep time
        //     Thread.sleep(15);
        // }
        // catch(InterruptedException e){

        //     System.out.println(e);
        // }

        obj2.start();                   // always use start() to use run() in class if the class extends Thread

        // try{                                     // this is also optional if you want some more sleep time
        //     Thread.sleep(15);
        // }
        // catch(InterruptedException e){

        //     System.out.println(e);
        // }
    }
}