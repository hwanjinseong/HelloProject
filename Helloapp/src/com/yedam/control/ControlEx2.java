package com.yedam.control;

import java.util.Scanner;

public class ControlEx2 {
		public static void main(String[] args) {
			// 12월 
			// 메소드...마지막날짜값: 1=>31, 2=>28, 3=>31, 4=>30
			Scanner scn = new Scanner (System.in);
			System.out.println("달 입력.");
			int month = scn.nextInt();
			System.out.println( "달의마지막날은 " + getLastDate(month));
			scn.close();
			
			}
			
		
			public static int getLastDate(int month) {
				
				int result = 30;
				switch(month) {
				case 1,3,5,7,8,10,12:
					System.out.println("31");
					result = 31;
					break;
				case 2:
					System.out.println("28"); 
					result = 28;
					break;
				case 4,6,9,11:
					System.out.println("30"); 
					result = 30;
					break;
				}
				return result;
			}
		
			public static void method1() {
			int result = (int) (Math.random( )	*	3) + 1;
			switch(result) {
			case 1:
				System.out.println("가위."); break;
			case 2:
				System.out.println("바위."); break;
			case 3:
				System.out.println("보.");
			}
			
			//정수 연산( +,-,*,/) 정수 => 졍수.
			result = (int) (Math.random() * 91) + 10;
			switch(result/10) {
			case 10:
				System.out.println("A++");break;
			case 9:
				System.out.println("A");break;
			case 8:
				System.out.println("B");break;
			case 7:
				System.out.println("C");break;
			default:
				System.out.println("D");break;	
			}
			System.out.println("end of prog.");
	}
}
