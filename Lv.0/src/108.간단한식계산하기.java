//문자열 binomial이 매개변수로 주어집니다.
//binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.

class Solution_108 {
    public int solution(String binomial) {
        int answer = 0;
        String str = binomial;
        String[] arr = str.split(" ");

        switch (arr[1]) {
          case "+":
            answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
            break;
          case "-":
            answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            break;
          case "*":
            answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
            break;
          default:
            break;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_108 s = new Solution_108();

      int result1 = s.solution("43 + 12");
      int result2 = s.solution("0 - 7777");
      int result3 = s.solution("40000 * 40000");

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
    }
}
