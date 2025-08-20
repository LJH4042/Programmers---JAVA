//문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 앞의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

class Solution_36 {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0, n);
        return answer;
    }

    public static void main(String[] args) {
      Solution_36 s = new Solution_36();

      String result1 = s.solution("ProgrammerS123", 11);
      String result2 = s.solution("He110W0r1d", 5);

      System.out.println(result1);
      System.out.println(result2);
    }
}