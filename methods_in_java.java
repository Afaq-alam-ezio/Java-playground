class Func{

    public void play_music(String s){

        System.out.println(s + " is playing now....");
    }

    public String give_pen(int cost){

        return cost > 10? "Classmate" : "Linc";
    }
}


public class methods_in_java{

    public static void main(String args[]){

        Func obj = new Func();

        obj.play_music("Safe and sound");

        int y = 15;

        String x = obj.give_pen(15);
        System.out.println("The pen you got is = " + x + " as the cost was " + y);
        
    }
    
}
