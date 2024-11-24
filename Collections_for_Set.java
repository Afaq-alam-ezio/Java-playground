import java.util.HashSet;
import java.util.Set;

public class Collections_for_Set{

    public static void main(String args[]){

        Set<Integer> nums = new HashSet<Integer>();         // all elements are randomly stored, thus not sorted. if want sorted order use TreeSet();

        nums.add(40);                                   // all repeating elements are not accepted , thus no repeated elements will be stored
        nums.add(35);
        nums.add(65);
        nums.add(40);
        nums.add(65);

        System.out.println(nums.contains(40));

        for(int x : nums){

            System.out.println(x);
        }
    }
}