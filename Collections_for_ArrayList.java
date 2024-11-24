import java.util.ArrayList;
import java.util.Collection;

public class Collections_for_ArrayList{

    public static void main(String args[]){

        Collection<Integer> nums = new ArrayList<Integer>();

        nums.add(4);
        nums.add(3);
        nums.add(6);
        nums.add(8);
        nums.add(0);

        System.out.println(nums.isEmpty());

        for(int x : nums){

            System.out.println(x);
        }
    }
}