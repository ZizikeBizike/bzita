public class Exercise17SwapElements {

    // - Create an array variable named `abc`
    //   with the following content: `["first", "second", "third"]`
    // - Swap the first and the third element of `abc`

    public static void main(String[] args){

        String[] abc = {"first", "second", "third"};
        String temp = abc[0];        //ez egy új String, utána nem változik az értéke, ha abc[0] értéke változik
        abc[0] = abc[2];            //nem olyan, mintha két arrayt egyenlővé teszek
        abc[2] = temp;

        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
    }
}
