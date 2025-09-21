//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

class Solution_3 {
    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
      Solution_3 s = new Solution_3();

      String result1 = s.solution(3);
      String result2 = s.solution(4);

      System.out.println(result1);
      System.out.println(result2);
    }
}