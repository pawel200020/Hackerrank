import java.util.*;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        int[][] temp = new int[ar.size()][2];
        int unique = 0;
        int pairs = 0;
        boolean proceed = false;
        for (int i = 0; i < ar.size(); i++) {
            proceed = false;
            for (int j = 0; j < unique; j++) {
                if (temp[j][0] == ar.get(i)) {
                    temp[j][1]++;
                    proceed = true;
                }
            }
            if (proceed == false) {
                temp[unique][0] = ar.get(i);
                temp[unique][1] = 1;
                unique++;
            }

        }
        for (int j = 0; j < unique; j++) {
            pairs += temp[j][1] / 2;
        }
        return pairs;

    }

}

public class Solution {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        List<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            ar.add(s.nextInt());
        }
        System.out.println(Result.sockMerchant(n, ar));
    }
}