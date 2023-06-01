package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {
		// 학생3명: 홍길동의 영어,수학,: 김길동: 박길동:
		int[][] intAry = { //
				new int[] { 80, 90 }, // 홍길동:영어,수학
				new int[] { 85, 95 }, // 김길동:영어,수학
				new int[] { 70, 80 } // 박길동:영어,수학
		};

//		intAry[0] = new int[] {22,23};
		System.out.printf("홍길동의 영어점수 %d \n", intAry[0][0]);
		System.out.printf("김길동의 영어점수 %d \n", intAry[1][1]);

		int engSum = 0;
		int mathSum = 0;
//		engSum = intAry[0][0] + intAry[1][0] + intAry[2][0];  

		for (int i = 0; i < intAry.length; i++) {
			engSum += intAry[i][0];
		}
		System.out.printf("영어점수의 합계: %d\n", engSum);

		for (int i = 0; i < intAry.length; i++) {
			mathSum += intAry[i][1];
		}
		System.out.printf("수학점수의 합계: %d\n", mathSum);

		int totalSum = 0;
		// 영어 , 수학 점수 전체값.
//		totalSum = intAry[0][0] + intAry[0][1]
//			+	   intAry[1][0] + intAry[1][1]
//			+	   intAry[2][0] + intAry[2][1];		

		for (int j = 0; j < intAry[0].length; j++) {
			for (int i = 0; i < intAry[i].length; i++) {
				totalSum += intAry[i][j];
			}
		}
		System.out.printf("전체 점수는 %d\n", totalSum);

		String[] nameAry = { "홍길동", "김길동", "박길동" };

		Scanner scn = new Scanner(System.in);
		System.out.println("학생이름:");
		String searchName = scn.nextLine();

		int sos = 0;   //변경점을 주고
		for (int i = 0; i < nameAry.length; i++) {
			if (searchName.equals(nameAry[i])) {
				System.out.printf("%s 의 영어 점수는 %d, 수학점수는 %d \n", nameAry[i], intAry[i][0], intAry[i][1]);
				sos++;
			} 
		}
			if (sos == 0) {
			System.out.printf("학생이 없다");     //변경점을 체크 해서 출력
			}
			System.out.println("end of prog");
			scn.close();
//		System.out.printf("총합: %d\n",engSum+mathSum); 영어 + 수학 합계

	} // end of main().
}
