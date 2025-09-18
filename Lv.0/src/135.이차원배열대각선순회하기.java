//2차원 정수 배열 board와 정수 k가 주어집니다.
//i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.

class Solution_135 {
    public int solution(int[][] board, int k) {
        int answer = 0;

        for(int i = 0; i < board.length; i++){
          for(int j = 0; j < board[i].length; j++){
            if(i + j <= k) answer += board[i][j];
          }
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_135 s = new Solution_135();

      int result = s.solution(new int[][] {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 2);

      System.out.println(result);
    }
}