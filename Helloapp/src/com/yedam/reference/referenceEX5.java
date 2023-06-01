package com.yedam.reference;

public class referenceEX5 {
	public static void main(String[] args) {
		int[] intAry = new int[4];
		intAry[0] =  (int) (Math.random() * 100);
		intAry[1] =  (int) (Math.random() * 100);
		intAry[2] =  (int) (Math.random() * 100);
		intAry[3] =  (int) (Math.random() * 100);
		
		// 변경.
		for(int j=0;j<intAry.length - 1; j++) {
		for(int i=0; i < intAry.length - 1; i++) {
			//i = 0: 3 <-> 7, i = 1: i = 2:
			int temp = 0;
			if	(intAry[i] < intAry[ i + 1 ]) {
				temp = intAry[i];
				intAry[i] = intAry[i + 1];
				intAry[i + 1] = temp;
			}
		}
	} //end of for.
		for(int num : inAry) {
			System.out.println(num);
}
	
	public static void method1() {
		
		int a = 34; //(int)(Math.random()*100);
		int b = 85;
		int c = 22;
		// a>b>c, a>c>b, b>a>c, b>c>a, c>a>b, c>b>a
		if(a > b) {
			if(a > c) {
				a = 1;
				if(b > c) {
					b = 2;
					c = 3;
				}else {
					c = 2;
					b = 3;
				}
					
			} else {
				
			}
		} else {
			
		}
	
		int[]nuAry = { a, b, c };
		for (int i = 0; i < nuAry.length -1; i++) {
			int al = nuAry[i];
			int bl = nuAry[i+1];
			if(al < bl) {
				nuAry[i] = bl;
				nuAry[i + 1] = al;
				i = -1;
			}
		}
		for(int num : nuAry) {
			System.out.println(num);
			// intAry 안에 큰순서로 내림차순 배열
			// intAry[0] = 85, intAry[1] = 34 intAry[2] = 22; 
}
}