package com.biz.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreService_02 {

	private List<ScoreVO> scoreList;
	private Scanner scann;

	public ScoreService_02() {
		scoreList = new ArrayList<ScoreVO>();
		scann = new Scanner(System.in);
	}

	/*
	 * throws Ȥ�� �޼��尡 ����Ǵ� �������� Exception�� �߻��� Ȯ���� �� 1%�� �����ϸ� �߻��� Exception��
	 * throw�Ͽ� ȣ���� ������ Exception�� ó���ϵ��� �ϴ� Ű����
	 */
	public boolean inputScore(int number) throws NumberFormatException {

		number++;
		Random rnd = new Random();
		int intKor = rnd.nextInt(50)+51;
		int intEng = rnd.nextInt(50)+51;
		int intMath = rnd.nextInt(50)+51;
		
		scoreList.add(new ScoreVO(""+number,intKor,intEng,intMath));
		return true;
	}

	public void calcTotal() {
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
	
	public void processRank() {
		List<String> s = new ArrayList<String>();
		Collections.sort(s);
		Collections.sort(scoreList, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO sI, ScoreVO sJ) {
				if(sI.getTotal() > sJ.getTotal()) return -1;
				else if (sI.getTotal() < sJ.getTotal()) return 1;
				else return 0;
			}
		});
		int listLen = scoreList.size();
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
