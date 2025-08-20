//정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 마지막 원소까지 n개 간격으로 저장되어있는 원소들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;
import java.util.Arrays;

class Solution_37 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < num_list.length; i+=n){
          list.add(num_list[i]);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
          answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_37 s = new Solution_37();

      int[] result1 = s.solution(new int[] {4, 2, 6, 1, 7, 6}, 2);
      int[] result2 = s.solution(new int[] {4, 2, 6, 1, 7, 6}, 4);

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}