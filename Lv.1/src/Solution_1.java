//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.

public class Solution_1 {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        String[] arr = str.split("");

        for(String s : arr){
            int num = Integer.parseInt(s);
            answer += num;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_1 s = new Solution_1();

        int result1 = s.solution(123);
        int result2 = s.solution(987);

        System.out.println(result1);
        System.out.println(result2);
    }
}