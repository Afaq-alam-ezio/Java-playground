class Afaq_Exception extends Exception{

    public Afaq_Exception(String s){

        super(s);
    }
}


public class Custom_exception{

    public static void main(String args[]){

        try{

            int i = 10/10;

            throw new Afaq_Exception("Bad calculation.");
        }
        catch(Afaq_Exception a){

            System.out.println("Can't divide by zero : " + a);
        }
    }
}