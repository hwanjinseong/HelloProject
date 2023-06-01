package com.yedam.reference;

public class ReferenceEx4 {
	public static void main(String[] args) {
		String[] strAry = {"김이박","이김박","박이김"};
		strAry[0] = "king";
		strAry = new String[] {"king", "queen"};
		System.out.println(strAry[1]);
		
		strAry = new String[] {"Jack", "1000", "cloud"};
//		for (String str : strAry) {
//			System.out.println(str);
//		}
		
		
		for(int i = 0; i < strAry.length; i++) {
//			System.out.println(strAry[1]);
			if (strAry[i].equals("Jack")) {
				System.out.printf("%s 은(는) %d 째에 있습니다.\n", strAry[i], (i + 1));
			}
		}
		
		// 문자열의 값에서도 "Hongkildong" index 기준으로 값을 반환. -- 문자열 안에있는 글자의 위치값 반환
		String s1 = "Hongkildong";
		char result = s1.charAt(10);
		System.out.println(result);
		
		int result1 = s1.indexOf("n");
		System.out.println(result1);
		
		//String 배열에 주민번호, 950301-1234567, 950103-2345678
		String[] idAry = {"950301-1234567", "950103-2345678"};
		for (int i = 0; i < idAry.length; i++) {
			// char타입은 문자 => 'H'
			if(idAry[i].charAt(7) == '2') {
				System.out.printf("%d 번째 있습니다.", (i + 1));
			}
		}
		
	}
}
