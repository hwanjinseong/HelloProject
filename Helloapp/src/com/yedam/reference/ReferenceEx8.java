package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수 입력. 점수출력, 최고점수, 평균점수

		Scanner scn = new Scanner(System.in);
		int studentNum = 0; // 학생수 지정.
		int[] scores = null; // scores = new int[5]
		boolean run = true;

		while (run) {

			while (run) {
				System.out.println("---------------------");
				System.out.println("1.학생수 2.점수입력 3.점수리스트4.분석(최고,평균) 5.종료");
				System.out.println("---------------------");
				System.out.println("선택>");

				int selectNo = Integer.parseInt(scn.nextLine());
				if (selectNo == 1) { // 학생수.
					System.out.print("학생수> ");
					studentNum = Integer.parseInt(scn.nextLine()); //문자열을 정수형으로 바꿔주는 메서드 parseInt
					scores = new int[studentNum];
				} else if (selectNo == 2) { // 배열의 크기만큼 학생의 점수.
					for(int i = 0;  i < scores.length; i++) {
						System.out.print("scores[" + i + "]>");
						scores[i] = Integer.parseInt(scn.nextLine());
					}
				} else if (selectNo == 3) { // 배열의 점수 출력.
					for(int i = 0;  i < scores.length; i++) {
						System.out.printf("scores[%d]> %d\n" , i,scores[i]);
						
					}
				} else if (selectNo == 4) { // 분석: 최고, 평균.
					double sum = 0;
					double avg = 0;
					int maxScore = 0;
					for (int i = 0; i < scores.length; i++) {
						sum += scores[i];
						if(maxScore < scores[i]) {
						   maxScore = scores[i];
						}
					}
					avg = sum / (scores.length);
					System.out.printf("최고 점수 :%d \n", maxScore);
					System.out.printf("평균 점수 :%.2f  \n", avg);  // .2f 하는이유 실수 2자리까지 출력  d는정수 s는 문자 f는실수
				
				} else if (selectNo == 5) { // 종료: 프로그램 종료합니다.
					run = false;
				}

			}

			System.out.println("end of prog");
		} // end of main().

	}
}
