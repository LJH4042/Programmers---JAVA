//약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;

class Solution_137 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
          ArrayList<Integer> list = new ArrayList<>();

          for(int j = 1; j <= i; j++){
            if(i % j == 0) list.add(j);
          }
          
          if(list.size() >= 3) answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_137 s = new Solution_137();

      int result1 = s.solution(10);
      int result2 = s.solution(15);

      System.out.println(result1);
      System.out.println(result2);
    }
}