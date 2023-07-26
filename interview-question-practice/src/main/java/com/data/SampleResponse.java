package com.data;

public class SampleResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleResponse sr = new SampleResponse();
		System.out.println("addtion");
		String data = sr.add(10, 3);
		System.out.println(data);
		System.out.println("subtract");
		int i = subtract(5, 10);
		System.out.println(i);
		int b = sr.division(0, 1);
		System.out.println("Division");
		System.out.println(b);

		String sc = multipication(2, 9);

		System.out.println("multi " + "\n" + sc);
		// System.out.println(sc);
	}

	private String add(int a, int b) {
		return Integer.toString(a + b);

	}

	static int subtract(int a, int b) {
		return a - b;
	}

	public int division(int a, int b) {
		return a / b;
	}

	static String multipication(int a, int b) {
		return Integer.toString(a * b);

	}
}
