package com.biz.controler;

import com.biz.model.StudentVO;

public class StdExec_03 {

	public static void main(String[] args) {
		
		StudentVO[] stdList = new StudentVO[5];
		
		StudentVO sVO = new StudentVO("1","ȫ�浿",3,"�����","001");
		stdList[0] = sVO;
		stdList[1] = new StudentVO("2","������",4,"����","002");
		stdList[2] = new StudentVO("3","�̸���",1,"�����","003");
		stdList[3] = new StudentVO("4","�Ӳ���",2,"���","004");
		stdList[4] = new StudentVO("5","����",2,"�Ѿ�","005");
		
		
	}
}
