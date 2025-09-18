//문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
//단, 빈 문자열은 반환할 배열에 넣지 않습니다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution_133 {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");

        List<String> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
          if(!arr[i].isEmpty()){
            list.add(arr[i]);
          }
        }

        Collections.sort(list);

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
      Solution_133 s = new Solution_133();

      String[] result1 = s.solution("axbxcxdx");
      String[] result2 = s.solution("dxccxbbbxaaaa");

      System.out.println(Arrays.toString(result1));
      System.out.println(Arrays.toString(result2));
    }
}