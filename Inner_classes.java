class Big{

    public void display1(){

        System.out.println("hello by parent class");
    }

    class Tiny{

        public void display2(){

            System.out.println("Hii by inner class");
        }
    }
}


class Inner_classes{

    public static void main(String args[]){

        Big obj1 = new Big();
        obj1.display1();

        Big.Tiny obj2 = obj1.new Tiny();        /* in obj1.new Tiny(), here object "obj2" is created for a main object "obj1"*/
        // Big.Tiny obj12 = new Big.Tiny();             /* if inner class Tiny is declared as static */

        obj2.display2();
    }
}