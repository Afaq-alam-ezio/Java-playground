import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Behind_forEach_method{

    public static void main(String args[]){

        List<Integer> nums = Arrays.asList(1, 2, 5, 6, 4, 3, 7);

        // Consumer<Integer> con = new Consumer< Integer>(){
            
        //     public void accept(Integer n){

        //         System.out.println(n);
        //     }
        // };

        Consumer<Integer> con = n -> System.out.println(n);         // above is the actual implementation of Consumer Interface 

        // nums.forEach(n -> System.out.println(n));        method we used previously

        nums.forEach(con);        // here instead using con, just convert above functional Consumer interface's inner anonymous class into a lambda function
    
        nums.forEach(n -> System.out.println(n));           // now here con is = " con -> System.out.println(n); "
    }
}