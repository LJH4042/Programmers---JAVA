//문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.

class Solution_147 {
    public int solution(String myString, String pat) {
        int answer = 0;

        for(int i = 0; i < myString.length(); i++){
          String str = myString.substring(i);
          if(str.startsWith(pat)) answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_147 s = new Solution_147();

      int result1 = s.solution("banana", "ana");
      int result2 = s.solution("aaaa", "aa");

      System.out.println(result1);
      System.out.println(result2);
    }
}