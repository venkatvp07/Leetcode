package New;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
//import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		nums[0] = -1;
		nums[1] = -2;
		nums[2] = -3;
		nums[3] = -4;
		nums[4] = -5;
		int[] ans = new int[2];
		int target = -8;
//        List<Integer> hey = Arrays.stream(nums).boxed().toList();
//        
        int len = nums.length;
//        for(int i = 0;i<len;i++) {
//        	int number = hey.get(i);
//        	int need = target - number;
//        	if(hey.contains(need)) {
//        		if(hey.indexOf(need) != i) {
//        			ans[0] = i;
//            		ans[1] = hey.indexOf(need);
//            		break;
//        		}else {
//        			List<Integer> n = new ArrayList<Integer>(hey);
//        			n.remove(i);
//        			if(n.contains(number)) {
//        				ans[0] = i;
//                		ans[1] = n.indexOf(need) + 1;
//                		break;
//        			}
//        		}
//        	}
//        }
        
        
        HashMap<Integer,Integer> mapp = new HashMap<Integer,Integer>();
        for(int i = 0;i<len;i++) {
        	int number = nums[i];
        	int need = target - number;
        	if(mapp.containsKey(need)) {
        		ans[0] = i;
        		ans[1] = mapp.get(need);
        		break;
        	}else {
        		mapp.put(number, i);
        	}
        }
        
        System.out.println(ans[0]);
        System.out.println(ans[1]);
	}

}
