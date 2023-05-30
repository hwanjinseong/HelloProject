package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx1 {
	// 메소드: 함수인데 객체(object)에 소속되어있는 메소드.
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
		// var, let => int, long
		// for(let i=0; i<3; i++){}
		// for(int i=0; i<3; i++){}
//		try {
//		  str = scn.nextLine(); //함수가 객체에 소속되어있는것을 메소드.
//		} catch(Exception e) {
//			System.out.println( "예외가 발생했습니다.");
//		}
//		
//		System.out.println("입력값은" + str);
//		
//		scn.close(); //resource 환원.
//		
		int num1 = 0;
		int num2 = 0;
		int result = 0;  //값 초기화
		try {
		System.out.println("숫자1를 입력");
		num1 = scn.nextInt();
		System.out.println("숫자2를 입력");
		num2 = scn.nextInt();
			if  (num1>num2) {
				int num3 = num2;
			    	num2 = num1;
			        num1 = num3;
			}
		}	catch(Exception e) {
			System.out.println("숫자가 아닙니다");
		}
		
		for(int i=num1; i<=num2; i++) {
			if( i%2 == 0) {
			result += i; // 값초기화
		}
		}
		System.out.println(result);
	}
	
		
}

		