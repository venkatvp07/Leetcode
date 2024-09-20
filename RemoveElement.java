package New;

public class RemoveElement {
	
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
    	for(int i=0;i<len;i++) {
        	if(nums[i] != val) {
        		nums[count++] = nums[i];
        	}
        }
    	
    	return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,3};
		System.out.print(removeElement(nums, 3));
	}

}
