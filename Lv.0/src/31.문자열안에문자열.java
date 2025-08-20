//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.

class Solution_31 {
    public int solution(String str1, String str2) {
        int answer = 0;

        if(str1.contains(str2)) answer = 1;
        else answer = 2;
        
        return answer;
    }

    public static void main(String[] args) {
      Solution_31 s = new Solution_31();

      int result1 = s.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
      int result2 = s.solution("ppprrrogrammers", "pppp");
      int result3 = s.solution("AbcAbcA", "AAA");

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}