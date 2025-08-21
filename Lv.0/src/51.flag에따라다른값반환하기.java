//두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

class Solution_51 {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }

    public static void main(String[] args) {
      Solution_51 s = new Solution_51();

      int result1 = s.solution(-4, 7, true);
      int result2 = s.solution(-4, 7, false);

      System.out.println(result1);
      System.out.println(result2);
    }
}