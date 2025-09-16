//알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
//단, 알파벳 대문자와 소문자는 구분하지 않습니다.

class Solution_113 {
    public int solution(String myString, String pat) {
        String str1 = myString.toLowerCase();
        String str2 = pat.toLowerCase();
        return str1.contains(str2) ? 1 : 0;
    }

    public static void main(String[] args) {
      Solution_113 s = new Solution_113();

      int result1 = s.solution("AbCdEfG", "aBc");
      int result2 = s.solution("aaAA", "aaaaa");

      System.out.println(result1);
      System.out.println(result2);
    }
}