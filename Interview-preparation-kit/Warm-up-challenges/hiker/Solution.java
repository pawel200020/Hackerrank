package hiker;

import java.util.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER. The function accepts following
     * parameters: 1. INTEGER steps 2. STRING path
     */
    private static int goStage(char sign) {
        if (sign == 'U') {
            return 1;
        } else if (sign == 'D') {
            return -1;
        }
        return 0;
    }

    public static int countingValleys(int steps, String path) {
        int stage = 0;
        int valleyCounter = 0;
        boolean wasValley = false;
        for (int i = 0; i < path.length(); i++) {
            stage += goStage(path.charAt(i));
            while (stage > 0 && i < path.length()) {
                i++;
                stage += goStage(path.charAt(i));
                wasValley = false;

            }
            while (stage < 0 && i < path.length()) {
                i++;
                stage += goStage(path.charAt(i));
                wasValley = true;

            }
            if (wasValley == true) {
                valleyCounter++;
            }
        }
        return valleyCounter;
    }

}

public class Solution {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String path;
        int steps;
        steps = s.nextInt();
        path = s.next();
        System.out.println(Result.countingValleys(steps, path));

    }
}
