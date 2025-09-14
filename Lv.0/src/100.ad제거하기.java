//문자열 배열 strArr가 주어집니다.
//배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution_100 {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++){
          if(!strArr[i].contains("ad")) list.add(strArr[i]);
        }

        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
          answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_100 s = new Solution_100();

      String[] result1 = s.solution(new String[] {"and","notad","abcd"});
      String[] result2 = s.solution(new String[] {"there","are","no","a","ds"});

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}
