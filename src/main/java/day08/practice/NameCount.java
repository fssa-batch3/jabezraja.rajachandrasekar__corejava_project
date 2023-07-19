package day08.practice;

import java.util.HashMap;
import java.util.Scanner;

public class NameCount {

	public static void main(String[] args) {
		HashMap<String, Integer> nameCountMap = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String input = sc.nextLine();

		String[] names = input.split(",\\s*");

		for (String name : names) {
			name = name.trim();
			int count = nameCountMap.getOrDefault(name, 0);
			nameCountMap.put(name, count + 1);
		}

		for (String name : nameCountMap.keySet()) {
			int count = nameCountMap.get(name);
			System.out.println(name + ": " + count);
		}
	}
}