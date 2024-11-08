public class Exception_intro{

    public static void main(String args[]){

        int i = 10;

        try{

            i = i/0;
        }
        catch(Exception e){

            System.out.println("Can't divide by zero");
        }

        System.out.println(i);
        System.out.println("Program ends");
    }
}