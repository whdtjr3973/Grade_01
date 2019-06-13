package com.biz.controler;

import com.biz.model.ScoreVO;

public class ScoreExec_03 {

	public static void main(String[] args) {

		ScoreVO[] scArray = new ScoreVO[5];
		
		scArray[0] = new ScoreVO("1",100,90,70);
		scArray[1] = new ScoreVO("2",88,72,65);
		scArray[2] = new ScoreVO("3",92,88,98);
		scArray[3] = new ScoreVO("4",87,68,56);
		scArray[4] = new ScoreVO("5",99,90,77);
		
		for(int i =0; i < scArray.length; i++) {
			int intTotal = scArray[i].getKor();
			intTotal += scArray[i].getEng();
			intTotal += scArray[i].getMath();
			
			scArray[i].setTotal(intTotal);
			scArray[i].setAverage(intTotal/3);
		}
		
		for(ScoreVO vo : scArray) {
			System.out.println(vo.toString());
		}
		
		
		
	}

}
