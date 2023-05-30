package com.yedam.operator;

import java.util.Scanner;
// javacript: let obj = {name:"Hong", age:10, showInfo: function(){}
public class operatorEx3 {
	public static void main(String[] args) {
	
		// 변수 balance 선언.
		// balance 가 0 ~ 100,000 범위내에서만 추가, 차감이 되도록.
		// 입력값을 판단 1)balance 값을 추가. 2)balance 값을 빼기.
		//3) 현재 balance 값을 콘솔출력. 4) 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;
		
		
		while(true) {
			System.out.println("1)추가 2)차감 3)balance 출력 4)종료");
			int menu = scn.nextInt();
			
			if(menu == 4) {
				System.out.println("종료합니다");
				break;
			}else if (menu == 1) {
				System.out.println("추가할 값을 입력:");
				int acct = scn.nextInt();
				if(balance + acct > 100000) {
					//balance 가 10만을 초과.
				//	System.out.println("값은" + 100+ "입니다");
					System.out.printf("현재 balance는 %d 입니다. %d 입니다. %d는 추가할 수 없습니다", balance, acct); //prinf는 한문장에 값을넣을수있다 %d는 출력포맷 100은 대체값
				}else if(balance < 0) {
					System.out.println("금액부족");
				}else {
				balance = balance + acct;
				}
				
			} else if (menu == 2) {
				System.out.println("차감할 값을 입력:");
				int acct = scn.nextInt();
				if(balance - acct < 0) {
					System.out.printf("현재 balance는 %d 입니다. %d는 차감할 수 없습니다.", balance, acct);
				} else {
				balance = balance - acct;	
				}
			} else if (menu == 3) {
			System.out.printf("현재balance는 %d 입니다.\n", balance);
			
			}else {
				System.out.println("메뉴에 없는 값을 선택했습니다.");
			}
		}
		System.out.println("end of prog.");
		
	}
	
	public static void method1() {
		//반복처리. while (condition) {}
				int num1 = 1;
				
//				while(num1 <= 10) {
//					System.out.println(num1++);
				
//				}
				
				boolean isOk = false;
				isOk = true;
				num1 = 1;
				while(isOk) {
					System.out.println(num1++); //9
					if(num1 >= 10)
						isOk = false;
				}
				
				Scanner scn = new Scanner(System.in);
				// quit 구문을 입력 하면 반복종료
				isOk = true;
				while(isOk) {
					System.out.println("문장을 입력하세요.");
					String str = scn.nextLine();
					
					if(str.equals("quit")) {
//						isOk = false;
						break; //while 탈출.
					}
					System.out.println("입력값은" + str + "입니다.");
				}
				
				System.out.println("end of prog.");
				scn.close();
			}
		}

	