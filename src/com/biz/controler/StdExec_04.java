package com.biz.controler;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.StudentVO;

public class StdExec_04 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		StudentVO sVO = new StudentVO("1","ȫ�浿",3,"�����","001");
		stdList.add(sVO);
		sVO = new StudentVO("2","������",4,"����","002");
		stdList.add(sVO);
		stdList.add( new StudentVO("3","�̸���",1,"�����","003"));
		stdList.add( new StudentVO("4","�Ӳ���",2,"���","004"));
		stdList.add( new StudentVO("5","����",2,"�Ѿ�","005"));
		
		
		
	}

}
