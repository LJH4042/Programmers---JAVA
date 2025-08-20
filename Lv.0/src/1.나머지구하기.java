//정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

class Solution_1 {
    public int solution(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        Solution_1 s = new Solution_1();

        int result1 = s.solution(3, 2);
        int result2 = s.solution(10, 5);

        System.out.println(result1);
        System.out.println(result2);
    }
}
