package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreService_01 {

	private List<ScoreVO> scoreList;
	private Scanner scann;

	public ScoreService_01() {
		scoreList = new ArrayList<ScoreVO>();
		scann = new Scanner(System.in);
	}

	/*
	 * throws Ȥ�� �޼��尡 ����Ǵ� �������� Exception�� �߻��� Ȯ���� �� 1%�� �����ϸ� �߻��� Exception��
	 * throw�Ͽ� ȣ���� ������ Exception�� ó���ϵ��� �ϴ� Ű����
	 */
	public boolean inputScore(int number) throws NumberFormatException {

		number++;
		System.out.print(number + "�� ��������(����:EX)>");
		String strKor = scann.nextLine();
		if (strKor.equals("EX"))
			return false;
		int intKor = Integer.valueOf(strKor);

		System.out.print(number + "�� ��������>");
		String strEng = scann.nextLine();
		int intEng = Integer.valueOf(strEng);

		System.out.print(number + "�� ��������>");
		String strMath = scann.nextLine();
		int intMath = Integer.valueOf(strMath);

		ScoreVO vo = new ScoreVO("" + number, intKor, intEng, intMath);
		scoreList.add(vo);
		System.out.println(vo.toString());
		return true;
	}

	public void makeTotal() {
		int listLen = scoreList.size();
		for (int i = 0; i < listLen; i++) {
			ScoreVO vo = scoreList.get(i);
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();

			vo.setTotal(intTotal);
			vo.setAverage(intTotal / 3);
		}
	}
	
	public void makeRank() {
		int listLen = scoreList.size();
		for(int i =0; i <listLen; i++) {
			for(int j = i+1; j <listLen; j++) {
				ScoreVO sI = scoreList.get(i);
				ScoreVO sJ = scoreList.get(j);
				if(sI.getTotal()<sJ.getTotal()) {
					ScoreVO _score = sI;
					scoreList.set(i, sJ);
					scoreList.set(j, _score);
				}
			}
		}
		for(int i = 0 ; i < listLen; i++) {
			scoreList.get(i).setRank(i+1);
		}
	}

	public void viewScore() {

		System.out.println("==================================================");
		System.out.println("�����͹� ����ǥ");
		System.out.println("==================================================");
		System.out.println("�й�\t����\t����\t����\t����\t���\t����");
		System.out.println("--------------------------------------------------");
		for (ScoreVO vo : scoreList) {
			System.out.print(vo.getNumber() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getTotal() + "\t");
			System.out.print(vo.getAverage() + "\t");
			System.out.print(vo.getRank() + "\n");

			System.out.println("--------------------------------------------------");
		}

	}
}
