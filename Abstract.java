abstract class Car{

    abstract public void display();
}

class Lambo extends Car{

    public void display(){

        System.out.println("Abstract function declared inside Lambo");
    }
}


public class Abstract{

    public static void main(String Args[]){

        // Car obj = new Car();        Can't create objects of any abstract class
        
        //but reference object is allowed
        Car obj = new Lambo();
        obj.display();

        // Lambo obj1 = (Lambo) obj;    downcasting the Car object reference to a Lambo type
    }
}