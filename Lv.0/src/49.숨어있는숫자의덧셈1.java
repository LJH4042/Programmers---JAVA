//문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

class Solution_49 {
    public int solution(String my_string) {
        String str = my_string.replaceAll("[A-Z|a-z]", "");
        int answer = 0;

        for(int i = 0; i < str.length(); i++){
          answer += str.charAt(i) -48;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_49 s = new Solution_49();

      int result1 = s.solution("aAb1B2cC34oOp");
      int result2 = s.solution("1a2b3c4d123");

      System.out.println(result1);
      System.out.println(result2);
    }
}