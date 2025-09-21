//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
//다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

import java.util.Arrays;

class Solution_5 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        long current = x;

        for (int i = 0; i < n; i++) {
            answer[i] = current;
            current += num;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_5 s = new Solution_5();

      long[] result1 = s.solution(2, 5);
      long[] result2 = s.solution(4, 3);
      long[] result3 = s.solution(-4, 2);

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
      System.out.println(Arrays.toString(result3));
    }
}