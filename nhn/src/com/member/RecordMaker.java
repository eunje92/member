package com.member;

import java.util.Scanner;

public class RecordMaker {
	public static void main(String[] args) {
		
		RecordCreater rc = new RecordCreater();
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true){
			
			System.out.println("사원 수를 입력하세요. (종료:0)");
			count = sc.nextInt();
			
			if (count<0){
				continue; // 음수가 입력되면 재실행
			}else if(count==0){
				break; // 0을 입력하면 종료
			}
			
			rc.create(count); // 사원 수에 따라서 사원 번호와 점수를 생성
		}
	}
}
