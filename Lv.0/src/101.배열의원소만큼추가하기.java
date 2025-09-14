//아무 원소도 들어있지 않은 빈 배열 X가 있습니다.
//양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_101 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
          for(int j = 0; j < arr[i]; j++){
            list.add(arr[i]);
          }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
          answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_101 s = new Solution_101();

      int[] result1 = s.solution(new int[] {5, 1, 4});
      int[] result2 = s.solution(new int[] {6, 6});
      int[] result3 = s.solution(new int[] {1});

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
      System.out.println(Arrays.toString(result3));
    }
}
