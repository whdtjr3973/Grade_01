package com.biz.controler;

import com.biz.model.StudentVO;

public class StdExec_02 {

	public static void main(String[] args) {
		
		StudentVO[] stdArray = new StudentVO[5];
		
		stdArray[0] = new StudentVO();
		stdArray[0].setNumber("1");
		stdArray[0].setName("ȫ�浿");
		stdArray[0].setGrade(3);
		stdArray[0].setAddr("�����");
		stdArray[0].setTel("001");
		
		StudentVO stdVO = new StudentVO();
		stdVO.setNumber("2");
		stdVO.setName("������");
		stdVO.setGrade(4);
		stdVO.setAddr("������");
		stdVO.setTel("002");
		stdArray[1] = stdVO;
		
		stdVO = new StudentVO();
		stdVO.setNumber("3");
		stdVO.setName("�̸���");
		stdVO.setGrade(1);
		stdVO.setAddr("����");
		stdVO.setTel("003");
		stdArray[2] = stdVO;
		
		for(StudentVO vo : stdArray) {
			System.out.println(vo.toString());
		}
		
	}
}
