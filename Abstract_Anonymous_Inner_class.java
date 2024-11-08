abstract class Out{

    public abstract void display();
}

// class In extends Out{                    # No need to write seperate class for implementing the above abstract function if implementn is req. for once

//     public void display(){

//         System.out.println("Hello");
//     }
// }


class Abstract_Anonymous_Inner_class{

    public static void main(String args[]){

        /*Below Abstract inner anonymous class will do the task, if implementn is req. for once*/

        Out obj = new Out(){

            public void display(){

                System.out.println("Hello world");
            }
        };
        
    }
}