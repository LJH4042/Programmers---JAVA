//정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution_63 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        int index = 0;

        for(int i = start_num; i >= end_num; i--){
          answer[index++] = i;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_63 s = new Solution_63();

      int[] result = s.solution(10, 3);

      System.out.println(Arrays.toString(result));
    }
}