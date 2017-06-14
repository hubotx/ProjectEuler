package pl.hubot.projecteuler.problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> palindromes = new ArrayList<>();
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				if (isPalindrome(Integer.toString(i * j)))
					palindromes.add(i * j);
			}
		}
		System.out.print(Collections.max(palindromes));
	}

	private static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
}
