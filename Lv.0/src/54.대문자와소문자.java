//문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution_54 {
    public String solution(String my_string) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++){
          char ch = my_string.charAt(i);

          if (Character.isLowerCase(ch)) answer += Character.toUpperCase(ch);
          else if (Character.isUpperCase(ch)) answer += Character.toLowerCase(ch);
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_54 s = new Solution_54();

      String result1 = s.solution("cccCCC");
      String result2 = s.solution("abCdEfghIJ");

      System.out.println(result1);
      System.out.println(result2);
    }
}