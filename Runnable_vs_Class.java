public class Runnable_vs_Class{

    // no class is used to extends thread, Instead Thread directly uses Runnable object for targeting Run() method

    public static void main(String args[]){

        // below Abstract and Anonymous inner class is being used to instanciate the object of Runnable interface
        Runnable A = new Runnable(){

            public void run(){

                for(int i = 0; i < 5; i++){

                    System.out.println("hii");
        
                    try{
        
                        Thread.sleep(100);         // sleep mode activated here
                    }
                    catch(InterruptedException e){
            
                        System.out.println("error : " + e);
                    }
                }
            }
        };

        // below Abstract and Anonymous inner class is being used to instanciate the object of interface also lambda() is used below as Runnable interface has only run()
        Runnable B = () -> {

            for(int i = 0; i < 5; i++){

                System.out.println("hello");
    
                try{
    
                    Thread.sleep(100);         // sleep mode activated here
                }
                catch(InterruptedException e){
        
                    System.out.println("error : " + e);
                }
            }
        };

        Thread t1 = new Thread(A);    // this line means A is linking runable to to thread, so that thread can know, which run() i have to target for execution
        Thread t2 = new Thread(B);    // this line means A is linking runable to to thread, so that thread can know, which run() i have to target for execution
        
        t1.start();
        t2.start();

    }
}