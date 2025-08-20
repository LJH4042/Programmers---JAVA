//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
//문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution_35 {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }

    public static void main(String[] args) {
      Solution_35 s = new Solution_35();

      String result1 = s.solution("bus");
      String result2 = s.solution("nice to meet you");

      System.out.println(result1);
      System.out.println(result2);
    }
}