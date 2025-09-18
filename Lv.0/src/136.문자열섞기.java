//길이가 같은 두 문자열 str1과 str2가 주어집니다.
//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.

class Solution_136 {
    public String solution(String str1, String str2) {
        int idx = str1.length() + str2.length();
        String answer = "";

        for(int i = 0; i < idx; i++){
          if(i % 2 == 0) answer += str1.charAt((i / 2));
          else answer += str2.charAt((i / 2));
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_136 s = new Solution_136();

      String result1 = s.solution("aaaaa", "bbbbb");

      System.out.println(result1);
    }
}