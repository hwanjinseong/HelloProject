package com.yedam.reference;

import java.util.Scanner;

// 학생: 이름(String), 영어(int), 수학(int).
class Student {                                 // --클래스가 3칸 만들어줘서
	String name; // 속성.
	int engScore;
	int mathScore;
}

public class ReferenceEx9 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.engScore = 90;                          // <--- 클래스덕분에 3칸 쓸수있다
		s1.mathScore = 90;

		Student s2 = new Student();
		s2.name = "김길동";
		s2.engScore = 85;
		s2.mathScore = 75;

		Student s3 = new Student();
		s3.name = "박길동";
		s3.engScore = 75;
		s3.mathScore = 95;

		Student[] students = { s1, s2, s3 };
		Scanner scn = new Scanner(System.in);
		String sName = scn.nextLine();

		for (int i = 0; i < students.length; i++) {
			if (students[i].name.equals(sName)) {
				System.out.println(students[i].name);
				System.out.println(students[i].engScore);
				System.out.println(students[i].mathScore);
				System.out.println("----------------------");
			}
		}
	} // end of main()
}
