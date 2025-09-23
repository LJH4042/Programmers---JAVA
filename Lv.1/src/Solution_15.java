import java.util.Arrays;
import java.util.Collections;

class Solution_15 {
    public long solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");

        Arrays.sort(arr, Collections.reverseOrder());

        String answer = String.join("", arr);

        return Long.valueOf(answer);
    }

    public static void main(String[] args) {
      Solution_15 s = new Solution_15();

      long result = s.solution(118372);

      System.out.println(result);
    }
}