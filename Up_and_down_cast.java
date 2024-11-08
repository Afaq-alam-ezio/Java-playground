class A2{

    public void display1(){
        
        System.out.println("In A");
    }
}

class B2 extends A2{

    public void display2(){

        System.out.println("In B");
    }
}


public class Up_and_down_cast{

    public static void main(String args[]){

        A2 obj1 = new B2();
        obj1.display1();
        // obj1.display2();     parent class never knows about its child class, thus it will not work

        B2 obj2 = (B2) obj1;
        obj2.display2();

        B2 obj3 = new B2();
        obj3.display2();

        A2 obj4 = (A2) obj3;        // here whenever upcast is done and object goes to upper class, 
                                    // the object of forgets the lower class and that's why obj3 converted to obj4 and was of class B2
                                    // yet refused to remember the method of B2 which it used to know when it was B2's obj  
        // obj4.display2();
    }
}