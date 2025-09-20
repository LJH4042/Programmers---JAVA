//문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.

class Solution_146 {
    public String solution(String myString, String pat) {
        for(int i = 0; i < myString.length(); i++){
          if(myString.endsWith(pat) == false) myString = myString.substring(0, myString.length() - 1);
          else break;
        }

        return myString;
    }

    public static void main(String[] args) {
      Solution_146 s = new Solution_146();

      String result1 = s.solution("AbCdEFG", "dE");
      String result2 = s.solution("AAAAaaaa", "a");

      System.out.println(result1);
      System.out.println(result2);
    }
}