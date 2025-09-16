//어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
//문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

class Solution_117 {
    public int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }

    public static void main(String[] args) {
      Solution_117 s = new Solution_117();

      int result1 = s.solution("banana", 	"ana");
      int result2 = s.solution("banana", 	"nan");
      int result3 = s.solution("banana", 	"wxyz");
      int result4 = s.solution("banana", 	"abanana");

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
    }
}