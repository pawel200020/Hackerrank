import java.util.*;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * 2D_INTEGER_ARRAY arr as parameter.
     */
    private static int countSum(List<List<Integer>> arr, int i, int j) {
        int result = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1)
                + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
        return result;
    }

    public static int hourglassSum(List<List<Integer>> arr, int rows, int cols) {
        int maxSum = 0;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                if (i == 0 && j == 0) {
                    maxSum = countSum(arr, i, j);
                } else {
                    int tempSum = countSum(arr, i, j);
                    if (tempSum > maxSum) {
                        maxSum = tempSum;
                    }
                }
            }
        }
        return maxSum;
    }

}

public class Solution {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        int rows = 6;
        int cols = 6;
        for (int i = 0; i < rows; i++) {
            List<Integer> list1 = new ArrayList<Integer>();
            for (int j = 0; j < cols; j++) {
                list1.add(s.nextInt());
            }
            arr.add(list1);
        }
        System.out.println(Result.hourglassSum(arr, rows, cols));
    }
}
