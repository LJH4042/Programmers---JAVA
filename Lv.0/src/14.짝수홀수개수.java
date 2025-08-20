//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

import java.util.Arrays;

class Solution_14 {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0) answer[0] += 1;
            else if(num_list[i] % 2 == 1) answer[1] += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_14 s = new Solution_14();

        int[] result1 = s.solution(new int[] {1, 2, 3, 4, 5});
        int[] result2 = s.solution(new int[] {1, 3, 5, 7});

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}