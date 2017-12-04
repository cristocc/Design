package com.cc.sort.shellsort;

import java.util.Arrays;

public class shellSort {

	private static final int[] NUMBERS =  
		{49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
	
	public static void main(String[] args) {
		shellSort1(NUMBERS);
	}
	
	public static void shellSort1(int[] data) {
		int j = 0;
		int temp = 0;
		for (int increment = data.length / 2; increment > 0; increment /= 2) {
			System.out.println("increment:" + increment);
			for (int i = increment; i < data.length; i++) {
				temp = data[i];
				for (j = i - increment; j >= 0; j -= increment) {
					if (temp < data[j]) {
						data[j + increment] = data[j];
					} else {
						break;
					}
				}
				data[j + increment] = temp;
			}

		}
		System.out.println(Arrays.toString(data));
	}
	
}
