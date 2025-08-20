//문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution_34 {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        answer = my_string.replace(letter, "");

        return answer;
    }

    public static void main(String[] args) {
      Solution_34 s = new Solution_34();

      String result1 = s.solution("abcdef", "f");
      String result2 = s.solution("BCBdbe", "B");

      System.out.println(result1);
      System.out.println(result2);
    }
}