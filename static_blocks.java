class static_block{

    int x;
    static String name;         // my suggestion is to name it here only why need to declare static block 

    static_block(){
        
        x = 10;                 // default value assigned to x
        // name = "hello";     // this will get changed as it is initialized after each object creation, so to prevent this use static
    }

    static{

        name = "Harry";          // this will run once , when class loader loads this class it will execute even before constructor 
    }
}


public class static_blocks {
    
    public static void main(String args[]){

        static_block obj1 = new static_block();
        static_block obj2 = new static_block();


        System.out.println("The value of name in obj1 is = " + obj1.name);
        System.out.println("The value of name in obj2 is = " + obj2.name);
    }
}
