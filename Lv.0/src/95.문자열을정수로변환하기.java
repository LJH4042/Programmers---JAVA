//숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.

class Solution_95 {
    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }

    public static void main(String[] args) {
      Solution_95 s = new Solution_95();

      int result1 = s.solution("10");
      int result2 = s.solution("8542");

      System.out.println(result1);
      System.out.println(result2);
    }
}
