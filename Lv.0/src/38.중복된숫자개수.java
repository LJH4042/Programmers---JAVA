//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

class Solution_38 {
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i = 0; i < array.length; i++){
          if(array[i] == n) answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_38 s = new Solution_38();

      int result1 = s.solution(new int[] {1, 1, 2, 3, 4, 5}, 1);
      int result2 = s.solution(new int[] {0, 2, 3, 4}, 1);

      System.out.println(result1);
      System.out.println(result2);
    }
}