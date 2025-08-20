//선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
//  - 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
//삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution_22 {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        if(sides[0] + sides[1] > sides[2]) return 1;
        else return 2;
    }

    public static void main(String[] args) {
      Solution_22 s = new Solution_22();

      int result1 = s.solution(new int[] {1, 2, 3});
      int result2 = s.solution(new int[] {3, 6, 2});
      int result3 = s.solution(new int[] {199, 72, 222});

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}