//알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요.

class Solution_111 {
    public String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
      Solution_111 s = new Solution_111();

      String result1 = s.solution("aBcDeFg");
      String result2 = s.solution("AAA");

      System.out.println(result1);
      System.out.println(result2);
    }
}