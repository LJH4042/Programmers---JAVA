class Solution_12 {
    public boolean solution(int x) {
        int num = 0;
        int first = x;

        while(x != 0){
          num += x % 10;
          x = x / 10;
        }

        return first % num == 0;
    }

    public static void main(String[] args) {
      Solution_12 s = new Solution_12();

      boolean result1 = s.solution(10);
      boolean result2 = s.solution(12);
      boolean result3 = s.solution(11);
      boolean result4 = s.solution(13);

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
    }
}