package org.test;

public class Test {
	public static void main(String[] args) {

		String s = "hariharan";
		String r = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char charAt = s.charAt(i);
			r = r + charAt;
		}
		System.out.println(r);
		
	}
}
