package clouds;

import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        int steps = 0;
        int i = 0;
        while (i < c.size()) {
            if (i + 2 < c.size()) {
                if (c.get(i + 2) == 0) {
                    steps += 1;
                    i += 2;
                } else {
                    steps += 1;
                    i++;
                }
            } else if (i + 1 < c.size()) {
                steps += 1;
                i++;
            } else {
                i++;
            }
        }
        return steps;

    }

}

public class Solution {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int size = s.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add(s.nextInt());
        }
        System.out.println(Result.jumpingOnClouds(list));
    }

}
