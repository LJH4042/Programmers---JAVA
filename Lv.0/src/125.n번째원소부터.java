//정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution_125 {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length - n + 1;
        int[] answer = new int[len];
        int idx = 0;

        for(int i = n - 1; i< num_list.length; i++){
          answer[idx++] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_125 s = new Solution_125();

      int[] result1 = s.solution(new int[] {2, 1, 6}, 3);
      int[] result2 = s.solution(new int[] {5, 2, 1, 7, 5}, 2);

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}