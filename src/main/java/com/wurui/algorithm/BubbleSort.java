package com.wurui.algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 冒泡排序
 * 
 * @author Administrator
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[20];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		System.out.println("排序前:" + Arrays.toString(arr));
		arr = BubbleSort.sort(arr);
		System.out.println("排序后:" + Arrays.toString(arr));
	}

	public static int[] sort(int[] arr) {
		int tmp;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}
}
