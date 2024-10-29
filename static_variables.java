class Demo{

    int x = 10;
    static int y = 20;
}


public class static_variables {

    public static void main(String args[]){

        Demo obj1 = new Demo(); 
        Demo obj2 = new Demo();

        obj1.y = 50;

        System.out.println("The value of y is changed for obj1 = " + obj1.y);
        System.out.println("The value of y was not changed for obj2 but still got changed due to y being static = " + obj2.y);

        System.out.println("Accesed via class name = " + Demo.y);

    }
    
}
