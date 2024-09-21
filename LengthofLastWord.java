package New;

public class LengthofLastWord {
    public static int lengthOfLastWord(String s) {
    	String[] split = s.split(" ");
    	String out = split[split.length-1];
    	
        return out.length();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(lengthOfLastWord("luffy is still joyboy"));
	}

}
