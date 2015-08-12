package com.project;

import java.util.Scanner;

public class UserIn {

	public static double ans = 0.0;
	public static String op = "";
	public static double nextNum = 0.0;
	private static String testNum;
	private static double PHNum;


	public static void UserInput() {
		Scanner stdin = new Scanner(System.in);

		System.out.println("Thanks for using my shitty calc-T4.5");
		System.out.println();
		System.out.println();
		System.out
				.println("enter your equation in number1(then enter), operator(then enter), num2(take a guess...) ");
		System.out.println();

		mainLoop: while (true) {
			
            testNum = nextLine();			
			try {
				nextNum = Double.parseDouble(testNum);
			} catch (Exception e) {
				if (testNum.substring(0, 4).equals("sqrt")) {
					PHNum = Double.parseDouble(testNum.substring(5, testNum.length() - 1));
					 nextNum = Computes.NPC("sqrt", PHNum);
				}else{
					System.out.println("invalid value, please try again");
					continue mainLoop;
				}
			}
			
			if(op.equals("")){
				ans = nextNum;
			}else{
				Computes.compute(nextNum, op);
			}

			op = nextLine();
			if (op.equals("") || op.equalsIgnoreCase("exit") || op.equals("=")) {
				break;
			}
			PHNum = nextNum;
		}

		System.out.printf("that's %1.3f", ans);
	}

	private static String nextLine() {
		Scanner stdin = new Scanner(System.in);
		String str = stdin.nextLine();
		return str;
	}

}
