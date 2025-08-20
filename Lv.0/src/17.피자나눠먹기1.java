//머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다.
//피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

class Solution_17 {
    public int solution(int n) {
      double div = (double) n / 7;

      return (int) Math.ceil(div);
    }

    public static void main(String[] args) {
      Solution_17 s = new Solution_17();

      int result1 = s.solution(7);
      int result2 = s.solution(1);
      int result3 = s.solution(15);

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}