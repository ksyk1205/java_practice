package java_practice;

import java.util.Random;
import java.util.Scanner;

public class ch07 {
	//07�� �޼��� 
	static Scanner stdIn = new Scanner(System.in);	
	static Random rand = new Random();
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
	
	static boolean confirmRetry() {
		int count;
		do {
			System.out.println("�ٽ� �ѹ� �����Ͻðڽ��ϱ�? yes....1/ no....0");
			count = stdIn.nextInt();
		}while(count!=0 && count!=1);
		return count ==1;
	}
	
	static int pow2(int n) {
		int pw = 1;
		while(n-- > 0) {
			pw*=2;
		}
		return pw;
	}
	
	static void printBits(int x) {
		for(int i =31;  i>=0; i--) {
			System.out.print((x>>>i & 1) ==1 ? '1' : '0');
		}
		
	}
	static int rRotate(int x, int n) {
		if(n<0) 
			return lRotate(x,-n);
		n%=32;
		return (n==0 ? x : (x>>>n)|(x<<(32-n)));
		
		
	}

	static int lRotate(int x, int n) {
		if(n<0) 
			return rRotate(x,-n);
		n%=32;
		return (n==0 ? x : (x<<n)|(x>>>(32-n)));
	}
	
	static int sumOf(int[] arr) {
		int sum=0;
		for(int i =0 ; i<arr.length; i++) {
			sum +=arr[i];
		}
		return sum;
	}
	
	static void minOf(int[] a) {
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<min) {
				min =a[i];
			}
		}
		System.out.print(min);
		
	}
	
	static int linearSearchR(int[] arrN, int key) {
		for(int i=arrN.length; i>=0; i--) {
			if(arrN[i] == key) {
				return i;
			}
		}
		return -1;
	}

	static int linearSearch(int[] arrN, int key) {
		for(int i=0; i<arrN.length; i++) {
			if(arrN[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static void aryRmv(int[] arrX, int index) {
		if(index>=0 && arrX.length > index ) {
			for(int i=index; i<arrX.length-1; i++) {
				arrX[i] = arrX[i+1];
			}
		}
		
	}
	
	static void aryRmv(int[] arrX, int idx, int n) {
		if(n>0 && idx>=0 && idx+n<arrX.length) {
			int idx2 = idx +n -1;
			for(int i = idx; i<=idx2; i++) {
				arrX[i]= arrX[i+n];
			}
		}
		
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
		
		//���� 7-10. �ϻ��Ʒ�(3���� 3�ڸ� ������ ����� ���)
		//4���l ��� ���� �� �ϳ��� �������� �����ϴ� ���α׷�  
		//x+y+z / x+y-z / x-y+z / x-y-z
		System.out.println("�ϻ� �Ʒ�!!");
		
		do {
			x = 100 + rand.nextInt(900);
			y = 100 + rand.nextInt(900);
			int z = 100 + rand.nextInt(900);
			
			int pattern = rand.nextInt(4);
			int answer = 0;
			switch(pattern) {
				 case 0 : answer = x+y+z ; break;
				 case 1 : answer = x+y-z ; break;
				 case 2 : answer = x-y+z ; break;
				 case 3 : answer = x-y-z ; break;
			}
			while(true) {
				System.out.print(x+((pattern <2 ? "+":"-"))
						+ y + (pattern%2 ==0 ? "+":"-")
						+ z  +" = ");
				int k =stdIn.nextInt();
				
				if(k==answer)
					break;
				
			}
		}while(confirmRetry());
		
		//���� 7-11. ������ �¿�� ����Ʈ�� ���� , ���� x2 �ŵ����� �� ����/2�� �ŵ����� �� ������ Ȯ���ϴ� ���α׷�
		System.out.println("���� x �� n��Ʈ�� ����Ʈ �մϴ�.");
		System.out.println("x : "); x=stdIn.nextInt();
		System.out.println("n : "); n=stdIn.nextInt();
		
		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		int lShift = x << n;
		int rShift = x >> n;
		
		System.out.printf("[a] X x(2�� %d��)=%d\n" , n,mPower);
		System.out.printf("[b] X /(2�� %d��)=%d\n" , n,dPower);
		System.out.printf("[c] X << %d=%d\n",n,lShift);
		System.out.printf("[d] X >> %d=%d\n",n,rShift);
		
		System.out.println("[a] ��  [c]�� ���� "+((mPower == lShift) ? "��ġ�մϴ�.":"��ġ�����ʽ��ϴ�."));
		System.out.println("[b] ��  [d]�� ���� "+((dPower == rShift) ? "��ġ�մϴ�.":"��ġ�����ʽ��ϴ�."));
		
		
		//���� 7-12. ���� x�� ���������� n��Ʈ ȸ���� ���� ��ȯ�ϴ� rRotate�޼���� �������� n��Ʈ ȸ���� ���� ��ȯ�ϴ� lRoate �޼��带 �ۼ�
		System.out.println("���� x�� n��Ʈ ȸ���մϴ�.");
		System.out.print("x :"); x = stdIn.nextInt();
		System.out.print("y :"); y = stdIn.nextInt();
		
		System.out.println("ȸ�� �� =");
		printBits(x);
		System.out.println("\n������ �� =");
		printBits(rRotate(x, n));
		System.out.println("\n���� �� =");
		printBits(lRotate(x, n));
		
		//���� 7-15. �迭 a�� ���� ��� ����� ���� ���ϴ� sumOf()�޼���
		System.out.println("��� �� :");
		int num = stdIn.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++) {
			System.out.print("x["+i+"] : ");
			arr[i] = stdIn.nextInt();
		}
		
		System.out.println("��� ����� ����"+sumOf(arr)+"�Դϴ�");
		
		//���� 7-16. �迭 a�� ��� �߿��� �ּڰ��� ���ϴ� minOf�޼��带 �ۼ�����.
		//���� Ű�� ���� ����� ���� ���� ����� ü���� ���Ѵ�.
		System.out.print("��� ���� :");
		int people = stdIn.nextInt();
		
		int[] height = new int[num];
		int[] weight = new int[num];
		
		System.out.println(num+"���� ����� ü���� �Է�����.");
		for(int i=0; i<num; i++) {
			System.out.println((i+1)+" ���� ����");
			height[num] = stdIn.nextInt();
			System.out.println((i+1)+" ���� ������");
			weight[num] = stdIn.nextInt();
		}
		
		System.out.println("���� Ű�� ���� ����� ���� :"); minOf(height);
		System.out.println("���� �����԰� ���� ����� ���� :"); minOf(weight);
		
		
		//���� 7-17. �迭 a�κ��� key�� ���� ���� ������ ��Ҹ� Ž���ϴ� linearSearch �޼���� linearSearchR �޼��带 �ۼ�����
		// ��, Ű�� ���� ���� ������ ��Ұ� ���� ���� ��� linearSearch�� ���� �տ� ��ġ�� ��Ҹ� ã���� linearSearchR�� ���� �ڿ� ��ġ�� ��Ҹ� ã�� ��
		System.out.print("��� ��  :"); 
		n = stdIn.nextInt();
		int[] arrN = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("arrN["+i+"]");
			arrN[i] = stdIn.nextInt();
		}
		
		System.out.print("ã�� ��:");
		int key = stdIn.nextInt();
		
		int idxTop = linearSearch(arrN,key);
		int idxBtm = linearSearchR(arrN,key);
		
		if(idxTop == -1) {
			System.out.println("�ش� ���� �迭�� �������� �ʽ��ϴ�.");
		}else if(idxTop ==  idxBtm) {
			System.out.println("�ش� ���� arrN["+idxTop+"] �� �ֽ��ϴ�.");
		}else{
			System.out.println("�ش� ���� ��Ұ� ���� �� �����մϴ�.");
			System.out.println("���� �տ� ��ġ�� ���� arrN["+idxTop+"]�� �ֽ��ϴ�.");
			System.out.println("���� �ڿ� ��ġ�� ���� arrN["+idxBtm+"]�� �ֽ��ϴ�.");
		}
		
		//���� 7-18.�迭 a�κ��� ��� a[idx]�� �����ϴ� aryRmv�޼��带 �ۼ�����. void aryRmv(int[] arrX, int index)
		//a[idx]�� ������ �� �ڿ� �ִ� ��ҵ��� ������ �ϳ��� �̵��ؼ� �� ��. �̵��� ��  ������ ��Ҵ� �̵��ϱ� ���� ������ ���� ������ ��
		System.out.print("��� �� ");
		num = stdIn.nextInt();
		int[] arrX = new int[num]; 
		for(int i=0; i<num; i++) {
			System.out.print("arrX["+i+"] : ");
			arrX[i] = stdIn.nextInt();
		}
		System.out.print("������ ����� �ε��� : ");
		int index = stdIn.nextInt();
		
		aryRmv(arrX , index);
		
		for(int i=0; i<num; i++) {
			System.out.print("arrX["+i+"] : "+arrX[i]);
		}
		
		//���� 7-19. �迭 a���� ��� a[idx]���� n���� ��Ҹ� �����ϴ� aryRmvN�޼��带 �ۼ� void aryRmv(in[] arrX, int idx, int n)
		//������ a[idx]���� �ڿ��ִ� ��� ��Ҹ� �ϳ��� ������ �̵�, �̵� ����� �ƴ� ��Ҵ� ���� ���� �״�� ����
		System.out.print("��� �� ");
		num = stdIn.nextInt();
		arrX = new int[num]; 
		for(int i=0; i<num; i++) {
			System.out.print("arrX["+i+"] : ");
			arrX[i] = stdIn.nextInt();
		}
		
		System.out.print("������ ������ �ε��� : ");
		int idx = stdIn.nextInt();
		System.out.print("������ ����� ��  : ");
		n = stdIn.nextInt();
		
		aryRmv(arrX,idx,n);
		
		for(int i=0; i<num; i++) {
			System.out.print("arrX["+i+"] : "+arrX[i]);
		}
		
	}

	

	

	

	

		
	
}
