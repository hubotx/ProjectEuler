package pl.hubot.projecteuler.problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		int n = 0;
		while (fibonacci(n) < 4_000_000) {
			if (fibonacci(n) % 2 == 0) numbers.add(fibonacci(n));
			n++;
		}
		int result = 0;
		for (Integer number : numbers) {
			result += number;
		}
		System.out.print(result);
	}

	private static int fibonacci(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
