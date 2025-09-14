//단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

import java.util.Arrays;

class Solution_106 {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }

    public static void main(String[] args) {
      Solution_106 s = new Solution_106();

      String[] result1 = s.solution("i love you");
      String[] result2 = s.solution("programmers");

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}