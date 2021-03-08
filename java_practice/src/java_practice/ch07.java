package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch07 {
	//07�� �޼��� 
	static Scanner stdIn = new Scanner(System.in);	
	static int SignOf1(int n) {
		int sign=0;
		
		if(n>0) {
			sign = 1;
		}else if(n<0) {
			sign = -1;
		}else {
			sign = 0;
		}
		
		return sign;
	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if(b<min) 
			min=b;
		if(c<min)
			min=c;
		
		return min;
	}

	static int med(int a, int b, int c) {
		if(a>=b) {
			if(b>=c)
				return b;
			else if(a>=c) {
				return c;
			}else {
				return a;
			}
		}else if(a > c) {//a < b
			return a;
		}else if(b < c) {//c > a /a < b
			return b;
		}else {//c > a /a < b /b > c
			return c;
		}
		
		
	}
	static int sumUp(int x) {
		int sum = 0;
		for(int i=1; i<=x; i++) {
			sum += i;
		}
		return sum;
	}
	
	static void hello() {
		System.out.println("�ȳ��ϼ���.");
	}
	
	static void printSeason(int month) {
		//��(3,4,5) / ����(6,7,8) / ����(9,10,11) / �ܿ�(12,1,2)
		if(month>=3 && month<=5)
			System.out.print("��");
		else if(month >=6 && month<=8) 
			System.out.print("����");
		else if(month>=9 && month<=11)
			System.out.print("����");
		else if(month==12 || month ==1 || month==2)
			System.out.print("�ܿ�");
		/*
		switch(month) {
			case 3: case 4: case 5:
				System.out.print("��"); break;
			case 6: case 7: case 8:
				System.out.print("����"); break;
			case 9: case 10: case 11:
				System.out.print("����"); break;
			case 12: case 1: case 2:
				System.out.print("�ܿ�"); break;
		}*/
	}
	
	static void putChar(char c,int n) {
		while(n-- > 0)
			System.out.print(c);
	}
	static void putStart(int n) {
		putChar('*',n);
	}
	static int random(int max, int min) {
		if(max<=min)
			return min;
		else {
			Random rand = new Random();
			return min + rand.nextInt(max-min+1); 
		}
	}
	
	static int readPlusInt() {
		int x;
		do {
			System.out.println("���� ������ : ");
			x = stdIn.nextInt();
		}while(x<=0);
		return x;
	}
	
	
	public static void main(String[] args) {
		//���� 7-1. �Է��� int�� �������� �����̸� -1, 0�̸� 0, ����̸� 1�� ��ȯ�ϴ� �޼��带 �ۼ�����.	
		System.out.println("���� : ");
		int x = stdIn.nextInt();
		
		int s = SignOf1(x);
		System.out.println("signOf(x)�� "+s+"�Դϴ�.");
		
		//���� 7-2. 3���� int�� �μ� a,b,c, �߿� �ּڰ��� ���ϴ� min �޼��带 �ۼ�����
		System.out.println("���� a"); int a = stdIn.nextInt();
		System.out.println("���� b"); int b = stdIn.nextInt();
		System.out.println("���� c"); int c = stdIn.nextInt();
		
		System.out.println("���� a,b,c, �߿� �ּڰ��� "+min(a,b,c)+" �Դϴ�.");
		
		//���� 7-3. 3���� ���������� �߰��� ���ϴ� med �޼��带 �ۼ�����.
		System.out.println("���� a"); a = stdIn.nextInt();
		System.out.println("���� b"); b = stdIn.nextInt();
		System.out.println("���� c"); c = stdIn.nextInt();
		
		System.out.println("���� a,b,c, �߿� �߰����� "+med(a,b,c)+" �Դϴ�.");
		
		//���� 7-4. 1���� n������ ������ ���� ���ؼ� ��ȯ�ϴ� �޼���
		System.out.println(" 1���� x������ ���� ������. ");
		do {
			System.out.println("x�� �� : ");
			x=stdIn.nextInt();
		}while(x<=0);
		
		System.out.println("1���� "+x+" ������ ���� "+sumUp(x)+" �Դϴ�.");
		
		//���� 7-5.�ȳ��ϼ���.��� ǥ���ϴ� hello �޼��带 �ۼ�
		hello();
		
		//���� 7-6. �μ� m�� ������ ���� ������ ǥ���ϴ� printSeason �޼��带 �ۼ� 
		int month;
		do {
			System.out.print("����Դϱ�?(1~12) :");
			month = stdIn.nextInt();
			
		}while(month<1 || month>12);
		
		System.out.print(month+"���� ������ ");
		printSeason(month);
		System.out.print(" �Դϴ�.");
		
		//���� 7-7. ���� c�� n�� ǥ���ϴ� putChar �޼���� �� �޼��带 ���ο��� ȣ���ؼ� ���� "*"�� n�� �������� ǥ���ϴ� putStart�޼��� �ۼ��Ͽ�
		//�����ﰢ���� ������.
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ��� :");
		int n = stdIn.nextInt();
		for(int i=0; i<n; i++) {
			putStart(n);
			System.out.println();
		}
		
		//���� 7-8.����(a=<���� =<b)�� �����ؼ� ��ȯ�ϴ� random�޼��带 �ۼ�  (����, y<=x�� ��� x���� �״�� ��ȯ
		System.out.println("������ �����մϴ�.");
		System.out.println("���Ѱ� :"); x = stdIn.nextInt();
		System.out.println("���Ѱ� :"); int y = stdIn.nextInt();
		
		System.out.print("������ ������ "+random(y,x)+" �Դϴ�.");
		
		//���� 7-9. ���� ������: �̶�� �޼����� �������� ���Է��ϸ� ���� �Ųٷ� ��ȯ�ϴ� readPlusInt �޼��带 �ۼ�
		//0�̳� ����(-)�� �ԷµǸ� ���Է��ϵ��� �� ��
		do {
			n = readPlusInt();
			
			System.out.println("�ݴ�� ������ ");
			while(n>0) {
				System.out.print(n%10);
				n/=10;
			}
			System.out.println("�Դϴ�.");
			
			do {
				System.out.println("�ٽ��ѹ� ? yes...1 / No...0");
				x = stdIn.nextInt();
			}while(x!=0 && x!=1);
		}while(x==1);
		
		
		
	}	
	
}
