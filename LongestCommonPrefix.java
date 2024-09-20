package New;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String first = strs[0];
        int firstStrLen = first.length();
        
        String longestCommonPrefix = "";
        for(int i=0;i<firstStrLen;i++) {
        	char ch = first.charAt(i);
        	boolean stop = false;
        	for(int j=1;j<len;j++) {
        		String str = strs[j];
        		if(str.length() > i) {
        			char compareCh = str.charAt(i);
            		if(ch != compareCh) {
            			stop = true;
            		}
        		}else {
        			stop = true;
        		}
        		
        	}
        	if(!stop) {
        		longestCommonPrefix += String.valueOf(ch);
        	}else {
        		break;
        	}
        }
		return longestCommonPrefix;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[] {"ab","a"};
		
		System.out.println(longestCommonPrefix(strs));
	}

}
