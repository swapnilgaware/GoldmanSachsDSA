import java.util.*;

public class TwoSum {
    public int[] twoSum( int[] nums, int target){
        Map<Integer,Integer> diff = new HashMap<>();
        int[] result = new int[2];
        for(int i =0; i<nums.length;i++){
            if(diff.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=diff.get(target-nums[i]);
                return result;
            }else{
                diff.put(nums[i],i);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums={3,2,4};
        int target =6;

        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
