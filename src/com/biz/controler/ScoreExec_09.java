package com.biz.controler;

import com.biz.service.ScoreService_01;

public class ScoreExec_09 {

	public static void main(String[] args) {
		ScoreService_01 ss = new ScoreService_01();
		
		for(int i = 0; i <3; i++) {
			try {
				if(!ss.inputScore(i)) break;	
			} catch (Exception e) {
				System.out.println("���� �Է� ����!");
				System.out.println((i+1) + "��° �ٽ� �Է�");
				i--;
				continue;
			}
			
		}
		
		ss.makeTotal();
		ss.viewScore();
		ss.makeRank();
		
	}

}
