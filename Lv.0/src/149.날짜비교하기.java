//정수 배열 date1과 date2가 주어집니다. 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
//만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.

class Solution_149 {
    public int solution(int[] date1, int[] date2) {
        String str1 = "" + date1[0] + date1[1] + date1[2];
        String str2 = "" + date2[0] + date2[1] + date2[2];

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        return num1 < num2 ? 1 : 0;
    }

    public static void main(String[] args) {
      Solution_149 s = new Solution_149();

      int result1 = s.solution(new int[] {2021, 12, 28}, new int[] {2021, 12, 29});
      int result2 = s.solution(new int[] {1024, 10, 24}, new int[] {1024, 10, 24});

      System.out.println(result1);
      System.out.println(result2);
    }
}