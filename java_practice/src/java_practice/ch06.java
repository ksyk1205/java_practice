package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch06 {
	//6�� �迭
	public static void main(String[] args) {
		UnevennessArray();
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
					
				}while(j<i);
				
			}
			for (int i = 0; i < n; i++) {
				System.out.println("a["+i+"] =" + a[i] );
			}
	}
	public static void Shuffle() {
	//���� 6-13. �迭�� ���� ���� ���� 
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�迭�� ��� �� ��?");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.println("a["+i+"] =");
			a[i] = stdIn.nextInt();
		}
		
		for(int j=0; j<n; j++) {
			int idx1 = rand.nextInt(n);
			int idx2 = rand.nextInt(n);
			
			int t =a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
		
		System.out.println("�迭�� ��Ҹ� �������ϴ�.");
		for(int i=0; i<n; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
	}
	public static void CopyArrayReverse() {
	//���� 6-14. �迭�� ��� ��Ҹ� �������� �����ؼ� ǥ��.
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�迭�� ��� ��  ?");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.println("a["+i+"] =");
			a[i] = stdIn.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			b[i] = a[n-i-1];
		}
		System.out.println("a�� ����Ҹ� �������� �����߽��ϴ�.");
		
		for(int i=0; i<n; i++) {
			System.out.println("b["+i+"] ="+b[i]);
		}
			
	}
	public static void MonthCAI() {
	//���� 6-15. ���� 1~12�� ���ڷ� ǥ���ϰ� �ش� ���� ����ܾ �Է�
		//���� ������ ����/�н��ڰ� ���ϴµ����� ��� ������ ����/ ���� ���� �����ؼ� ǥ�������� ��
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {"January","February","March","April","May","June","July","August",
				"September","October","November","December"};
		System.out.println("�ش� ���� ����ܾ �Է��ϼ���.");
		System.out.println("ù ���ڴ� �빮��,�������� �ҹ��ڷ� �Է��ϼ���.");
		
		int retry; //�ٽ��ѹ�
		int last =-1; //���� ��
		int month;
		do {
			do {
				month = rand.nextInt(12);
			}while(month == last);
			last = month;
			
			while(true) {
				System.out.println(month+1+"�� :");
				String m = stdIn.next();
				
				if(m.equals(monthString[month])) break;
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			
			System.out.println("�����Դϴ�. �ٽ� �ѹ� �Ͻðڽ��ϱ�? 1...yes , 0...No");
			retry = stdIn.nextInt();
		}while(retry == 1);
		
		
	}
	public static void DayCAI1() {
	//���� 6-16. ������ ǥ���ϰ� �ش� ������ ����ܾ �Է��ϴ� �����н����α׷�
		//������ ������ ����ؼ� ����/ �н��ڰ� ���ϴ� ��ŭ �ݺ�/���Ͽ����� �����ؼ� ǥ�� ��������
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] dayKorean = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		String[] dayEnglish = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		
		System.out.println("���ϸ��� ���� �ҹ��ڷ� �Է��Ͻÿ�");
		
		int last = -1;
		int day;
		int retry;
		
		do {
			do {
				day = rand.nextInt(7);
			}while(day == last);
			last = day;
			
			while(true) {
				System.out.println(dayKorean[day]);
				String d = stdIn.next();
				
				if(d.equals(dayEnglish[day])) break;
				
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
			System.out.println("�����Դϴ�. �ٽ� �ѹ� �Ͻðڽ��ϱ�? 1...yes , 0...No");
			retry = stdIn.nextInt();
			
		}while(retry == 1);
		
	}
	public static void PrintArrayVariable() {
	//���� 6-17. �迭 ������ ���� ǥ���ϴ� ���α׷�
		int[] a = new int[5];
		System.out.println("a ="+ a);
		a= null;
		System.out.println("a ="+ a);
	}
	public static void MatrixProduct() {
	//���� 6-18. 4�� 3���� ��İ� 3�� 4���� ��� ���ϱ�	
		Scanner stdIn = new Scanner(System.in);
		int[][] a = new  int[4][3]; //4�� 3��
		int[][] b = new  int[3][4]; //3�� 4��
		int[][] c = new  int[4][4]; //a x b �� ������ �迭
		
		System.out.println("a ����� ��Ҹ� �Է��ϼ���.");
		for(int i=0; i <4; i++) {
			for(int j=0; j<3; j++) {
				a[i][j] = stdIn.nextInt();
			}
		}
		System.out.println("b ����� ��Ҹ� �Է��ϼ���.");
		for(int i=0; i <3; i++) {
			for(int j=0; j<4; j++) {
				b[i][j] = stdIn.nextInt();
			}
		}
		for(int i=0; i <4; i++) {
			for(int j=0; j<4; j++) {
				 for(int k=0; k<3; k++)
					 c[i][j] += a[i][k] * b[k][j];
			}
		}
		System.out.println("��� a�� b�� ��");
		for(int i=0; i <4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%5d", c[i][j]);
			}
			System.out.println();
		}
		
	}
	public static void PointTotalization() {
	//���� 6-19. 6���� �ΰ��� ����(����,����) �����κ��� ����/�л��� ���
		Scanner stdIn = new Scanner(System.in);
		final int number = 6;
		int[][] point = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];
		
		
		System.out.printf("%d���� ����, ���� ������ �Է��ϼ���.\n",number);
		
		for(int i=0; i<number; i++) {
			System.out.printf("%2d�� ���� : ", i+1);
			point[i][0] = stdIn.nextInt();
			System.out.print("����");
			point[i][1] = stdIn.nextInt();
			
			sumStudent[i] = point[i][0] + point[i][1];
			sumSubject[0] += point[i][0]; //������ �հ�
			sumSubject[1] += point[i][1]; //������ �հ�
			
		}
		
		
		System.out.println("No. ����    ����    ���");
		for(int i=0; i<number; i++) {
			System.out.printf("%2d%6d%6d%6.1f\n", i+1, point[i][0],point[i][1],(double)sumStudent[i]/2);
		}
		System.out.printf("���%6.1f%6.1f\n", (double)sumSubject[0]/number ,(double)sumSubject[1]/number );
	}
	public static void UnevennessArray() {
	//���� 6-20. �ұ�Ģ���� 2���� �迭 
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ұ�Ģ�� 2���� �迭�� �����մϴ�.");
		System.out.println("�� ��:");
		int height = stdIn.nextInt();
		
		int[][] c = new int[height][];
		
		for(int i=0; i<c.length; i++) {
			System.out.print(i+"��°�� �� �� :");
			int width = stdIn.nextInt();
			c[i] = new int[width];
		}
		System.out.println("�� ����� ���� �Է��ϼ���.");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.printf("c[%d][%d] :",i,j);
				c[i][j] = stdIn.nextInt();
			}
			
		}
		System.out.println("�迭c�� �� ��ڰ��� ������ �����ϴ�.");
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.printf("%3d",c[i][j]);
			}
			System.out.println();
		}
			
		
	}
}
