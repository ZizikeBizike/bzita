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

  public static void main(String[] args) {
    int[][] matrix = new int[4][4];

    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < matrix[row].length; column++) {
        if(row == column) {                                     //at diagonals i = j
          matrix[row][column] = 1;
        } else {
          matrix[row][column] = 0;
        }
          System.out.print(matrix[row][column]);                  //print one line
      }
        System.out.println("");                             //start a new line when row index changes
    }
  }
}
