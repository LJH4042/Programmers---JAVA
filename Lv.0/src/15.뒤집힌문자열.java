//문자열 my_string이 매개변수로 주어집니다.
//my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution_15 {
    public String solution(String my_string) {
        StringBuffer str = new StringBuffer(my_string);

        return str.reverse().toString();
    }

    public static void main(String[] args) {
      Solution_15 s = new Solution_15();

      String result1 = s.solution("jaron");
      String result2 = s.solution("bread");

      System.out.println(result1);
      System.out.println(result2);
    }
}