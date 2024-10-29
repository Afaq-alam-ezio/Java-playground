class Anony_object{
    
    Anony_object(){

        System.out.println("object created");
    }

    public void print(){

        System.out.println("print method called");
    }
}


public class AnonymousObject{

    // always use the class method at the same time when declaring the anonymous object
    public static void main(String args[]){

        new Anony_object();                  // anonymous object created without any object reference variable
        new Anony_object().print();;         // anonymous object used to call class method

        new Anony_object().print();;           // again new object is created again due to which default constructor runs auto. and again method is called.
    }
}