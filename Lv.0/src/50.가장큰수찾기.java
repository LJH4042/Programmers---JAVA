import java.util.Arrays;

class Solution_50 {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index = 0;

        for(int i = 0; i < array.length; i++){
          if(array[i] >= max){
            max = array[i];
            index = i;
          }
        }

        answer[0] = max;
        answer[1] = index;

        return answer;
    }

    public static void main(String[] args) {
      Solution_50 s = new Solution_50();

      int[] result1 = s.solution(new int[] {1, 8, 3});
      int[] result2 = s.solution(new int[] {9, 10, 11, 8});

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}