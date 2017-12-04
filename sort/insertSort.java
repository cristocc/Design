package com.cc.sort.insertsort;

import java.util.Arrays;

public class insertSort {

	private static final int[] NUMBERS =  
		{49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
	
	public static void main(String[] args) {
		insertSort1(NUMBERS);
	}
	
	public static void insertSort1(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;
			for(;j>=0 && array[j]>temp;j--) {
				array[j+1] = array[j];
			}
			array[j+1] = temp;
			
		}
		System.out.println(Arrays.toString(array));
	}

}
