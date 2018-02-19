public class Exercise13Matrix {

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    public static void main(String[] args){

        int[][] matrix = new int [4][4];

        for(int row = 0; row < matrix.length; row++){
            for(int coloumn = 0; coloumn < matrix[row].length; coloumn++){
                matrix[row][coloumn] = row * coloumn;

                if(row == coloumn){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
