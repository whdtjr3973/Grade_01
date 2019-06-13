package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.StudentVO;

public class StudentService {

	List<StudentVO> stdList;
	Scanner scan;
	
	public StudentService() {
		stdList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}
	// 키보드로 학생정보를 입력받아서 stdList에 추가
	public boolean inputStudent(int number) throws NumberFormatException {
		System.out.print("학번 (종료:EX)>");
		String strNum = scan.nextLine();
		if(strNum.equals("EX"))			return false;
		
		System.out.print("이름(영문)>");
		String strName = scan.nextLine();
		
		System.out.print("학년>");
		String strGrade = scan.nextLine();
		int intGrade = Integer.valueOf(strGrade);
		
		System.out.print("주소>");
		String strAddr = scan.nextLine();
		
		System.out.print("전화번호>");
		String strTel = scan.nextLine();
		
		StudentVO st = new StudentVO(strNum, strName, intGrade, strAddr, strTel);
		stdList.add(st);
		System.out.println(st.toString());
		
		return true;
	}
	// stdList에 담긴 학생 정보를 Console에 보이기
	public void viewStudents() {
		System.out.println("===========================================");
		System.out.println("학번 \t이름\t학년\t주소\t전화번호");
		System.out.println("-------------------------------------------");
		for(StudentVO st : stdList) {
			System.out.print(st.getNumber()+"\t");
			System.out.print(st.getName()+"\t");
			System.out.print(st.getGrade()+"\t");
			System.out.print(st.getAddr()+"\t");
			System.out.print(st.getTel()+"\n");
		}
		
	}
}
