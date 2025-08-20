//어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
//정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

class Solution_33 {
    public int solution(int n) {
        int answer = 0;

        if(Math.sqrt(n) % 1 == 0) answer = 1;
        else answer = 2;

        return answer;
    }

    public static void main(String[] args) {
      Solution_33 s = new Solution_33();

      int result1 = s.solution(144);
      int result2 = s.solution(976);

      System.out.println(result1);
      System.out.println(result2);
    }
}