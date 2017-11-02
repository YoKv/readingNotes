package com.UiltChes.fact;

/**
 * 递归法解阶乘
 */
public class Factorial {
	public static void main(String[] args) {
		int m, n = 10;
		m = fact(n);
		System.out.println(n + "!=" + m);
	}

	public static int fact(int n) {
		int f;
		if (n == 0) {
			f = 1;
		} else {
			f = n * fact(n - 1);
		}
		return f;
	}
}
