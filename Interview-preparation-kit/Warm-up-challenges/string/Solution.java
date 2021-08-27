package string;

import java.util.Scanner;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER. The function accepts
     * following parameters: 1. STRING s 2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        long lastLength = (long) n % s.length();
        long repetitons = (long) n / s.length();
        long quantity = 0;
        long additional = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < lastLength) {
                if (s.charAt(i) == 'a') {
                    additional++;
                }
            }
            if (s.charAt(i) == 'a') {
                quantity++;
            }
        }
        quantity *= repetitons;
        quantity += additional;
        return quantity;

    }

}

public class Solution {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String string = s.next();
        long size = s.nextLong();
        System.out.println(Result.repeatedString(string, size));
    }
}
