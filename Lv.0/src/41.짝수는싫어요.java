//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;
import java.util.Arrays;

class Solution_41 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
          if(i % 2 == 1) list.add(i);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
          answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_41 s = new Solution_41();

      int[] result1 = s.solution(10);
      int[] result2 = s.solution(15);

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}