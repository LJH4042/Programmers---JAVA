//문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_103 {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        String[] str = myString.split("x");

        for(int i = 0; i < str.length; i++){
          list.add(str[i].length());
        }

        if(myString.endsWith("x")) list.add(0);

        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
          answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_103 s = new Solution_103();

      int[] result1 = s.solution("oxooxoxxox");
      int[] result2 = s.solution("xabcxdefxghi");

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}
