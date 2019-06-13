package com.biz.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_07 {

	public static void main(String[] args) {
		/*
		 * ScoreVO를 이용해서 List를 생성하고 5명 학생의 성적을 키보드로 입력받아 List에 추가하고 총점과 평균을 구하시오
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print("국어점수 > ");
			String strNum2 = scan.nextLine();
			int intKor = Integer.valueOf(strNum2);

			System.out.print("영어점수 > ");
			String strNum3 = scan.nextLine();
			int intEng = Integer.valueOf(strNum3);

			System.out.print("수학점수 > ");
			String strNum4 = scan.nextLine();

			int intMath = Integer.valueOf(strNum4);
			

			scList.add(new ScoreVO("" + (i + 1), intKor, intEng, intMath));
			System.out.println(scList.get(i).toString());
			System.out.println("=============================================================================");
		}
		// 총점을 계산
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
