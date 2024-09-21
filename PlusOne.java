package New;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
    	
    	int len = digits.length;
    	int[] dummy = new int[0];
    	boolean needLoop = true;
    	int remaining = 1;
    	for(int i=len-1;i>=0;i--) {
    		if(needLoop) {
    			int add = digits[i] + remaining;
        		if(add == 10) {
        			if(i == 0) {
        				dummy = new int[len+1];
        				dummy[i] = 1;
        			}
        			remaining = 1;
        			digits[i] = 0;
        			needLoop = true;
        		}else {
        			digits[i] = add;
        			remaining = 0;
        			needLoop = false;
        		}
    		}
    	}
    	
    	if(dummy.length!=0) {
    		for(int i=0;i<len;i++) {
    			dummy[i+1] = digits[i];
    		}
    		return dummy;
    	}
    	return digits;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9};
		digits = plusOne(digits);
		for(int i=0;i<digits.length;i++) {
			System.out.println(digits[i]);
		}
	}

}
