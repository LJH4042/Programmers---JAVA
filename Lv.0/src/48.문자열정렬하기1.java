//문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

import java.util.Arrays;

class Solution_48 {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[A-Z|a-z]", "");

        int[] answer = new int[str.length()];

        for(int i = 0; i < str.length(); i++){
          answer[i] = str.charAt(i) - 48;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
      Solution_48 s = new Solution_48();

      int[] result1 = s.solution("hi12392");
      int[] result2 = s.solution("p2o4i8gj2");
      int[] result3 = s.solution("abcde0");

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
      System.out.println(Arrays.toString(result3));
    }
}