//군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
//  - 암호화된 문자열 cipher를 주고받습니다.
//  - 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
//문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.


class Solution_53 {
    public String solution(String cipher, int code) {
        String answer = "";

        for(int i = code - 1; i < cipher.length(); i += code){
          char ch = cipher.charAt(i);
          answer += ch;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_53 s = new Solution_53();

      String result1 = s.solution("dfjardstddetckdaccccdegk", 4);
      String result2 = s.solution("pfqallllabwaoclk", 2);

      System.out.println(result1);
      System.out.println(result2);
    }
}