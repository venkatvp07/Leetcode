package New;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

	public static int longestSubstringWithoutRepeatingCharacters(String s) { // a b c a b c b b
//		int ans = 0;
//		int len = s.length();
//		int i = 0;
//		ArrayList<String> listOfChars = new ArrayList<String>();
//		ArrayList<Integer> listOfAns = new ArrayList<Integer>();
//		while(len != i) {
//			char ch = s.charAt(i);
//			if(listOfChars.contains(String.valueOf(ch))) {
//				listOfAns.add(ans);
//				ans = 0;
//				s = s.substring(s.indexOf(String.valueOf(ch)) + 1);
//				i = 0;
//				len = s.length();
//				listOfChars = new ArrayList<String>();
//				continue;
//			}else {
//				ans++;
//			}
//			if(i == len-1) {
//				listOfAns.add(ans);
//			}
//			i++;
//			listOfChars.add(String.valueOf(ch));
//		}
//		listOfAns.sort(null);
//		if(listOfAns.size() == 0){
//			return 0;
//		}
//		return listOfAns.get(listOfAns.size()-1);
		
		int maxLength = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            int indexOfFirstAppearanceInSubstring=s.indexOf(s.charAt(right),left);
            if(indexOfFirstAppearanceInSubstring!=right)
            {
                left=indexOfFirstAppearanceInSubstring+1;
        
            }
            maxLength=Math.max(maxLength, right-left+1);
        }
        return maxLength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(longestSubstringWithoutRepeatingCharacters("dvdf"));
	}

}
