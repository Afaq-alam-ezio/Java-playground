import java.util.Arrays;
import java.util.List;

public class Stream_api_1{

    public static void main(String args[]){

        List<Integer> nums = Arrays.asList(2, 5, 6, 4, 3, 1, 8, 7, 9);

        nums.add(52);

        // we've seen earlier that we can use normal for/while or enhanced for loop, but here we got more enhanced one

        nums.forEach(n -> System.out.println(n));
    }
}