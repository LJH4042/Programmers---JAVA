//영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

import java.util.Arrays;

class Solution_58 {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        String answer = new String(arr);
        return answer;
    }

    public static void main(String[] args) {
      Solution_58 s = new Solution_58();

      String result1 = s.solution("Bcad");
      String result2 = s.solution("heLLo");
      String result3 = s.solution("Python");

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}