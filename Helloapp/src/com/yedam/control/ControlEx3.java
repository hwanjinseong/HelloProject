package com.yedam.control;

public class ControlEx3 {
	public static void main(String[] args) {
		
		// 월별로 필요한 정보: 1) 월 2)일의 시작 위치 3) 마지막날의 값.
		int month =5;
		String title = "=== 6월 ===";
		System.out.println(title);
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
//		System.out.printf("%3s ", "");
//		System.out.printf("%3s ", "");
//		System.out.printf("%3s ", "");
//		System.out.printf("%3s ", "");
		
		for (int i = 0; i < getFirstDate(month); i++) {
			System.out.printf("%3s ", "");
		}
		
		for(int day = 1; day <= getLastDate(month); day++) {
			System.out.printf("%3d ", day);
			//줄바꿈
			if ((getFirstDate(month) + day) %7 == 0) {
				System.out.println();
			}
		}
	}

	// 4,5,6월달 달력. switch ~ case 구문. 월의 1일의 위치계산.
	public static int getFirstDate(int month) {
		int result = 0;
		switch (month) {
		case 4: result = 6; break;
		case 5: result = 1; break;
		case 6: result = 4; break;
		default:result = 0;
		}
		return result;
	}
//4월,5월,6월 달력. switch ~ case 구문 . 월의 마지막날 계산
	public static int getLastDate(int month) {
		int lastday = 30;
		switch (month) {
		case 4, 6: lastday = 30; break;
		case 5: lastday = 31; break;
		}
		return lastday;
	}
//	public static void method1() {
//		//반복문 : for, while, do ~while
//				for(int i =0; i < 10; i++) {
//					if (i % 2 == 1)
//					System.out.printf("i의 값은 %d \n", i);
//				else
//					System.out.println("짝수입니다.");
//				}
//	}
// //end of method1().
//	public static void method2() {
//		for(int num2 = 1; num2 <=9; num2++) {
//			int num1 = num2; // outer for.
////			System.out.println(num1 + "단 입니다.---");
//			for (int num = 2; num <=9; num++) {
//				System.out.printf("%d * %d = %d \t", num, num1, (num1 * num));
//			}
//			System.out.printf("\n");
//}
}
