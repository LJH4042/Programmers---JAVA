class Solution_9 {
    public long solution(int a, int b) {
        long answer = 0;

        for(int i = Math.min(a, b); i <= Math.max(a, b); i++){
          answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_9 s = new Solution_9();

      long result1 = s.solution(3, 5);
      long result2 = s.solution(3, 3);
      long result3 = s.solution(5, 3);

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}