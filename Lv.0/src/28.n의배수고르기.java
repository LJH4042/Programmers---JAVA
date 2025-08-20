//정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;
import java.util.Arrays;

class Solution_28 {
    public int[] solution(int n, int[] numlist) {
       ArrayList<Integer> list = new ArrayList<>();

       for(int i = 0; i < numlist.length; i++){
        if(numlist[i] % n == 0) list.add(numlist[i]);
       }

       int[] answer = new int[list.size()];
       
       for(int i = 0; i < list.size(); i++){
        answer[i] = list.get(i);
       }

       return answer;
    }

    public static void main(String[] args) {
      Solution_28 s = new Solution_28();

      int[] result1 = s.solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12});
      int[] result2 = s.solution(5, new int[] {1, 9, 3, 10, 13, 5});
      int[] result3 = s.solution(12, new int[] {2, 100, 120, 600, 12, 12});

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
      System.out.println(Arrays.toString(result3));
    }
}