package com.fleamarket.util;

//import java.text.DecimalFormat;
import java.util.Random;

public class FourFigures {
	
	public static int getOneRandomNum() {
		Random random = new Random();
		
		return random.nextInt(9000)+1000;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FourFigures.getOneRandomNum();
		System.out.println(FourFigures.getOneRandomNum());
	}

}
