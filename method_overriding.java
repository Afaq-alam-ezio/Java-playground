class A1{

    public void display(){

        System.out.println("Hello by A");
    }
}

class B1 extends A1{

    public void display(){

        System.out.println("Hello by B");
    }
}


public class method_overriding{

    public static void main(String args[]){

        B1 obj1 = new B1();

        // Below will execute the B's display and not A's display as Already B has a display() method thus, method overriding is done here
        obj1.display();
    }
}