//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

class Solution_52 {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
          for(int j = 0; j < numbers.length; j++){
            if(i != j){
                int num = numbers[i] * numbers[j];
                if(num > answer) answer = num;
            }
          }
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_52 s = new Solution_52();

      int result1 = s.solution(new int[] {1, 2, -3, 4, -5});
      int result2 = s.solution(new int[] {0, -31, 24, 10, 1, 9});
      int result3 = s.solution(new int[] {10, 20, 30, 5, 5, 20, 5});

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}