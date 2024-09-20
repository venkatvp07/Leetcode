package New;

public class MinBitFlips2220 {

	public static int getMinBitFlip(int start,int goal) {
		String valBin = Integer.toBinaryString(start);
		int valBinLen = valBin.length();
		
		String goalBin = Integer.toBinaryString(goal);
		int goalBinLen = goalBin.length();
		
		if(valBinLen > goalBinLen) {
			String addedVal = "";
			for(int i = 0; i < (valBinLen - goalBinLen) ; i++) {
				addedVal += "0";
			}
			goalBin = addedVal + goalBin;
		}else if(valBinLen < goalBinLen){
			String addedVal = "";
			for(int i = 0; i < (goalBinLen - valBinLen) ; i++) {
				addedVal += "0";
			}
			valBin = addedVal + valBin;
		}
		
		valBinLen = valBin.length();
		
		int ans = 0;
		for(int i=0;i<valBinLen;i++) {
			char a = valBin.charAt(i);
			char b = goalBin.charAt(i);
			if(a != b) {
				ans+=1;
			}
		}
		
//		String valBin = Integer.toBinaryString(start);
//		String goalBin = Integer.toBinaryString(goal);
//		
//		Integer n = Integer.valueOf(valBin) ^ Integer.valueOf(goalBin);
//		
//		System.out.println(Integer.valueOf(valBin));
//		System.out.println(Integer.valueOf(goalBin));
//		System.out.println(n);
//		String s = n.toString();
//		int sLen = s.length();
//		for(int i=0;i<sLen;i++) {
//			ans += Integer.valueOf(Integer.parseInt( s.charAt(i)+"") );
//		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMinBitFlip(10,7));
	}

}
