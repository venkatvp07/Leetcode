package New;

import java.util.*;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
//		if(x<0) {
//			return false;
//		}
//		List<Integer> list = new ArrayList<Integer>();
//        while(x!=0) {
//        	list.add(x%10);
//        	x/=10;
//        }
//        int size = list.size();
//        
//        for(int i=0;i<size/2;i++) {
//        	if(list.get(i) != list.get(size-i-1)) {
//        		return false;
//        	}
//        }
        
        int temp = x;
        int reverse = 0;
        while(temp>0) {
        	reverse = (reverse*10) + temp%10;
        	temp/=10;
        }
        
        return reverse == x;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));
	}

}
