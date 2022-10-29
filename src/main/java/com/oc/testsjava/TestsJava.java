package com.oc.testsjava;

public class TestsJava {

	public static void main(String[] args) {
		int n = 3;
		int x = RecursionInJava.factorial(n);
		System.out.println(x);

	}
}

class RecursionInJava {
	public static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * RecursionInJava.factorial(n - 1);
	}
}
