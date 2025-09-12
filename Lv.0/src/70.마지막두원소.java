import java.util.Arrays;

class Solution_70 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);

        if(num_list[num_list.length - 1] > num_list[num_list.length - 2]){
          answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        }else {
          answer[num_list.length] = num_list[num_list.length - 1] * 2;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_70 s = new Solution_70();

      int[] result1 = s.solution(new int[] {2, 1, 6});
      int[] result2 = s.solution(new int[] {5, 2, 1, 7, 5});

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}