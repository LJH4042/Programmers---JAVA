//문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution_29 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++){
          answer[i] = strlist[i].length();
        }
        
        return answer;
    }

    public static void main(String[] args) {
      Solution_29 s = new Solution_29();

      int[] result1 = s.solution(new String[] {"We", "are", "the", "world!"});
      int[] result2 = s.solution(new String[] {"I", "Love", "Programmers."});

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}