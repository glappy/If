package com.biz._if ;
public class If13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޿����� 3000 �����̸� 6%
		// �޿����� 3000 �ʰ� 10000 �����̸� 9%
		// 10000�� �ʰ��ϸ� 12%
		int intPay = 5000;
		if(intPay <=3000) {
			// 3000 �����϶�
			System.out.println("����:" +
					(intPay * .06));
			
		// �̹� intPay 3000�� �ʰ��� ����̹Ƿ�
		// ���� intPay > 3000�� �˻��� �ʿ䰡
		// ���������ȴ�.
		} else if(intPay <= 10000) {
			System.out.println("����:" +
					(intPay * .09));
			
		// �̹� intPay <= 10000 ������ ��� ��찡
		// ����� ���ȱ� ������
		// else������ ������ ������ ó���ϸ� �ȴ�.
		} else { // > 10000
			System.out.println("����:" +
					(intPay * .12));
		}
	}
}
