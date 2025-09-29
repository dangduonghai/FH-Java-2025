
/** *************************************************************
 * Create a new program that has the following features. Download source (JAVA).
 * (a) Uses labeled continue instead of break.
 * (b) Does not require the isPrime variable.
 * (c) When testing whether an integer is prime, it is sufficient to try and divide by integers up to
 * the square root of the number being tested.
 * Turn in your rewritten code.
 ************************************************************** */
public class Problem_2 {

    public static void main(String[] args) {
        int nValues = 50;
        Number:
        for (int i = 2; i <= nValues; i++) {
            // boolean check = false;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // check = true;
                    continue Number;
                }

            }
            // if (check == true) {
            //     continue;
            // }
            System.out.println(i);
        }
    }
}
