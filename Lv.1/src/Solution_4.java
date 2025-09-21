class Solution_4 {
    public double solution(int[] arr) {
        double answer = 0;

        for(int i = 0; i < arr.length; i++){
          answer += arr[i];
        }

        return answer / arr.length;
    }

    public static void main(String[] args) {
      Solution_4 s = new Solution_4();

      double result1 = s.solution(new int[] {1, 2, 3, 4});
      double result2 = s.solution(new int[] {5, 5});

      System.out.println(result1);
      System.out.println(result2);
    }
}