package com.cc.sort.selectSort;

import java.util.Arrays;

public class selectSort {

	
	private static final int[] NUMBERS =  
		{49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
	
	public static void main(String[] args) {
		selectSort1(NUMBERS);
	}
	
	public static void selectSort1(int[] array) {
		int position = 0;
		for (int i = 0; i < array.length; i++) {
			int j = i+1;
			position = i;
			int temp = array[i];
			for(;j< array.length;j++) {
				if(array[j]< temp) {
					temp = array[j];
					position = j;
				}
			}
			array[position] = array[i];
			array[i] = temp;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
