import java.util.*;
public class TwoSum{
    public int[] twoSum(int[] nums, int target){
        HashMap hm = new HashMap();
        int remain=0;
        int []result = new int [2];
        for(int i=0; i<nums.length; i++){
            remain = target - nums[i];
            if(hm.containsKey(remain)){
                result[0]=(int)hm.get(remain);
                result[1]=i;
                return result;
            }
            else{
                hm.put(nums[i], i);
            }
        } 
        return result;
    }
}