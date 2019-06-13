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
	// Ű����� �л������� �Է¹޾Ƽ� stdList�� �߰�
	public boolean inputStudent(int number) throws NumberFormatException {
		System.out.print("�й� (����:EX)>");
		String strNum = scan.nextLine();
		if(strNum.equals("EX"))			return false;
		
		System.out.print("�̸�(����)>");
		String strName = scan.nextLine();
		
		System.out.print("�г�>");
		String strGrade = scan.nextLine();
		int intGrade = Integer.valueOf(strGrade);
		
		System.out.print("�ּ�>");
		String strAddr = scan.nextLine();
		
		System.out.print("��ȭ��ȣ>");
		String strTel = scan.nextLine();
		
		StudentVO st = new StudentVO(strNum, strName, intGrade, strAddr, strTel);
		stdList.add(st);
		System.out.println(st.toString());
		
		return true;
	}
	// stdList�� ��� �л� ������ Console�� ���̱�
	public void viewStudents() {
		System.out.println("===========================================");
		System.out.println("�й� \t�̸�\t�г�\t�ּ�\t��ȭ��ȣ");
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
