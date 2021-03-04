package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch06 {
	//6장 배열
	public static void main(String[] args) {
		ArrayRand();
	}
	public static void DoubleArray() {
	//문제 6-1. 요소 수가 5이고 double인 배열	
		double[] a = new double[5];
		System.out.println("a[0]="+a[0]);
		System.out.println("a[1]="+a[1]);
		System.out.println("a[2]="+a[2]);
		System.out.println("a[3]="+a[3]);
		System.out.println("a[4]="+a[4]);
	}
	public static void IntArrayFor() {
	//문제 6-2. 배열의 각 요소에  5,4,3,2,1을 대입해서 표시
		double[] a = new double[5];
		
		for(int i=0; i<a.length; i++) {
			a[i]=5-i;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] ="+a[i]);
		}
		
	}
	public static void DoubleArrayFor() {
	//문제 6-3. 배열의 각 요소에 1.1,2.2,3.3,4.4,5.5를 대입해서 표시
		double[] a = new double[5];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (i+1)*1.1;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] ="+a[i]);
		}
	}
	public static void ColumnChart() {
	//문제 6-4. 배열의 각 요소에 1~10까지 난수를 대입한 후 막대그래프로 표시 마지막에 인덱스 표시는 10진수로 표시  	
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열의 요소 수는?");
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
	//문제 6-5. int형 배열의 각 요소를 5,4,3,2,1로 초기화 하여 표시
		int a[] = {5,4,3,2,1};
		
		for(int i =0; i<a.length; i++)
			System.out.println("a["+i+"] = "+a[i]);
	}
	public static void PrintArray() {
	//문제 6-6. 배열의 요소수와 개별 요소의 값을 입력받아 표시
		Scanner stdIn = new Scanner(System.in);
		System.out.println("요소수 : ");
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
	//문제 6-6. 입력받은 점수의 합계,평균 ,최고점,최저점을 구하시오.  
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("사람 수는?");
		int p = stdIn.nextInt();
		
		int[] a= new int[p];
		
		for(int i=0; i<p; i++) {
			System.out.println((i+1)+"번 학생의 점수는?");
			a[i] = stdIn.nextInt();
		}
		//합을 구한다.
		int sum=0 ;
		for(int j=0; j<p; j++) {
			sum += a[j];
		}
		//최고점과 최소점을 구한다.
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

		System.out.println("합계는 "+sum+"입니다.");
		System.out.println("평균은 "+sum/p+"입니다.");
		System.out.println("최고점 "+max+"입니다.");
		System.out.println("최저점"+min+"입니다.");
			
			
	}
	public static void LinearSearchTop() {
	//문제 6-8. 배열에서 특정 값을 가지는 요소를 찾아라. 동일값이의 요소가 여러개면 가장 앞에 위치한 요소를 찾는 프로그램
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열의 요소 수 ");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("a["+i+"] =");
			a[i]=stdIn.nextInt();
		}
		
		System.out.println("찾으려는 특정 값을 입력하시오");
		int number = stdIn.nextInt();
		int j;
		for(j=0;j<n;j++) {
			if(a[j]==number)
				break;
		}
		
		if(j<n) {
			System.out.println("찾는 값은 a["+j+"]에 있습니다.");
		}else {
			System.out.println("찾는 값이 없습니다.");
		}
	}
	public static void ArraySumAve() {
	//문제 6-9. double형인 모든 배열 요소의 합과 평균을 구해서 표시
		Scanner stdIn = new Scanner(System.in);
		System.out.println("요소 수 :");
		int n = stdIn.nextInt();
		double[] b = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("b["+i+"] =");
			b[i] = stdIn.nextDouble();
		}
		
		double sum =0 ;
		for(double i : b) {//확장 for문 
			sum+= i;
		}
		System.out.println("합계는 "+sum);
		System.out.println("평균은"+sum/n);

	}
	public static void ArrayRand() {
	//문제 6-10. 배열의 모든 요소에 1~10의 난수를 대입	
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 :");
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
	//문제 6-11. 배열의 모든 요소에 1~10의 난수를 채우기(인접한 요소가 중복되지않게)
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 :");
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
	//문제 6-12. 배열의 모든 요소에 1~10의 난수를 채우기(모든 요소가 중복되지않게)
			Random rand = new Random();
			Scanner stdIn = new Scanner(System.in);
			
			System.out.print("요소 수 :");
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
