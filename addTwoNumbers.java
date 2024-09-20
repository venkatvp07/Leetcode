package New;

import java.util.ArrayList;

public class addTwoNumbers {

	public static int getNum(int[] hey) {
		int ans = 0;
		int len = hey.length;
		
		for(int i=len-1;i>=0;i--) {
			ans += (hey[i] * Math.pow(10,i));
		}
		return ans;
	}
	
	
	public static void print(int i) {
		ArrayList<Integer> hey = new ArrayList<Integer>();
		while(i!=0) {
			hey.add(i%10);
			i/=10;
		}
		for(int j=hey.size()-1;j>=0;j--) {
			System.out.println(hey.get(j));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = new int[3];
		num1[0] = 2;
		num1[1] = 4;
		num1[2] = 3;
		
		int[] num2 = new int[3];
		num2[0] = 5;
		num2[1] = 6;
		num2[2] = 4;
		
		print(getNum(num1) + getNum(num2));
	}

}
