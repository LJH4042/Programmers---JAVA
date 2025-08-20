//정수 배열 numbers가 매개변수로 주어집니다.
//numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

class Solution_13 {
    public double solution(int[] numbers) {
        double sum = 0;

        for(int i = 0; i < numbers.length; i++){
          sum += numbers[i];
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        Solution_13 s = new Solution_13();

        double result1 = s.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        double result2 = s.solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});

        System.out.println(result1);
        System.out.println(result2);
    }
}