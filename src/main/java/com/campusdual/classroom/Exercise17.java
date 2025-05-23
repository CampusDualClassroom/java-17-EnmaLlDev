package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {
		int[] myArray = new int[ positions ];
		return myArray;
	}

	public static String[] createInitializedStringArray() {
		String[] myStrings = new String[3];
		myStrings[0] = "1";
		myStrings[1] = "2";
		myStrings[2] = "3";
		return myStrings;
	}

	public static void populateArray(int[] array, int index, int value) {
		if (index >= 0 && index < array.length) {
			array[index] = value;
		} else {
			System.out.println("Fuera de rango");
		}
	}

	public static int arrayLength(int[] array) {
		return array.length;
	}

	public static void showValue(int[] array, int index) {
		if (index >= 0 && index < array.length) {
			System.out.println(array[index]);
		} else {
			System.out.println("Fuera de rango");
		}
	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
