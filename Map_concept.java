import java.util.Map;
import java.util.HashMap;

public class Map_concept{

    public static void main(String args[]){

        Map<String, Integer> stud = new HashMap<String, Integer>();
        
        stud.put("Afaq", 100);
        stud.put("Radhika", 50);
        stud.put("manali", 60);
        stud.put("sonam", 10);
        stud.put("sonam", 65);      // here "sonam" repeats twice , thus new value for "Sonam" will be replacing the old value i.e. 10 replaced by 65

        System.out.println(stud.keySet());
        System.out.println(stud.values());

        for(String key : stud.keySet()){

            System.out.println(key + " : " + stud.get(key));
        }
    }
}