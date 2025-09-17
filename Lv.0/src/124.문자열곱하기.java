//문자열 my_string과 정수 k가 주어질 때, my_string을 k번 반복한 문자열을 return 하는 solution 함수를 작성해 주세요.

class Solution_124 {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }

    public static void main(String[] args) {
      Solution_124 s = new Solution_124();

      String result1 = s.solution("string", 3);
      String result2 = s.solution("love", 10);

      System.out.println(result1);
      System.out.println(result2);
    }
}