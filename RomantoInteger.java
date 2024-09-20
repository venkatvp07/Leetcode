package New;

import java.util.HashMap;

public class RomantoInteger {

	public static int romanToInt(String s) {
        HashMap<Character,Integer> romanMap = new HashMap<Character,Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
		
        int ans = 0;
        
        int len = s.length();
        for(int i=0;i<len;i++) {
        	int val = 0;
        	int curr = romanMap.get(s.charAt(i));
        	if(len-1 > i) {
        		int next = romanMap.get(s.charAt(i+1));
            	if(curr < next ) {
            		val = next - curr;
            		i++;
            	}else {
            		val = curr;
            	}
        	}else {
        		val = curr;
        	}
        	ans+=val;
        }
		return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("MCMXCIV"));
	}

}
