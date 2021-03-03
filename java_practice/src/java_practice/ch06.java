package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch06 {
	//6장 배열
	public static void main(String[] args) {
		ColumnChart();
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

}
