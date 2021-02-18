package java_practice;

import java.util.Scanner;

public class ch03 {
	//3장 프로그램의 흐름 : 분기 
	public static void main(String[] args) {
		// 문제 3-1. 키보드로 입력한 정숫값이 음이면 음의 값이라고 표시
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int a = scan.nextInt();
		if(a<0) {
			System.out.println("입력한 정숫값이 움수입니다.");
		}
			
		//문제 3-2. 정숫값을 입력받아 절댓값을 표시
		System.out.println("정숫값 : ");
		int b = scan.nextInt();
		
		if(b<0) {
			b = -b;
		}			
		System.out.println("입력한 정숫값의 절댓값은" +b+"입니다.");
		
		//문제 3-3. 입력받은 정수값A가 B의 약수인지 판별
		
		System.out.println("변수 A : ");
		int A = scan.nextInt();
		System.out.println("변수 B : ");
		int B = scan.nextInt();
		
		if(B%A == 0) {
			System.out.println("A는 B의 약수이다.");
		}else {
			System.out.println("A는 B의 약수가 아니다.");
		}
		
		//문제 3-4. 입력받은 정숫값의 부호(양수,음수,0)를 판정하여 표시
		
		System.out.println("정숫값 : ");
		int n = scan.nextInt();
		if(n>0) {
			System.out.println("양수를 입력하였습니다");
		}else if(n<0) {
			System.out.println("음수를 입력하였습니다");
		}else if(n==0) {
			System.out.println("0값을 입력하였습니다");
		}
			
		//문제 3-5. 변수 a,b를 입력받아 대소관계 표시
		System.out.println("변수 a : ");
		a = scan.nextInt();
		System.out.println("변수 b : ");
		b = scan.nextInt();
		
		if(a<b) {
			System.out.println("b가 크다");
		}else if (a>b) {
			System.out.println("a가 크다");
		}else {
			System.out.println("a와b가 같다");
		}
		
		//문제 3-6. 입력받은 정숫값이 양수인지와 5로 나누어떨어지는지 표시
		System.out.println("정숫값 : ");
		n= scan.nextInt();
		if(n%5 == 0) {
			System.out.println("입력받은 값은 5로 나누어 떨어진다");
		}else {
			System.out.println("입력받은 값은 5로 나누어 떨어지지않는다.");
		}
		
		//문제 3-7. 입력받은 정숫값이 10의 배수인지 표시
		System.out.println("정숫값 : ");
		n= scan.nextInt();
		if(n>0) {
			if(n%10 == 0) {
				System.out.println("입력받은 값은 10의 배수이다");
			}else {
				System.out.println("입력받은 값은 10의 배수가 아님");
			}
		}else {
			System.out.println("n은 음수입니다.");
		}
		
		//문제 3-8. 입력한 점수에따라 수/우/미/양/가를 판정
		System.out.println("점수 : ");
		int score = scan.nextInt();
		
		if(score>=0 && score<=49) {
			System.out.println("가");
		}else if(score>=50 && score<=59) {
			System.out.println("양");
		}else if(score>=60 && score<=69) {
			System.out.println("미");
		}else if(score>=70 && score<=79) {
			System.out.println("우");
		}else if(score>=80 && score<=100) {
			System.out.println("수");
		}else {
			System.out.println("잘못된 점수를 입력하였습니다.");
		}
		
		//문제 3-9. 2개의 실숫값 중에 큰값을 표시
		System.out.println("실수 C : ");
		double C = scan.nextInt();
		System.out.println("실수 D : ");
		double D = scan.nextInt();
		
		double max ;
		if(C<D)
			max = D;
		else
			max = C;
		//max = a>b?a:b	
		System.out.println("큰 값은 :" +max);
		
		
		
		
		
	}
	

}
