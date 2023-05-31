package com.yedam.operator;

import java.io.IOException;

public class operatorEx4 {
	public static void main(String[] args) {
		// 기본입력. 입력값이 대문자, 소문자 , 숫자 =>출력
		// q가 113 => 종료.
		String msg = "";
		int result = 0;
		System.out.println("값을 입력하세요.");
		try {
		while(true) {
			result = System.out.read();
			if(result == 113) {
				break;
			}
			if (result == 113) {
				break;
			}
			if(result >= 97 && result <= 122) {
				System.out.println("소문자입니다");
			}else if (result >= 65 && result <=90) {
				msg ="대문자입니다.";
			}else if (result >= 48 && result <= 57) {
				msg ="숫자입니다.";
			}else
				msg ="기타값입니다.";
			System.out.println(result);
	
		
		} catch (IOException e) {
				e.printStackTrace();
		}
	    }
	 		System.out.println("끝.");
		}
}
