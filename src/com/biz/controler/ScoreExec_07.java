package com.biz.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_07 {

	public static void main(String[] args) {
		/*
		 * ScoreVO�� �̿��ؼ� List�� �����ϰ� 5�� �л��� ������ Ű����� �Է¹޾� List�� �߰��ϰ� ������ ����� ���Ͻÿ�
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print("�������� > ");
			String strNum2 = scan.nextLine();
			int intKor = Integer.valueOf(strNum2);

			System.out.print("�������� > ");
			String strNum3 = scan.nextLine();
			int intEng = Integer.valueOf(strNum3);

			System.out.print("�������� > ");
			String strNum4 = scan.nextLine();

			int intMath = Integer.valueOf(strNum4);
			

			scList.add(new ScoreVO("" + (i + 1), intKor, intEng, intMath));
			System.out.println(scList.get(i).toString());
			System.out.println("=============================================================================");
		}
		// ������ ���
		int scLen = scList.size();
		for(int i =0; i < scLen; i++) {
			ScoreVO vo = scList.get(i);
			
			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
		}
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}

	}
}
