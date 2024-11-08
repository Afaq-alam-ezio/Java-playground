enum Status{

    walking, running, rocket;
}

public class Enumerator{

    public static void main(String args[]){

        Status s1 = Status.walking;
        
        System.out.println("\ns_element = " + s1 + " and index is = " + s1.ordinal() + "\n\nBelow are the objects of Enum using Loop : \n");

        Status s_array[] = Status.values();
        for(Status s_element : s_array){

            System.out.println("s_element = " + s_element + " and index is = " + s_element.ordinal());
        }
        System.out.println("\n");
    }
}