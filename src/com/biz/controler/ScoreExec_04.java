package com.biz.controler;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		
		scList.add(new ScoreVO("1",90,80,70));
		scList.add(new ScoreVO("2",77,80,60));
		scList.add(new ScoreVO("3",99,77,80));
		scList.add(new ScoreVO("4",80,86,70));
		scList.add(new ScoreVO("5",77,90,66));
		scList.add(new ScoreVO("6",90,100,55));
		
		int scLen = scList.size();
		for(int i = 0 ; i < scLen; i++) {
			// scList의 i 번째 위치에 담긴 주소복사
			ScoreVO vo = scList.get(i);  
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();

			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
		}
		for(ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}
	}

}
