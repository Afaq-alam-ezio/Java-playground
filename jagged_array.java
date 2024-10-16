public class jagged_array {
    
    public static void main(String args[]){

        int x[][] = new int[3][];

        x[0] = new int[3];
        x[1] = new int[2];
        x[2] = new int[1];
         
        for(int i = 0; i < x.length; i++){      // here row count is counted
            for(int j = 0; j < x[i].length; j++){   // here col count is taken
                x[i][j] = (int)(Math.random()*10);
            }
        }

        for(int i[]: x){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
