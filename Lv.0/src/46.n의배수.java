//정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.

class Solution_46 {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
      Solution_46 s = new Solution_46();

      int result1 = s.solution(98, 2);
      int result2 = s.solution(34, 3);

      System.out.println(result1);
      System.out.println(result2);
    }
}