package com.biz.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_08 {

	public static void main(String[] args) {
		/*
		 * �л��� ������ �Է¹޴� ���ȿ� �Ǽ��� ������ �߸��Է¹����� (���ڿ� ���ڰ� ���ԵǴ°��) Exception�� �߻��ϴµ� Exception��
		 * �߻��ϸ� �ٽ� �л��� ������ �Է¹޵��� ó��
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			/*
			 * 3������ ������ ���� int �������� try�� �������� ������ ���ش�
			 * 
			 * try���� ���� �Ŀ� 3������ ������ scList�� ��ƾ� �ϴµ� try�� ������ ������ �Ǹ� ������ �Ұ����ϱ� �����̴�.
			 */
			int intKor = 0;
			int intEng = 0;
			int intMath = 0;

			try {
				System.out.print((i + 1) + "�� �л��� �������� > ");
				String strNum2 = scan.nextLine();
				intKor = Integer.valueOf(strNum2);

				System.out.print((i + 1) + "�� �л��� �������� > ");
				String strNum3 = scan.nextLine();
				intEng = Integer.valueOf(strNum3);

				System.out.print((i + 1) + "�� �л��� �������� > ");
				String strNum4 = scan.nextLine();
				intMath = Integer.valueOf(strNum4);

			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println((i + 1) + "�� �л� ���� �Է� ���� �߻�!");
				System.out.println((i + 1) + "�� �л� ������ �ٽ� �Է����ּ���");
				i--;
				
				/*
				 * for�� while �ݺ��������� ����Ҽ� ������
				 * continue�� ������ ���Ŀ� �ִ� ��� �ڵ��
				 * �����ϰ� for�� while���� ���������� �ǵ��ư���.
				 * break�� �ݺ��� ����
				 * continue �ݺ����� ��� ����
				 */
				continue;
			}

			scList.add(new ScoreVO("" + (i + 1), intKor, intEng, intMath));
			System.out.println(scList.get(i).toString());
			System.out.println("=============================================================================");
		}
		// ������ ���
		int scLen = scList.size();
		for (int i = 0; i < scLen; i++) {
			ScoreVO vo = scList.get(i);

			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();

			vo.setTotal(intTotal);
			vo.setAverage(intTotal / 3);
		}
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}

	}
}
