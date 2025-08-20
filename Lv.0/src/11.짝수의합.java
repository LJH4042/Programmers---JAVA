//정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

class Solution_11 {
    public int solution(int n) {
        int sum = 0;

        for(int i = 0; i <= n; i+=2) sum += i;
        
        return sum;
    }

    public static void main(String[] args) {
        Solution_11 s = new Solution_11();

        int result1 = s.solution(10);
        int result2 = s.solution(4);

        System.out.println(result1);
        System.out.println(result2);
    }
}