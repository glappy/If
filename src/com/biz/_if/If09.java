package com.biz._if;

public class If09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 ���� 100���� �ݺ��ϴ� �ڵ带 ����
		// ������ ���Ƿ� �ۼ�
		// for(int i = 1 ; i<= 100; i++) { 
		for(int i = 0; i < 100; i++) {
			int index = i + 1;
			int m = i  % 5; // 0,1,2,3,4
			if(m == 0) {
				System.out.println(i + "�� 5�� ����̴�" );
			}
			if(m == 1) {
				System.out.println("�ϴ�õ����");
			}
			if(m == 2) {
				System.out.println("���ѹα�����");
			}
			if(m == 3) {
				System.out.println("�츮���󸸼�");
			}
			if(m == 4) {
				System.out.println("Republic of Kore");
			}
			if(m == 5) {
				System.out.println("�ƹ��͵� �ƴϾ�");
			}			
		}	

	}

}
