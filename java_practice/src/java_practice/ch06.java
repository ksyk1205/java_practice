package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch06 {
	//6�� �迭
	public static void main(String[] args) {
		ColumnChart();
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

}
