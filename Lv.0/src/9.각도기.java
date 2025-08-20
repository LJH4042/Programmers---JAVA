//각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다.
//각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.

//예각 : 0 < angle < 90
//직각 : angle = 90
//둔각 : 90 < angle < 180
//평각 : angle = 180

class Solution_9 {
    public int solution(int angle) {
      int result = 0;

      if(angle > 0 && angle < 90) result = 1;
      else if(angle == 90) result = 2;
      else if(angle > 90 && angle < 180) result = 3;
      else if(angle == 180) result = 4;

      return result;
    }

    public static void main(String[] args) {
        Solution_9 s = new Solution_9();

        int result1 = s.solution(70);
        int result2 = s.solution(91);
        int result3 = s.solution(180);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}