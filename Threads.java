class A6 extends Thread{

    public void run(){              // always declare a run() as without this it will not perform multi threading

        for(int i = 0; i < 1000; i++){

            System.out.println("hii");
        }
    }
}

class B6 extends Thread{

    public void run(){              // always declare a run() as without this it will not perform multi threading

        for(int i = 0; i < 1000; i++){

            System.out.println("hello");
        }
    }
}


public class Threads{

    public static void main(String args[]){

        A6 obj1 = new A6();
        B6 obj2 = new B6();

        obj1.start();           // this start() will call the run() above in the class A
        obj2.start();           // this start() will call the run() above in the class B
    }
}