//정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.

class Solution_90 {
    public String solution(int n) {
        return String.valueOf(n);
    }

    public static void main(String[] args) {
      Solution_90 s = new Solution_90();

      String result1 = s.solution(123);
      String result2 = s.solution(2573);

      System.out.println(result1);
      System.out.println(result2);
    }
}
