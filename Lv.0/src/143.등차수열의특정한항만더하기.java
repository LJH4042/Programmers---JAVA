//두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
//첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

class Solution_143 {
    public int solution(int a, int d, boolean[] included) {
        int[] numArr = new int[included.length];
        int count = 0;
        int answer = 0;

        while(count < included.length){
          numArr[count++] = a;
          a += d;
        }

        for(int i = 0 ; i < included.length; i++){
          if(included[i] == true) answer += numArr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
      Solution_143 s = new Solution_143();

      int result1 = s.solution(3, 4, new boolean[] {true, false, false, true, true});
      int result2 = s.solution(7, 1, new boolean[] {false, false, false, true, false, false, false});

      System.out.println(result1);
      System.out.println(result2);
    }
}