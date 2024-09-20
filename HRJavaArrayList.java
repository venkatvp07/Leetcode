package New;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HRJavaArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numberOfRows : ");
		int numberOfRows = sc.nextInt(); // 5 
		
		HashMap<Integer,ArrayList<Integer>> indexVsRowElement = new HashMap<Integer,ArrayList<Integer>>();
		
		for(int i=0;i<numberOfRows;i++) {
			System.out.println("Enter numberOfElements : ");
			int numberOfElements = sc.nextInt();
			
			ArrayList<Integer> rowsElement = new ArrayList<Integer>();
			
			for(int j=0;j<numberOfElements;j++) {
				System.out.println("Enter element : ");
				int element = sc.nextInt();
				rowsElement.add(element);
			}
			
			indexVsRowElement.put(i, rowsElement);
		}
		
		// Enter into query
		
		System.out.println("Enter numberOfQuery : ");
		int numberOfQuery = sc.nextInt(); // 5
		
		for(int i=0;i<numberOfQuery;i++) {
			int whichRow = 0;
			int whichElement = 0;
			
			for(int input = 1; input <= 2; input++) {
				
				if(input == 1) {
					System.out.println("Enter whichRow : ");
					whichRow = sc.nextInt(); // 1
				}else {
					System.out.println("Enter whichElement : ");
					whichElement = sc.nextInt();// 3
				}
				
			}
			
			ArrayList<Integer> ListOfelement =  indexVsRowElement.get(whichRow - 1);
			
			try {
				System.out.println(ListOfelement.get(whichElement - 1));
			}catch(IndexOutOfBoundsException ie) {
				System.out.print("ERROR!");
			}
		}
		
	}

}

// 1 3
// 3 4
// 3 1
// 4 3
// 5 5


//  41 77 74 22 44
//  12
//  37 34 36 52
//  
//  20 22 33