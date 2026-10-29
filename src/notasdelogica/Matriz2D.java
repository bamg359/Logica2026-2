package notasdelogica;

public class Matriz2D {


    public static void main(String[] args) {


        int [][] numbers = new int [3][3];

        int [][] ages = {{2,   5, 7},
                         {34, 19, 7}}; // shape(2, 3)



        for(int i = 0; i < ages.length; i++){
            for(int j = 0; j < ages[i].length; j++ ) {
                System.out.print(ages[i][j] + " ");

            }
            System.out.println();
        }
    }
}
