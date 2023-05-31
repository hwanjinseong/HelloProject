package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		// 1 부터 100까지의 수중에서 3의 배수의 합계. method1()
		// Math.random() 의 2번 실행 => 두수의 합이 5가 되는 경우.
		// 1,4, 2,3 3,2, 반복횟수를 중단. method2()
		// 반복문 for를 활용.
		// *
		// **
		// ***
		// ****. method3()
		method1();
		method2();
		method3();
		method4();
	}// end of main().

	public static void method1() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합:" + sum);

	}
	public static void method2() {
		while(true) {
		int	D1 = (int) (Math.random() * 6)+1;
		System.out.println(D1);
		int	D2 = (int) (Math.random() * 6)+1;
		System.out.println(D2);
		System.out.printf("%d + %d = %d\n",D1,D2,D1+D2);
		if(D1 + D2 == 5) {
			break;
		}
		}
	}
	public static void method3() {
		for(int i=1; i < 5; i++) {  
			for(int j=4; j>0; j--) {
				if (i<j) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");	
				}
			}
			System.out.println();
		}
	}
	public static void method4() {
		for(int i=1; i<5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.printf(" ");
				if(j == i) {
					System.out.printf("*");
				}
			}
		}
		
	}
}

