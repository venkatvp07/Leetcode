package New;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
    	int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i] == target) {
        		min = i - 1;
        		break;
        	}
        	if(nums[i] < target){
        		min = i;
        	}
        }
        if(min == Integer.MAX_VALUE) {
        	return 0;
        }else if(min == -1) {
        	return 0;
        }else if(nums[min] < target) {
        	return min+=1;
        }
    	return min;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		System.out.println(searchInsert(nums, 1));
	}

}
