//정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

class Solution_81 {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
      Solution_81 s = new Solution_81();

      int result1 = s.solution(60, 2, 3);
      int result2 = s.solution(55, 10, 5);

      System.out.println(result1);
      System.out.println(result2);
    }
}