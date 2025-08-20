//정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

class Solution_7 {
    public int solution(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Solution_7 s = new Solution_7();

        int result1 = s.solution(3, 4);
        int result2 = s.solution(27, 19);

        System.out.println(result1);
        System.out.println(result2);
    }
}