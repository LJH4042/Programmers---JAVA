class Solution_145 {
    public String solution(String my_string, int s, int e) {
        String str1 = my_string.substring(0, s);

        String sbStr = my_string.substring(s, e + 1);
        StringBuffer sb = new StringBuffer(sbStr);
        String str2 = sb.reverse().toString();

        String str3 = my_string.substring(e + 1);

        return str1 + str2 + str3;
    }

    public static void main(String[] args) {
      Solution_145 s = new Solution_145();

      String result1 = s.solution("Progra21Sremm3", 6, 12);
      String result2 = s.solution("Stanley1yelnatS", 4, 10);

      System.out.println(result1);
      System.out.println(result2);
    }
}