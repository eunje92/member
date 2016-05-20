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
			//사원번호 생성
			member[i][0] = rd.nextInt(100000);
			
			for(int j=0; j<i; j++){
				if(member[i][0]==member[j][0]){
					i--; // 중복일 경우 번호 재 생성
				}
			}
			
			//점수 생성
			member[i][1] = rd.nextInt(100);
			
			//출력
			System.out.println("NT"+format.format(member[i][0])+" "+member[i][1]+"점");
		}

	}
}
