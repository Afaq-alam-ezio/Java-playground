class Para_Const{

    int roll;
    String name;

    public Para_Const(int roll, String name){

        this.roll = roll;
        this.name = name;
    }

    public void display(){

        System.out.println("Roll is = " + roll + " and Name is = " + name);
    }

}


public class Para_Constructor{      // Always save the file with this class name only else it will not run

    public static void main(String args[]){
    

        Para_Const obj = new Para_Const(22, "Afaq");
        obj.display();
    }
}