package com.biz._if;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0;
		
		// 5������ ���� ���
		count = intPay / intPaper;
		// count ������ int ������ ����Ǿ� �ֱ⶧����
		// = �ڿ��� � ���(����)����� ���͵�
		// ������ �Ҽ��� ���ϴ� �߶������
		// �����κи� count ������ ����ȴ�.
		
		System.out.println("5������:" + count);
		
		// ���� 5�������� ���������
		// 5�������� ������ �ݾ׿��� ������ ȭ��������
		// ��� �Ѵ�.
		
		// ������ intPay�� ���� 5�������� �ż���
		// ��� �����Ƿ�
		// 1�������� ����Ҷ��� 5������ �ݾ׸�ŭ��
		// �����ϰ� 1���� �ż��� ���ؾ� �Ѵ�.
		intPay -= (intPaper * count);
		intPaper /= 5; // �׸鰡�� 5�������� 1�������� ����

		count = intPay / intPaper;
		System.out.println("1������" + count);

		// 5õ���� ���ϱ�
		intPay -= (intPaper * count);
		intPaper /= 2; // 5õ����
		
		count = intPay / intPaper ;
		intPay = (intPaper * count);
		
		// õ����
		intPay -= (intPaper * count);
		intPaper /= 5; // 1õ����
		
		count = intPay / intPaper ;
		intPay = (intPaper * count);
		
		// �������
		intPay -= (intPaper * count);
		intPaper /= 2; // 5�����
		
		count = intPay / intPaper ;
		intPay = (intPaper * count);
		
		
	}

}