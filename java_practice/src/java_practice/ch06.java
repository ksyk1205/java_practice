package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch06 {
	//6�� �迭
	public static void main(String[] args) {
		ArrayRand();
	}
	public static void DoubleArray() {
	//���� 6-1. ��� ���� 5�̰� double�� �迭	
		double[] a = new double[5];
		System.out.println("a[0]="+a[0]);
		System.out.println("a[1]="+a[1]);
		System.out.println("a[2]="+a[2]);
		System.out.println("a[3]="+a[3]);
		System.out.println("a[4]="+a[4]);
	}
	public static void IntArrayFor() {
	//���� 6-2. �迭�� �� ��ҿ�  5,4,3,2,1�� �����ؼ� ǥ��
		double[] a = new double[5];
		
		for(int i=0; i<a.length; i++) {
			a[i]=5-i;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] ="+a[i]);
		}
		
	}
	public static void DoubleArrayFor() {
	//���� 6-3. �迭�� �� ��ҿ� 1.1,2.2,3.3,4.4,5.5�� �����ؼ� ǥ��
		double[] a = new double[5];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (i+1)*1.1;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] ="+a[i]);
		}
	}
	public static void ColumnChart() {
	//���� 6-4. �迭�� �� ��ҿ� 1~10���� ������ ������ �� ����׷����� ǥ�� �������� �ε��� ǥ�ô� 10������ ǥ��  	
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�迭�� ��� ����?");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = 1+rand.nextInt(10);
		}
		
		for(int i=10; i>=1; i--) {
			for(int j=0;j<n;j++) {
				if(a[j]>=i) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		//------
		for(int i=0; i<2*n; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.print(i %10 + " ");
		}
		
		System.out.println();
	}
	public static void IntArray54321() {
	//���� 6-5. int�� �迭�� �� ��Ҹ� 5,4,3,2,1�� �ʱ�ȭ �Ͽ� ǥ��
		int a[] = {5,4,3,2,1};
		
		for(int i =0; i<a.length; i++)
			System.out.println("a["+i+"] = "+a[i]);
	}
	public static void PrintArray() {
	//���� 6-6. �迭�� ��Ҽ��� ���� ����� ���� �Է¹޾� ǥ��
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��Ҽ� : ");
		int n = stdIn.nextInt();
		int[] a= new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.print("a["+i+"] = ");
			a[i]=stdIn.nextInt();
			
		}
		System.out.print("a= [");
		for(int j=0; j<n; j++) {
			if(j==n-1) {
				System.out.print(a[j]);
			}else {
				System.out.print(a[j]+",");
			}
			
			
		}
		System.out.println("]");
	}
	public static void PointSumAve() {
	//���� 6-6. �Է¹��� ������ �հ�,��� ,�ְ���,�������� ���Ͻÿ�.  
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("��� ����?");
		int p = stdIn.nextInt();
		
		int[] a= new int[p];
		
		for(int i=0; i<p; i++) {
			System.out.println((i+1)+"�� �л��� ������?");
			a[i] = stdIn.nextInt();
		}
		//���� ���Ѵ�.
		int sum=0 ;
		for(int j=0; j<p; j++) {
			sum += a[j];
		}
		//�ְ����� �ּ����� ���Ѵ�.
		int max = a[0];
		int min = a[0];
		for(int x=1; x<p; x++) {
			if(a[x]>max) {
				max=a[x];
			}
			if(a[x]<min) {
				min=a[x];
			}

		}

		System.out.println("�հ�� "+sum+"�Դϴ�.");
		System.out.println("����� "+sum/p+"�Դϴ�.");
		System.out.println("�ְ��� "+max+"�Դϴ�.");
		System.out.println("������"+min+"�Դϴ�.");
			
			
	}
	public static void LinearSearchTop() {
	//���� 6-8. �迭���� Ư�� ���� ������ ��Ҹ� ã�ƶ�. ���ϰ����� ��Ұ� �������� ���� �տ� ��ġ�� ��Ҹ� ã�� ���α׷�
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�迭�� ��� �� ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("a["+i+"] =");
			a[i]=stdIn.nextInt();
		}
		
		System.out.println("ã������ Ư�� ���� �Է��Ͻÿ�");
		int number = stdIn.nextInt();
		int j;
		for(j=0;j<n;j++) {
			if(a[j]==number)
				break;
		}
		
		if(j<n) {
			System.out.println("ã�� ���� a["+j+"]�� �ֽ��ϴ�.");
		}else {
			System.out.println("ã�� ���� �����ϴ�.");
		}
	}
	public static void ArraySumAve() {
	//���� 6-9. double���� ��� �迭 ����� �հ� ����� ���ؼ� ǥ��
		Scanner stdIn = new Scanner(System.in);
		System.out.println("��� �� :");
		int n = stdIn.nextInt();
		double[] b = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("b["+i+"] =");
			b[i] = stdIn.nextDouble();
		}
		
		double sum =0 ;
		for(double i : b) {//Ȯ�� for�� 
			sum+= i;
		}
		System.out.println("�հ�� "+sum);
		System.out.println("�����"+sum/n);

	}
	public static void ArrayRand() {
	//���� 6-10. �迭�� ��� ��ҿ� 1~10�� ������ ����	
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� �� :");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = 1 + rand.nextInt(10);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"] =" + a[i] );
		}
	}
	public static void ArrayRandX() {
	//���� 6-11. �迭�� ��� ��ҿ� 1~10�� ������ ä���(������ ��Ұ� �ߺ������ʰ�)
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��� �� :");
		int n = stdIn.nextInt();
		
		int[] a = new int[n];
		
		a[0] = 1 + rand.nextInt(10);
		for(int i=1; i<n; i++) {
			do {
			a[i] = 1 + rand.nextInt(10);
			}
			while(a[i]==a[i-1]);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"] =" + a[i] );
		}
	}
	public static void ArrayRandY() {
	//���� 6-12. �迭�� ��� ��ҿ� 1~10�� ������ ä���(��� ��Ұ� �ߺ������ʰ�)
			Random rand = new Random();
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("��� �� :");
			int n = stdIn.nextInt();
			
			int[] a = new int[n];
			
			for(int i=0; i<n; i++) {
				int j;
				do {
					a[i] = 1+ rand.nextInt(10);
					for(j=0; j<i; j++)
						if(a[j]==a[i]) break;
					
				}while(j>i);
				
			}
			for (int i = 0; i < n; i++) {
				System.out.println("a["+i+"] =" + a[i] );
			}
	}
	
	
	

}
