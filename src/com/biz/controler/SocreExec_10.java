package com.biz.controler;

import com.biz.service.ScoreService_02;

public class SocreExec_10 {

	public static void main(String[] args) {

		ScoreService_02 ss = new ScoreService_02();
		for(int i = 0 ; i <100; i++) {
			if (ss.inputScore(i));
		}
		ss.calcTotal();
		ss.processRank();
		ss.viewScore();
	}

}
