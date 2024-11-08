@FunctionalInterface         // due to this annotation, only one method can exist inside the below Interface
interface A3{

    void show();
    // void show(int i);
}

public class Lambda{

    public static void main(String args[]){

        A3 obj1 = new A3(){

            public void show(){
                System.out.println("in A using anonymous class");
            }
        };

        obj1.show();

        // Below is the short method using Lambda expressions
        A3 obj2 = () -> System.out.println("in A using lambda");

        //if ony one formal para, then use directly para name
        // A3 obj2 = (int i) -> System.out.println("in A using lambda");
        // A3 obj2 = (i) -> System.out.println("in A using lambda");
        // A3 obj2 = i -> System.out.println("in A using lambda");

        obj2.show();
    }
}