package com.yedam.operator;

import java.util.Scanner;

public class OperateEX2 {
	public static void main(String[] args) {
		//  firstMethod();
		//	SecondMethod();
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 값을 입력: ");
		int num1 = scn.nextInt();
		System.out.println("두번째 값을 입력");
		int num2 = scn.nextInt();
		thirdMethod(num1, num2);
		scn.close();
	}
	public static void thirdMethod(int a, int b) {
		// 매개로 받은 2개의 수를 더하고 결과를 출력.
		
		int result = a + b;
		System.out.println("결과값은 : " + result);
		
	}
	
  	public static void SecondMethod() {
		Scanner scn = new Scanner(System.in);
		// sacanner 활용
	    // "I am a boy", 6 =>문장을 입력 받은 숫자의 횟수만큼 반복출력.
					
		System.out.println("문장 입력");
		String str1 = scn.nextLine();
		System.out.println("반복 횟수 입력");
		int num2 = scn.nextInt();
		
		for(int i = 1; i <=num2; i++) {
			System.out.println(str1);
		}
		scn.close();
	}
	
	public static void firstMethod() {
		//Scanner 사용해서 입력값을 2개.
				//5, 6 => 5의 6제곱에 값을 출력. 2*2*2
				Scanner scn = new Scanner(System.in);
				int a = 0;
				int b = 0;
				int square = 1;
				System.out.println("첫번째 값 입력");
				a = scn.nextInt();
				System.out.println("두번째 값 입력");
				b = scn.nextInt();
				for( int i=1; i<=b; i++) {
					square*=a;
				}
				System.out.println("결과" + square);
	}
}
