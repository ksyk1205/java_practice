package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch03 {
	//3�� ���α׷��� �帧 : �б� 
	public static void main(String[] args) {
		// ���� 3-1. Ű����� �Է��� �������� ���̸� ���� ���̶�� ǥ��
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ : ");
		int a = scan.nextInt();
		if(a<0) {
			System.out.println("�Է��� �������� ����Դϴ�.");
		}
			
		//���� 3-2. �������� �Է¹޾� ������ ǥ��
		System.out.println("������ : ");
		int b = scan.nextInt();
		
		if(b<0) {
			b = -b;
		}			
		System.out.println("�Է��� �������� ������" +b+"�Դϴ�.");
		
		//���� 3-3. �Է¹��� ������A�� B�� ������� �Ǻ�
		
		System.out.println("���� A : ");
		int A = scan.nextInt();
		System.out.println("���� B : ");
		int B = scan.nextInt();
		
		if(B%A == 0) {
			System.out.println("A�� B�� ����̴�.");
		}else {
			System.out.println("A�� B�� ����� �ƴϴ�.");
		}
		
		//���� 3-4. �Է¹��� �������� ��ȣ(���,����,0)�� �����Ͽ� ǥ��
		
		System.out.println("������ : ");
		int n = scan.nextInt();
		if(n>0) {
			System.out.println("����� �Է��Ͽ����ϴ�");
		}else if(n<0) {
			System.out.println("������ �Է��Ͽ����ϴ�");
		}else if(n==0) {
			System.out.println("0���� �Է��Ͽ����ϴ�");
		}
			
		//���� 3-5. ���� a,b�� �Է¹޾� ��Ұ��� ǥ��
		System.out.println("���� a : ");
		a = scan.nextInt();
		System.out.println("���� b : ");
		b = scan.nextInt();
		
		if(a<b) {
			System.out.println("b�� ũ��");
		}else if (a>b) {
			System.out.println("a�� ũ��");
		}else {
			System.out.println("a��b�� ����");
		}
		
		//���� 3-6. �Է¹��� �������� ��������� 5�� ������������� ǥ��
		System.out.println("������ : ");
		n= scan.nextInt();
		if(n%5 == 0) {
			System.out.println("�Է¹��� ���� 5�� ������ ��������");
		}else {
			System.out.println("�Է¹��� ���� 5�� ������ ���������ʴ´�.");
		}
		
		//���� 3-7. �Է¹��� �������� 10�� ������� ǥ��
		System.out.println("������ : ");
		n= scan.nextInt();
		if(n>0) {
			if(n%10 == 0) {
				System.out.println("�Է¹��� ���� 10�� ����̴�");
			}else {
				System.out.println("�Է¹��� ���� 10�� ����� �ƴ�");
			}
		}else {
			System.out.println("n�� �����Դϴ�.");
		}
		
		//���� 3-8. �Է��� ���������� ��/��/��/��/���� ����
		System.out.println("���� : ");
		int score = scan.nextInt();
		
		if(score>=0 && score<=49) {
			System.out.println("��");
		}else if(score>=50 && score<=59) {
			System.out.println("��");
		}else if(score>=60 && score<=69) {
			System.out.println("��");
		}else if(score>=70 && score<=79) {
			System.out.println("��");
		}else if(score>=80 && score<=100) {
			System.out.println("��");
		}else {
			System.out.println("�߸��� ������ �Է��Ͽ����ϴ�.");
		}
		
		//���� 3-9. 2���� �Ǽ��� �߿� ū���� ǥ��
		System.out.println("�Ǽ� C : ");
		double C = scan.nextInt();
		System.out.println("�Ǽ� D : ");
		double D = scan.nextInt();
		
		double max ;
		if(C<D)
			max = D;
		else
			max = C;
		//max = a>b?a:b	
		System.out.println("ū ���� :" +max);
		
		//���� 3-10. 2���� �������� �о �� ���� ���� ǥ��
		System.out.println("���� a :");
		a = scan.nextInt();
		System.out.println("���� b :");
		b = scan.nextInt();
		
		int tot;
		if(a>b) {
			tot = a-b;
		}else {
			tot=b-a;
		}
		System.out.println("�� ������ ���� "+tot);
		
		//���� 3-11. 2���� ������ ���̰� 10�����ΰ��� �ƴѰ�� ǥ��
		System.out.println("���� A :");
		A = scan.nextInt();
		System.out.println("���� B :");
		B = scan.nextInt();
		
		tot = A>B ? A-B : B-A;
		
		if(tot<=10) {
			System.out.println("A��B�� ���� 10 �����Դϴ�.");
		}else {
			System.out.println("A��B�� ���� 10 �̻��Դϴ�.");
		}
		
		//���� 3-12.3���� ���� �� �ּڰ��� ���ϱ�
		
		System.out.println("���� a :");
		a = scan.nextInt();
		System.out.println("���� b :");
		b = scan.nextInt();
		System.out.println("���� c :");
		int c = scan.nextInt();
		
		int min = A;
		if(A>B)
			min = B;
		else if( A>c )
			min = c ;
		
		System.out.println("3���� ���� �� �ּڰ��� " + min);
		
		//����  3-13. 3���� ���� �� �߾� �� ���ϱ�
		System.out.println("���� a :");
		a = scan.nextInt();
		System.out.println("���� b :");
		b = scan.nextInt();
		System.out.println("���� c :");
		c = scan.nextInt();
		
		int cen  = 0;
		
		
		if(a>b) {
            if(b>c) {
               cen = b ;
            }else if(a>c){
               cen = c;
            }else {
               cen = a;
            }
         }else if(a>c){ 
           if(b<=c) {
              cen = c;
           }
         }else if(b>c) {
        	 cen = b;
         }else {
        	 cen = c;
         }
		 
		System.out.println("�߰� ����" + cen);
		
		
		//����  3- 14 .�� ������ �� ���� ���� ū���� ���ؼ� ǥ��
		System.out.println("���� a :");
		a = scan.nextInt();
		System.out.println("���� b :");
		b = scan.nextInt();
		
		if(a==b)
			System.out.println("���� a �� b�� ���� �����ϴ�.");
		else {
			if(a>b) {
				min = b;
				max = a;
			}else {
				min = a;
				max = b;
			}
			System.out.println("�ּڰ� : " + min);
			System.out.println("�ִ� : " + max);
		}
		
		//���� 3-15. �� �������� ��������(ū ��)���� ǥ��
		if( a > b) {
			System.out.println(a+" > "+b);
		}else {
			System.out.println(b+" > "+a);
		}
		
		//���� 3-16. �� �������� ��������(���� ��)���� ǥ��
		System.out.println("���� a :");
		a = scan.nextInt();
		System.out.println("���� b :");
		b = scan.nextInt();
		System.out.println("���� c :");
		c = scan.nextInt();
		
		//a<b<c
		if(a>b) {
			int t = a;
				a = b;
				b = t;
		}
		
		if(b>c) {
			int t = b;
				c = b;
				b = t;
		}
		
		if(a>b) {
			int t = a;
				a = b;
				b = t;
		}
		System.out.println("a<b<c �� �ǵ��� ���� -> "+ a + "<"+ b+"<"+c);
		
		//���� 3-17. //������ �����Ͽ� 0-���� , 1- ���� , 2-��
		Random ran = new Random();
		System.out.println("����~����~��~!");
		
		int R = ran.nextInt(3);//0~2
		
		switch(R){
			case 0 : {
				System.out.println("����");
				break;
			}
			case 1 : {
				System.out.println("����");
				break;				
			}
			case 2 : {
				System.out.println("��");
				break;
			}
		}
		//���� 1-18. ���� 1~12�� ǥ�� 
		System.out.println("�� ���Դϱ�?");
		int month = scan.nextInt();
		 
		switch(month){
			case 3: 
			case 4: 
			case 5: 
				System.out.println("��");
				break;				
			case 6 : 
			case 7: 
			case 8: 
				System.out.println("����");
				break;
			case 9 : 
			case 10: 
			case 11: 
				System.out.println("����");
				break;
			
			case 12 : 
			case 1: 
			case 2: 
				System.out.println("�ܿ�");
				break;
			default : System.out.println("�׷� ���� �����ϴ�."); break;
		} 
	}
	

}
