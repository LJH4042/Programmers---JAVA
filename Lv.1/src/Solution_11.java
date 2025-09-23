class Solution_11 {
    public long solution(long n) {
        double answer = Math.sqrt(n);

        if(answer == Math.floor(answer)){
          return (long) ((long)(answer + 1) * (answer + 1));
        }

        return -1;
    }

    public static void main(String[] args) {
      Solution_11 s = new Solution_11();

      long result1 = s.solution(121);
      long result2 = s.solution(3);

      System.out.println(result1);
      System.out.println(result2);
    }
}