package com.biz._if;

public class If14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String weekName = "" ;
		
		// 1���� 10���� �ݺ�
		for(int i = 0 ; i < 10 ; i++) {
			int week = (i % 7) + 1; // 1~7
			if(week == 1) weekName = "������";
			if(week == 2) weekName = "ȭ����";
			if(week == 3) weekName = "������";
			if(week == 4) weekName = "�����";
			if(week == 5) weekName = "�ݿ���";
			if(week == 6) weekName = "�����";
			if(week == 7) weekName = "�Ͽ���";
			System.out.println(weekName);
		}
		
		// 11�� 1���� ����Ϸ�
		// 0�� �����Ϸ� �����ϴ� 3������
		int intNov = 3; 
		for(int i = 0 ; i < 30 ; i++) {
			int week = (intNov++ % 7); // 0~6
			if(week == 0) weekName = "������";
			if(week == 1) weekName = "ȭ����";
			if(week == 2) weekName = "������";
			if(week == 3) weekName = "�����";
			if(week == 4) weekName = "�ݿ���";
			if(week == 5) weekName = "�����";
			if(week == 6) weekName = "�Ͽ���";
			System.out.println("11��" 
					+ (i+1) + " ��" 
					+ weekName + " ���� �Դϴ�");
		}

		// 11�� 1���� ����Ϸ�
		// 0�� �����Ϸ� �����ϴ� 3������
		intNov = 3; 
		for(int i = 0 ; i < 30 ; i++) {
			int week = (intNov++ % 7); // 0~6
			switch(week) {
				case 0 : weekName = "������";
							break;
				case 1 : weekName = "ȭ����";
							break;
				case 2 : weekName = "������";
							break;
				case 3 : weekName = "�����";
							break;
				case 4 : weekName = "�ݿ���";
							break;
				case 5 : weekName = "�����";
							break;
				case 6 : weekName = "�Ͽ���";
			}
			System.out.println("11��" 
					+ (i+1) + " ��" 
					+ weekName + " ���� �Դϴ�");
		}
	}

}