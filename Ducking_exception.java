class A5{

    public void show() throws ArithmeticException {         // error thrown , notice here, that "throws" is used not just "throw"

        int i = 10;
        i = i/0;            // not this show() will not handle the exception, but via main we handle
    }
} 


public class Ducking_exception{

    public static void main(String args[]){

        try{

            A5 obj = new A5();
            obj.show();
            System.out.println("No errors found");
        }
        catch(ArithmeticException e){

            System.out.println("Error found : " + e);
        }
    }
}