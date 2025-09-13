//실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.

class Solution_79 {
    public int solution(double flo) {
        int answer = (int) flo;
        return answer;
    }

    public static void main(String[] args) {
      Solution_79 s = new Solution_79();

      int result1 = s.solution(1.42);
      int result2 = s.solution(69.32);

      System.out.println(result1);
      System.out.println(result2);
    }
}