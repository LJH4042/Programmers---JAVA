//문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

class Solution_141 {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");

        for(int i = 0; i < indices.length; i++){
          arr[indices[i]] = "";
        }

        return String.join("", arr);
    }

    public static void main(String[] args) {
      Solution_141 s = new Solution_141();

      String result = s.solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3});

      System.out.println(result);
    }
}