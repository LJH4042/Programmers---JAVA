//정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution_92 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }

    public static void main(String[] args) {
      Solution_92 s = new Solution_92();

      int[] result = s.solution(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10});

      System.out.println(Arrays.toString(result));
    }
}
