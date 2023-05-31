package com.yedam.control;

public class 연습 {
	public static void main(String[] args) {
		method1();
}
	public static void method1() {
		for(int num2 = 1; num2 <=9; num2++) {
			int num1 = num2; // outer for.
//			System.out.println(num1 + "단 입니다.---");
			for (int num = 2; num <=9; num++) {
				System.out.printf("%d * %d = %d \t", num, num1, (num1 * num));
			}
			System.out.println("");
		}		
	}
}
