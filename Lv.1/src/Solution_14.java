class Solution_14 {
    public int solution(int[] numbers) {
        int answer = 45;

        for(int i = 0; i < numbers.length; i++){
          answer -= numbers[i];
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_14 s = new Solution_14();

      int result1 = s.solution(new int[] {1,2,3,4,6,7,8,0});
      int result2 = s.solution(new int[] {5,8,4,0,6,7,9});

      System.out.println(result1);
      System.out.println(result2);
    }
}