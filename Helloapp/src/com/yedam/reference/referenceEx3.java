package com.yedam.reference;

public class referenceEx3 {
	public static void main(String[] args) {
		
		// 학생점수: 89.5, 78.9, 90.4 값을 저장. sum, avg 구함.
		double[] scores = {89.5, 78.9, 90.4};
		scores = new double[] { 55.5, 66.6, 77.7, 88.8};
		double maxVal = 0;
		double sum = 0;
		for(double score : scores) {
			sum += score;
		}
		double avg = sum / 4;
		String fmt = "합계점수는 %.2f, 평균은 %.2f,최고점수는 %.2f";
		System.out.printf(fmt, sum, avg, maxVal);
		
	}
}
