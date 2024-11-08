enum Status2{

    running, walking, dead, success;
}


class Enum_if_else_and_switch{

    public static void main(String args[]){

        Status2 x = Status2.dead;

        // if-else appraoch below :
        System.out.println("Below is If-else approach : \n");
        System.out.print("Output is = "); 

        if(x == Status2.running){

            System.out.println("Running");
        }
        else if(x == Status2.walking){

            System.out.println("walking");
        }
        else if(x == Status2.dead){

            System.out.println("dead");
        }
        else{

            System.out.println("success");
        }

        System.out.println("\nBelow is Switch approach : \n");

        Status2 y = Status2.success;
        System.out.print("Output is = ");

        switch(y){

            case walking -> System.out.println("Walking");

            case running -> System.out.println("running");

            case  dead-> System.out.println("dead");

            default -> System.out.println("Success");
        }
    }
}