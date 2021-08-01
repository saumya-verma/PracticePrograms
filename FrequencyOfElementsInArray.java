package com.more.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementsInArray {

	public static void main(String args[]) {

		int arr[] = new int[] { 2, 1, 4, 2, 1, 1, 3, 5 };
		Boolean visited[] = new Boolean[arr.length];
		Arrays.fill(visited, false);

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (visited[i] == true) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;

				}

			}
			
			// prints the duplicated elements in an array
//			if (count > 1) {
//				System.out.println("Duplicated element " + arr[i]);
//			}
			 System.out.println("Frequency Of elements: "+arr[i] + " " + count);

		}
		
		System.out.println("--------------------------------");

		// prinnts elements in reverse order
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("--------------------------------");
		// prints elements present at even positions
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------------------");
		// print the largest element in an array
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maxium element= " + max + " Minimum element= " + min);

		System.out.println("--------------------------------");
		// Sum of elemets of the array
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum: " + sum);

		System.out.println("--------------------------------");

		// printing frequencies of elements using HashMap
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int m = arr[i];
			if (map.containsKey(m)) {
				int freq = map.get(m);
				map.put(m, freq + 1);
			} else {
				map.put(m, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicated keys " + entry.getKey() + " " + entry.getValue());
			}
		}

		System.out.println("--------------------------------");
		// prints element in ascending order, for descending order change the sign
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Element in ascending order");
		System.out.println("2 nd Largest number:" + arr[arr.length - 2]);
		System.out.println("3 nd Largest number:" + arr[arr.length - 3]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
