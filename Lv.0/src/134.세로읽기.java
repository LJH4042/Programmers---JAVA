//문자열 my_string과 두 정수 m, c가 주어집니다. my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 문자열로 return 하는 solution 함수를 작성해 주세요.

class Solution_134 {
    public String solution(String my_string, int m, int c) {
        String[] arr = my_string.split("");
        String answer = "";

        for(int i = c - 1; i < arr.length; i += m){
          answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_134 s = new Solution_134();

      String result1 = s.solution("ihrhbakrfpndopljhygc", 4, 2);
      String result2 = s.solution("programmers", 1, 1);

      System.out.println(result1);
      System.out.println(result2);
    }
}