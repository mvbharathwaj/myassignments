package week1.day2;

import java.util.Arrays;

public class FindDuplicates {
	public static void main(String[] args) {
		int[]num={2,5,7,7,5,9,2,3};
		Arrays.sort(num);
		//2,2,3,5,5,7,7,9
		for(int i=0;i<num.length-1;i++) {
			if(num[i]==num[i+1]) {
				System.out.println("the duplicate value is:"+num[i+1]);
				
			}
				
		}
	}

}
