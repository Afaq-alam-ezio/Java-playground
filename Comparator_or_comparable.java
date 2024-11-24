import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student{

    int roll;
    String name;

    public Student(int roll, String name){

        this.roll = roll;
        this.name = name;
    }
}

public class Comparator_or_comparable{

    public static void main(String args[]){

        List<Integer> nums = new ArrayList<Integer>();


        Comparator<Integer> com = new Comparator<Integer>(){        // comparision for integers
            
            public int compare(Integer i, Integer j){

                if(i%10 > j%10){                // look at this logic

                    return 1;
                }
                else{

                    return -1;
                }
            }
        };

        nums.add(32);
        nums.add(54);
        nums.add(69);
        nums.add(91);
        nums.add(53);


        Collections.sort(nums, com);

        System.out.println(nums);


        Comparator<Student> stud = new Comparator<Student>(){           // comparision for Strings

            public int compare(Student i, Student j){

                return i.roll > j.roll ? 1:-1;          // compare() will always return aither 1 or -1
            }
        };


        List<Student> studs = new ArrayList<>();

        studs.add(new Student(1, "Afaq"));          // all these are like array of objects under one object name " studs "
        studs.add(new Student(13, "Alan"));
        studs.add(new Student(21, "Arms"));
        studs.add(new Student(91, "Arno"));

        Collections.sort(studs, stud);

        for(Student s : studs){

            System.out.println(s.roll + " : " + s.name);
        }
    }
}