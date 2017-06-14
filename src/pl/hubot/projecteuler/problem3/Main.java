package pl.hubot.projecteuler.problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.print(Collections.max(primeFactors()));
	}

	private static List<Long> primeFactors() {
		long n = 600851475143L;
		List<Long> factors = new ArrayList<>();
		for (long i = 2; i <= n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n /= i;
			}
		}
		return factors;
	}
}
