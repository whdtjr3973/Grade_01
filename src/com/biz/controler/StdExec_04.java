package com.biz.controler;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.StudentVO;

public class StdExec_04 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		StudentVO sVO = new StudentVO("1","È«±æµ¿",3,"¼­¿ï½Ã","001");
		stdList.add(sVO);
		sVO = new StudentVO("2","¼ºÃáÇâ",4,"³²¿ø","002");
		stdList.add(sVO);
		stdList.add( new StudentVO("3","ÀÌ¸ù·æ",1,"¼­¿ï½Ã","003"));
		stdList.add( new StudentVO("4","ÀÓ²©Á¤",2,"Æò¾ç","004"));
		stdList.add( new StudentVO("5","Àå³ì¼ö",2,"ÇÑ¾ç","005"));
		
		
		
	}

}
