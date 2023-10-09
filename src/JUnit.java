import java.util.ArrayList;

public class JUnit {
    public static int findMax(ArrayList<Integer> xs) {
        int max = 0;
        for (int x : xs) {
            if (x > max) {
                max = x;
            }
        }
        return max + 1;

    }
}
