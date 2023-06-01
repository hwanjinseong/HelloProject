package com.yedam.reference;

public class ReferenceEx7 {
	public static void main(String[] args) {
		//학교의 키. a반(2), b반(4), c반(3).
		double[][] heightAry = {//
				{173.5, 168.3 }, //a반
				{173.5, 168.3, 190.3, 188.3 }, //b반
				{173.5, 168.3, 202.2 } //c반
		
		};
		System.out.println(heightAry[1].length);
		
		
		// 각반별로 키의 평균 => 1번째반의 평균키: 169.9....
		// 각반별로 키의 평균 => 2번째반의 평균키: 169.9....
		// 각반별로 키의 평균 => 3번째반의 평균키: 169.9....
		for (int j = 0; j < heightAry.length; j++) {
			// 키의 합계 / 학생수 => 평균.
		double sum = 0;
		for( int i = 0; i < heightAry[j].length; i++) {
			sum += heightAry[j][i];
		}
		String fmt = "%d번째반의 평균키: %.1f\n";
		System.out.printf(fmt, (j + 1), (sum / heightAry[j].length));
			
		}
	}
}