package com.biz._if;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0;
		int index = 0;
		
		// 5������
		count = intPay / intPaper ;
		intPay -= (intPaper * count);
		// index ++; // 1
		if(index++ % 2 == 0) intPaper /= 5;
		else intPaper /= 2;

		// 1������
		count = intPay / intPaper ;
		intPay -= (intPaper * count);
		// index ++; // 2
		if(index++ % 2 == 0) intPaper /= 5;
		else intPaper /= 2;
		
		
		// 5õ����
		count = intPay / intPaper ;
		intPay -= (intPaper * count);
		index ++; // 3
		if(index == 3) intPaper /= 5;
			
	}

}


