package com.member;

import java.util.Scanner;

public class RecordMaker {
	public static void main(String[] args) {
		
		RecordCreater rc = new RecordCreater();
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true){
			
			System.out.println("��� ���� �Է��ϼ���. (����:0)");
			count = sc.nextInt();
			
			if (count<0){
				continue; // ������ �ԷµǸ� �����
			}else if(count==0){
				break; // 0�� �Է��ϸ� ����
			}
			
			rc.create(count); // ��� ���� ���� ��� ��ȣ�� ������ ����
		}
	}
}
