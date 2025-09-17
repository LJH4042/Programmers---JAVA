//머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
//n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.

class Solution_129 {
    public int solution(int n) {
        int idx = 1;

        while(true){
          if(idx % 6 == 0 && idx % n == 0){
            return idx / 6;
          }

          idx++;
        }
    }

    public static void main(String[] args) {
      Solution_129 s = new Solution_129();

      int result1 = s.solution(6);
      int result2 = s.solution(10);
      int result3 = s.solution(4);

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}