//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, [s, e] 꼴입니다.
//각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
//위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

import java.util.Arrays;

class Solution_140 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for(int i = 0; i < queries.length; i++){
          for(int j = queries[i][0]; j <= queries[i][1]; j++){
            answer[j] = answer[j] + 1;
          }
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_140 s = new Solution_140();

      int[] result1 = s.solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0, 1}, {1, 2}, {2, 3}});

      System.out.println(Arrays.toString(result1));
    }
}