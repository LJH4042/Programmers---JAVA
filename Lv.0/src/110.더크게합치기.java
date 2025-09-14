//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
//  12 ⊕ 3 = 123
//  3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

class Solution_110 {
    public int solution(int a, int b) {
        String str1 = "" + a + b;
        String str2 = "" + b + a;

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        return num1 > num2 ? num1 : num2;
    }

    public static void main(String[] args) {
      Solution_110 s = new Solution_110();

      int result1 = s.solution(9, 91);
      int result2 = s.solution(89, 8);

      System.out.println(result1);
      System.out.println(result2);
    }
}
