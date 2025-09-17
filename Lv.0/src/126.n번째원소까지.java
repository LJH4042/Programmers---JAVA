//정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution_126 {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }

    public static void main(String[] args) {
      Solution_126 s = new Solution_126();

      int[] result1 = s.solution(new int[] {2, 1, 6}, 1);
      int[] result2 = s.solution(new int[] {5, 2, 1, 7, 5}, 3);

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}