package com.wurui.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 插入排序
 * 
 * @author Administrator
 *
 */
public class InsertionSort {
	public static void main(String[] args) {
		// int[] arr = { 34, 8, 64, 51, 32, 21 };
		int[] arr = new int[20];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}

		arr = InsertionSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static int[] sort(int[] arr) {
		int j;
		for (int p = 1; p < arr.length; p++) {
			int temp = arr[p];
			for (j = p; j > 0; j--) {
				if (arr[j - 1] > temp) {
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		return arr;
	}
}
