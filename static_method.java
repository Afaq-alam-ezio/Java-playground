class static_methods{

        static int x = 10;
        int y;

        public static void show(){  // 1st method

            System.out.println("Value of static x = " + x);
        }
        
        public static void show(static_methods obj){    // 2nd method

            System.out.println("Value of x for passed object is = " + obj.x);
            System.out.println("Value of y for passed object is = " + obj.y);
        }
}


public class static_method {

        public static void main(String args[]){

            static_methods obj1 = new static_methods();

            // obj1.show();           // we can access static class method same as static class variable
            obj1.y = 100;

            static_methods.x = 25;

            // below im doing some method overloading
            static_methods.show();
            static_methods.show(obj1);
        }
}
