//정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution_85 {
    public String solution(String n_str) {
        int answer = Integer.parseInt(n_str);
        return String.valueOf(answer);
    }

    public static void main(String[] args) {
      Solution_85 s = new Solution_85();

      String result1 = s.solution("0010");
      String result2 = s.solution("854020");

      System.out.println(result1);
      System.out.println(result2);
    }
}