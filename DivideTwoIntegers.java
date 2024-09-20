package New;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
    	if(dividend == -2147483648) {
    		return 2147483647;
    	}
    	return dividend/divisor;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-2147483648,-1));
	}

}
