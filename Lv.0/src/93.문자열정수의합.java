//한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.

class Solution_93 {
    public int solution(String num_str) {
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++){
          char ch = num_str.charAt(i);
          answer += (ch - '0');
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_93 s = new Solution_93();

      int result1 = s.solution("123456789");
      int result2 = s.solution("1000000");

      System.out.println(result1);
      System.out.println(result2);
    }
}
