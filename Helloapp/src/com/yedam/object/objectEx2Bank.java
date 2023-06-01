package com.yedam.object;

public class objectEx2Bank {
	public static void main(String[] args) {
		// int[] {0,0,0,}, Ban[] {null,null,null}
		Bank[] accounts = new Bank[3]; 
		Bank b1 = new Bank();
		b1.accountNo = "11-11";
		b1.owner = "성환진"
		b1.balance = 10000;
		accounts = new Bank[] {};
		
		boolean run = true;
		int selectNo = 0;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			
			if (selectNo == 1) { //등록.
				Bank b1 = new Bank();
				if(n>2) {
				System.out.print("등록> ");
				continue;
				}	
			} else if (selectNo == 2 ) {	//조회(계좌번호)
				
			} else if (selectNo == 3 ) {	//입금
				if(n==0) {
					System.out.println("계좌등록");
					continue;
				}
				System.out.println("입금 계좌등록");
				
				
				
				
				
				
			} else if (selectNo == 4 ) {	//출금

			} else if (selectNo == 5 ) {	//종료.
				
			}	
			System.out.println("end of prog");
	}
}


