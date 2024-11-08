public class Throw{

    public static void main(String args[]){

        try{

            int i =  10/10;
            
            if(i == 1){             // this throw will work with condition

                // below statement looks like :  " ArithmeticException e = new ArithmeticException("value after division is 1"); "
                // " ArithmeticException e = " is hidden inside throw
                // message can be passed in the ("message") below as it will get printed at end in catch().
                throw new ArithmeticException("value after division is 1");             // here no need to create the object as already its there in throw
            }

            // throw new ArithmeticException();     this throw will also work without any condition
        }

        catch(ArithmeticException e){

            System.out.println("Error is : " + e);
        }
    }
}