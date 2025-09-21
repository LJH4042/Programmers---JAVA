//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

class Solution_8 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
          if(n % i == 0) answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_8 s = new Solution_8();

      int result1 = s.solution(12);
      int result2 = s.solution(5);

      System.out.println(result1);
      System.out.println(result2);
    }
}