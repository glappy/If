package com.biz._if;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0;
		int index = 0;
		
		for(;;) {
		
			count = intPay / intPaper ;
			intPay -= (intPaper * count);
			System.out.println(intPaper + "����:" + count);
			
			// ���� intPay�� 0�� �Ǿ
			// ���̻� ȭ��ż��� ����� �ʿ䰡
			// ������ �׸� ����϶�..
			if(intPay <= 0) break ; // �ߴ�
			
			if(index++ % 2 == 0) intPaper /= 5;
			else intPaper /= 2;
		
		}
	}
}
