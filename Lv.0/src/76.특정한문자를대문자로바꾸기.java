//영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
//my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

class Solution_76 {
    public String solution(String my_string, String alp) {
        String answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
    }

    public static void main(String[] args) {
      Solution_76 s = new Solution_76();

      String result1 = s.solution("programmers", "p");
      String result2 = s.solution("lowercase", "x");

      System.out.println(result1);
      System.out.println(result2);
    }
}