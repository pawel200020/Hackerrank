import java.io.*;
import java.util.*;

import java.math.*;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY. The function accepts
     * following parameters: 1. INTEGER_ARRAY a 2. INTEGER d
     */
    private static int countPosition(int curr, int rotate, int size) {
        int result = curr - rotate;
        if (result < 0) {
            int tmp = size + result;
            result = tmp;
        }
        return result;
    }

    private static int CountFirstPositon(List<Integer> data, int rotate) {
        for (int i = 0; i < data.size(); i++) {
            if (countPosition(i, rotate, data.size()) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static List<Integer> rotLeft(List<Integer> data, int rotate) {
        List<Integer> result = new ArrayList<>();
        int realRotate = rotate % data.size();
        int first = CountFirstPositon(data, realRotate);
        for (int i = first; i < first + data.size(); i++) {
            result.add(data.get(i % data.size()));
        }
        return result;
    }

}

public class Solution {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();
        int size = s.nextInt();
        int rotate = s.nextInt();
        for (int i = 0; i < size; i++) {
            data.add(s.nextInt());
        }
        List<Integer> res;
        res = Result.rotLeft(data, rotate);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }

}
