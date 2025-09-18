//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution_131 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if(direction.equals("right")){
          answer[0] = numbers[numbers.length - 1];
          for(int i = 0; i < numbers.length - 1; i++){
            answer[i + 1] = numbers[i];
          }
        }else if(direction.equals("left")){
          for(int i = 1; i < numbers.length; i++){
            answer[i - 1] = numbers[i];
          }
          answer[numbers.length - 1] = numbers[0];
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_131 s = new Solution_131();

      int[] result1 = s.solution(new int[] {1, 2, 3}, "right");
      int[] result2 = s.solution(new int[] {4, 455, 6, 4, -1, 45, 6}, 	"left");

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}