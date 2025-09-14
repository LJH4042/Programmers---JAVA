//정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.

class Solution_91 {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;

        for(int i = 0; i < num_list.length; i++){
          sum += num_list[i];
          multi *= num_list[i];
        }

        return (sum * sum) > multi ? 1 : 0;
    }

    public static void main(String[] args) {
      Solution_91 s = new Solution_91();

      int result1 = s.solution(new int[] {3, 4, 5, 2, 1});
      int result2 = s.solution(new int[] {5, 7, 8, 3});

      System.out.println(result1);
      System.out.println(result2);
    }
}