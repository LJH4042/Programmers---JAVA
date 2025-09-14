//단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_104 {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");

        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
          if(!str[i].equals("")) list.add(str[i]);
        }

        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
          answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_104 s = new Solution_104();

      String[] result1 = s.solution(" i    love  you");
      String[] result2 = s.solution("    programmers  "	);

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}
