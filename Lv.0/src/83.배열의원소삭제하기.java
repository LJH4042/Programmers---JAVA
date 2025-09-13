//정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_83 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
          list.add(num);
        }

        for(int num : delete_list){
          list.remove((Integer)num);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
          answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_83 s = new Solution_83();

      int[] result1 = s.solution(new int[] {293, 1000, 395, 678, 94}, new int[] {94, 777, 104, 1000, 1, 12});
      int[] result2 = s.solution(new int[] {110, 66, 439, 785, 1}, new int[] {377, 823, 119, 43});

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}