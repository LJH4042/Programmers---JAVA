//정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.

class Solution_118 {
    public int solution(int[] num_list) {
        int len = num_list.length;

        if(len > 10){
          int answer = 0;

          for(int i = 0; i < num_list.length; i++){
            answer += num_list[i];
          }

          return answer;
        }else{
          int answer = 1;

          for(int i = 0; i < num_list.length; i++){
            answer *= num_list[i];
          }

          return answer;
        }
    }

    public static void main(String[] args) {
      Solution_118 s = new Solution_118();

      int result1 = s.solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1});
      int result2 = s.solution(new int[] {2, 3, 4, 5});

      System.out.println(result1);
      System.out.println(result2);
    }
}