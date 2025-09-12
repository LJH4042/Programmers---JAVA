import java.util.Arrays;

class Solution_64 {
    public int[] solution(int n, int k) {
        int idx = 0;
        int len = n / k;
        int[] answer = new int[len];

        for(int i = k; i <= n; i+=k){
          answer[idx++] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_64 s = new Solution_64();

      int[] result1 = s.solution(10, 3);
      int[] result2 = s.solution(15, 5);

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}