class Solution_10 {
    boolean solution(String s) {
        String[] arr = s.toLowerCase().split("");
        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i < arr.length; i++){
          if(arr[i].equals("p")) pCount += 1;
          else if(arr[i].equals("y")) yCount += 1;
        }

        return pCount == yCount ? true : false;
    }

    public static void main(String[] args) {
      Solution_10 s = new Solution_10();

      boolean result1 = s.solution("pPoooyY");
      boolean result2 = s.solution("Pyy");

      System.out.println(result1);
      System.out.println(result2);
    }
}