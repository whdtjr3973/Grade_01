package com.biz.controler;

import com.biz.model.StudentVO;

public class StdExec_01 {

	public static void main(String[] args) {

		StudentVO stdVO = new StudentVO();
		stdVO.setNumber("1");
		stdVO.setName("ȫ�浿");
		stdVO.setGrade(3);
		stdVO.setAddr("�����");
		stdVO.setTel("001");
		
		System.out.println(stdVO.toString());
		
	}

}
