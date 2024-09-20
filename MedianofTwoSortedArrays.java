package New;

import java.util.*;

public class MedianofTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		List<Double> doubleList = new ArrayList<Double>();
		int nums1Len = nums1.length;
		int nums2Len = nums2.length;
		int size = nums1Len;
		if(nums1Len < nums2Len) {
			size = nums2Len;
		}
		
		for(int i=0;i<size;i++) {
			if(nums1Len>i) {
				doubleList.add((double)nums1[i]);
			}
			if(nums2Len>i) {
				doubleList.add((double)nums2[i]);
			}
		}
		
		Collections.sort(doubleList);
        int ansIndex = doubleList.size();
        return ansIndex % 2 != 0 ? doubleList.get((ansIndex/2)) : (doubleList.get(ansIndex/2) + doubleList.get((ansIndex/2)-1))/2;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[1];
		nums1[0] = 1;
		
		int[] nums2 = new int[1];
		nums2[0] = 3;
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}

}
