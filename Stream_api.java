import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_api{

    public static void main(String args[]){

        List<Integer> nums = Arrays.asList(5, 6, 4, 8, 9, 7);

        Stream<Integer> s1 = nums.stream();     // all values in nums is now copied to s1 thus nums will not be affected

        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);    // s1 is now dead as it is used using .filter
        // System.out.println(s1);     // this statement is of no use

        Stream<Integer> s3 = s2.map(n -> n*2);    //  s2 is now dead as it is used using .map
        // System.out.println(s2);     // this statement is of no use

        int res = s3.reduce(0, (a, b) -> a+b);  // 0 is the initial value and (a, b) -> a + b is the accumulator function, which adds two elements and stores in place of zero
        


        // aternate and short method
        int result = nums.stream()
                    .filter(n -> n%2 == 0)
                    .map(n->n*2)
                    .reduce(0, (a, b) -> a+b);
        

        System.out.println(res);
        System.out.println(result);
    }
}