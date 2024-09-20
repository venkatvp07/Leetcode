package New;

import java.util.*;

public class RemoveDuplicatesfromSortedArray {
	
    public static int removeDuplicates(int[] nums) {
    	int count = 0;
    	for(int i=0;i<nums.length;i++) {
    		if(i<nums.length -1 && nums[i] == nums[i+1]) {
    			continue;
    		}else {
    			nums[count] = nums[i];
    			count++;
    		}
    	}
    	
    	return count;
        
//        Set<Integer> hSet = new HashSet<Integer>(Arrays.stream(nums).boxed().toList());
//        
//        List<Integer> out = hSet.stream().toList();
//        for(int i=0;i<out.size();i++) {
//        	nums[i] = out.get(i);
//        	System.out.println(out.get(i));
//        }
//    	return hSet.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-3,-1,0,0,0,3,3};
		System.out.print(removeDuplicates(nums));
		
	}

}
