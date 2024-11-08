public class Multi_catches{

    public static void main(String args[]){

        int i = 10;
        // String j = new String(null);             never assign null to string like this, rather use like below
        String str = null;

        int x[] = {1, 2, 3, 4, 5};

        try{

            i = i/10;                                   // if it was i/0, would have called  " ArithmeticException catch() "
            System.out.println(str.length());             //it will call " ArrayIndexOutOfBoundsException catch() "
            System.out.println(x[5]);                  //it will call " Exception catch() as NullPointerException catch() is not declared" but will not be able to call as already above statement will exit this block for catch(Exception e) i.e the last exception 
        }
        catch(ArithmeticException e){
            
            System.out.println("Can't divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Index is out of range");
        }
        catch(Exception e){                // always keep this "catch(Exception e)" at end as keeping it on top will make all rest catch() unreachable

            System.out.println("Error is : " + e);
        }
    }
}