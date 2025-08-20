//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.

class Solution_2 {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Solution_2 s = new Solution_2();

        int result1 = s.solution(2, 3);
        int result2 = s.solution(100, 2);

        System.out.println(result1);
        System.out.println(result2);
    }
}