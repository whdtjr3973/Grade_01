package com.biz.controler;

import com.biz.model.StudentVO;

public class StdExec_02 {

	public static void main(String[] args) {
		
		StudentVO[] stdArray = new StudentVO[5];
		
		stdArray[0] = new StudentVO();
		stdArray[0].setNumber("1");
		stdArray[0].setName("È«±æµ¿");
		stdArray[0].setGrade(3);
		stdArray[0].setAddr("¼­¿ï½Ã");
		stdArray[0].setTel("001");
		
		StudentVO stdVO = new StudentVO();
		stdVO.setNumber("2");
		stdVO.setName("¼ºÃáÇâ");
		stdVO.setGrade(4);
		stdVO.setAddr("³²¿ø½Ã");
		stdVO.setTel("002");
		stdArray[1] = stdVO;
		
		stdVO = new StudentVO();
		stdVO.setNumber("3");
		stdVO.setName("ÀÌ¸ù·æ");
		stdVO.setGrade(1);
		stdVO.setAddr("¼­¿ï");
		stdVO.setTel("003");
		stdArray[2] = stdVO;
		
		for(StudentVO vo : stdArray) {
			System.out.println(vo.toString());
		}
		
	}
}
