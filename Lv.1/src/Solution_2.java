//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.

import java.util.Arrays;

class Solution_2 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] arr = str.split("");
        int[] answer = new int[arr.length];
        int len = arr.length - 1;

        for(String s : arr){
          int num = Integer.parseInt(s);
          answer[len--] = num;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_2 s = new Solution_2();

      int[] result1 = s.solution(12345);

      System.out.println(Arrays.toString(result1));
    }
}