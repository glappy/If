package com.biz._if;

public class If12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޿����� 3000 �����̸� 6%
		// �޿����� 3000 �ʰ� 10000 �����̸� 9%
		// 10000�� �ʰ��ϸ� 12%
		
		int intPay = 5000;
		if(intPay <= 3000) {
			System.out.println("����:" +
					(intPay * .06));
		}
		// if( 10000 >= intPay && 3000 < intPay) {
		if( 10000 >= intPay && intPay> 3000) {
			System.out.println("����:" +
					(intPay * .09));
		}
		if( intPay> 10000) {
			System.out.println("����:" +
					(intPay * .12));
		}
	

	}

}