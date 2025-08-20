//정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.

class Solution_3 {
    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }

    public static void main(String[] args) {
        Solution_3 s = new Solution_3();

        int result1 = s.solution(2, 3);
        int result2 = s.solution(11, 11);
        int result3 = s.solution(7, 99);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}