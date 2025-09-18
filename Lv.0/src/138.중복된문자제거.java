//문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution_138 {
    public String solution(String my_string) {
        String[] arr = my_string.split("");
        Set<String> list = new LinkedHashSet<>();

        for(int i = 0; i < my_string.length(); i++){
          list.add(arr[i]);
        }

        String answer = "";

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
          String ele = iterator.next();
          answer += ele;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_138 s = new Solution_138();

      String result1 = s.solution("people");
      String result2 = s.solution("We are the world");

      System.out.println(result1);
      System.out.println(result2);
    }
}