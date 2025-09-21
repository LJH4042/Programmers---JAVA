//문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

class Solution_7 {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
      Solution_7 s = new Solution_7();

      int result = s.solution("1234");

      System.out.println(result);
    }
}