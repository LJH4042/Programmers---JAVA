//정수 배열 numbers와 정수 n이 매개변수로 주어집니다.
//numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 이때까지 더했던 원소들의 합을 return 하는 solution 함수를 작성해 주세요.

class Solution_60 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int index = 0;

        while(answer <= n){
          answer += numbers[index];
          index++;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_60 s = new Solution_60();

      int result1 = s.solution(new int[] {34, 5, 71, 29, 100, 34}, 123);
      int result2 = s.solution(new int[] {58, 44, 27, 10, 100}, 139);

      System.out.println(result1);
      System.out.println(result2);
    }
}