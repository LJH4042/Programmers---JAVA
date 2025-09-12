//어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
//문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

class Solution_65 {
    public int solution(String my_string, String is_prefix) {
        // if(my_string.length() < is_prefix.length()){
        //   return 0;
        // }else {
        //   String str = my_string.substring(0, is_prefix.length());
        //   return str.equals(is_prefix) ? 1 : 0;
        // }

        if(my_string.startsWith(is_prefix)) return 1;
        return 0;
    }

    public static void main(String[] args) {
      Solution_65 s = new Solution_65();

      int result1 = s.solution("banana", "ban");
      int result2 = s.solution("banana", "nan");
      int result3 = s.solution("banana", "abcd");
      int result4 = s.solution("banana", "bananan");

      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
    }
}