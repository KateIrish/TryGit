package git;

public class Git {

    /**
     *
     * @param base is the base number that would be repeated
     * @param exponent will serve as the exponent
     * @return
     */
    public static double power(double base, int exponent) {
        double yield = 1;
        
        for (int counter = 0; counter < exponent; counter++) {
            if (counter != exponent) {
                yield = yield * base;
               
            }

        }
         System.out.println(yield);
         return yield;
    }

    public static void main(String[] args) {
        power(2, 3);

    }

}
