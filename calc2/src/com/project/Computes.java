package com.project;

public class Computes {

	public static void compute(double num, String oper) {

		if (oper.equals("+") || oper.equalsIgnoreCase("plus")) {
			UserIn.ans += num;
		} else if (oper.equals("-") || oper.equalsIgnoreCase("minus")) {
			UserIn.ans -= num;
		} else if (oper.equals("*") || oper.equals("x")
				|| oper.equalsIgnoreCase("times")) {
			UserIn.ans = UserIn.ans * num;
		} else if (oper.equals("/") || oper.equalsIgnoreCase("div")
				|| oper.equalsIgnoreCase("divide")
				|| oper.equalsIgnoreCase("divided by")) {
			UserIn.ans = UserIn.ans / num;
		} else if (oper.equals("%") || oper.equalsIgnoreCase("modulus")
				|| oper.equalsIgnoreCase("modulo")) {
			UserIn.ans = UserIn.ans % num;
		} else if (oper.equalsIgnoreCase("sqrt")) {
			// keeps from returning invalid op on sqrt
		} else {
			System.out.println("invalid operator");
		}

	}

	public static double NPC(String oper, double num1) {
		double guess = num1 / 2.0;
		double diff = (guess * guess) - num1;
		double epsilon = 0.001;

		while (diff > epsilon) {
			guess -= diff / (guess * 2.0);
			diff = (guess * guess) - num1;
		}

		return guess;
	}

}
