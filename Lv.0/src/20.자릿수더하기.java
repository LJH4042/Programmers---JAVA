//정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

class Solution_20 {
    public int solution(int n) {
        int answer = 0;

        while(n > 0){
          answer += n % 10;
          n = n / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_20 s = new Solution_20();

      int result1 = s.solution(1234);
      int result2 = s.solution(930211);

      System.out.println(result1);
      System.out.println(result2);
    }
}