//정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

class Solution_59 {
    public int solution(int num, int k) {
        String str = Integer.toString(num);

        for(int i = 0; i < str.length(); i++){
          char ch = str.charAt(i);
          int in = ch -'0';
          if(in == k) return i + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
      Solution_59 s = new Solution_59();

      int result1 = s.solution(29183, 1);
      int result2 = s.solution(232443, 4);
      int result3 = s.solution(123456, 7);

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}