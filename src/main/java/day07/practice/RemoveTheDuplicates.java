package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveTheDuplicates {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		numList.add(2);

		Set<Integer> uniqueValues = new HashSet<>();
		for (Integer number : numList) {
			uniqueValues.add(number);
		}

		System.out.println("Input = " + numList);
		System.out.println("The Unique values are = " + uniqueValues);
	}
}