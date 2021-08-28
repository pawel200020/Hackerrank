import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
        long result = 0;
        for (int i = 0; i < q.size(); i++) {
            int tmp = q.get(i) - (i + 1);
            if (tmp > 2) {
                System.out.println("Too chaotic");
                return;
            } else {
                int t = 0;
                if (q.get(i) - 2 >= 0) {
                    t = q.get(i) - 2;
                }
                for (int j = t; j < i; j++) {
                    if (q.get(j) > q.get(i)) {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);

    }

}

public class solution {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            List<Integer> data = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                data.add(s.nextInt());
            }
            Result.minimumBribes(data);
        }
    }
}
