//정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution_82 {
    public int solution(int[] num_list, int n) {
        Arrays.sort(num_list);

        int index = Arrays.binarySearch(num_list, n);

        return index > 0 ? 1 : 0;
    }

    public static void main(String[] args) {
      Solution_82 s = new Solution_82();

      int result1 = s.solution(new int[] {1, 2, 3, 4, 5}, 3);
      int result2 = s.solution(new int[] {15, 98, 23, 2, 15}, 20);

      System.out.println(result1);
      System.out.println(result2);
    }
}