package com.yedam.object;

import java.util.Scanner;

//클래스 파일 하나에 클래스 하나 가 정석
public class ObjectEx1 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Member[] members = new Member[2]; // 담을 박스 생성(저장할 공간이 있어야 담을수있다)
		
		// 등록
		for (int i = 0; i < members.length; i++) {
			Member m1 = new Member();
			System.out.print("아이디를 입력>");
			String id =scn.nextLine();
			// i=>0 이면 처음등록.
			// i != 0 면 2번째 등록 2번째 값을 비교 i가0이아니면
			boolean dupId = false; //중복된 아이디를 체크하기 위해
			if ( i !=0) {
				for(int j= 0; j < i; j++) {
					if(members[j].memberId.equals(id)) {
						dupId = true; //중복된 아이디임을 확인.
						break; //중복여부를 확인했으면 다음 순번을 볼 필요없음 for문 빠져나옴
					}
				}
				if (dupId) {
					System.out.println("중복된 아이디입니다.");
					i--; // 순번을 한번 빼줌.
					continue; // 다시 위로 올라가서실행 반복문 i값이 계속 증가해서 i--빼줌(안빼주면 실행이 안되서)
			}
	}
			
			m1.memberId = id; // 저장할 놈들
			
			System.out.print("이름 입력>");
			m1.memberName = scn.nextLine();
			System.out.print("포인트 입력>");
			m1.point = Integer.parseInt(scn.nextLine());

			members[i] = m1;
		}
		// memberId 조회 후 point 를 변경.
		System.out.println("조회할 아이디를 입력.");
		String searchId = scn.nextLine();
		System.out.println("변경할 point 를 입력.");
		int newPoint = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < members.length; i++) {
			if (members[i].memberId.equals(searchId)) {
				members[i].point = newPoint;
				System.out.println("변경된값: " + members[i].point);
			}
		}

		// 목록 출력
		System.out.printf("아이디: %s, 이름: %s, point: %d\n", members[0].memberId, members[0].memberName, members[0].point);
	}
}
