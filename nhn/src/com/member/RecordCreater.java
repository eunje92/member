package com.member;

import java.text.DecimalFormat;
import java.util.Random;

public class RecordCreater {
	
	private int member[][];
	
	Random rd = new Random();
	Random rd2 = new Random();
	
	DecimalFormat format = new DecimalFormat("00000");
	
	public void create(int count){
		
		member = new int[count][2];
		
		for(int i=0; i<count; i++){
			//�����ȣ ����
			member[i][0] = rd.nextInt(100000);
			
			for(int j=0; j<i; j++){
				if(member[i][0]==member[j][0]){
					i--; // �ߺ��� ��� ��ȣ �� ����
				}
			}
			
			//���� ����
			member[i][1] = rd.nextInt(100);
			
			//���
			System.out.println("NT"+format.format(member[i][0])+" "+member[i][1]+"��");
		}

	}
}
