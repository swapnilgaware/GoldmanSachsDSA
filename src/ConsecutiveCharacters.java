public class ConsecutiveCharacters {
    public int maxPower(String s) {
        if(s == null || s == "") return 0;
        int count =0;
        int maxSize = -1;
        for(int i=1; i< s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                count=0;
            }
            if(maxSize < count){
                maxSize=count;
            }
        }
        return maxSize+1;
    }
    public static void main(String[] args) {
        ConsecutiveCharacters sol = new ConsecutiveCharacters();

        String s1 = "leetcode";
        String s2 = "abbcccddddeeeeedcba";

        System.out.println("Input: " + s1);
        System.out.println("Max Power: " + sol.maxPower(s1)); // Output: 2

        System.out.println("Input: " + s2);
        System.out.println("Max Power: " + sol.maxPower(s2)); // Output: 5
    }
}
