//순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다.
//자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.

class Solution_27 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
          if(n % i == 0) answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_27 s = new Solution_27();

      int result1 = s.solution(20);
      int result2 = s.solution(100);

      System.out.println(result1);
      System.out.println(result2);
    }
}