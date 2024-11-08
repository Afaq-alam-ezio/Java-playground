// Below class A always gets extended by "class Object" by default in a hidden Way
/* It looks like:

        class A extends Object{

            statements;
            }
*/

class A{

    public A(){
        
        // super();  present but hidden
        this(5);
        System.out.println("Inside A");
    }

    public A(int x){
        
        // super();  present but hidden
        System.out.println("Inside A int");
    }
}

class B extends A{

    public B(){

        // super();  present but hidden
        System.out.println("Inside B");
    }

    public B(int x){

        // super();  present but hidden
        this();     // It will help execute the above default constructor.
        System.out.println("Inside B int");
    }
}


public class Super_and_This{

    public static void main(String args[]){

        B obj1 = new B();
        /* 
         the output of Above statement is :

                    Inside A
                    Inside B

            -> The o/p is such because there's a hidden super() method in all the constructors by default and is hidden
        */
        System.out.println("\n");

        B obj2 = new B(5);
    }
}