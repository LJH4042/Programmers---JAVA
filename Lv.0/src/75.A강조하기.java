//문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.

class Solution_75 {
    public String solution(String myString) {
        String answer = myString.toLowerCase().replace("a", "A");
        return answer;
    }

    public static void main(String[] args) {
      Solution_75 s = new Solution_75();

      String result1 = s.solution("abstract algebra");
      String result2 = s.solution("PrOgRaMmErS");

      System.out.println(result1);
      System.out.println(result2);
    }
}