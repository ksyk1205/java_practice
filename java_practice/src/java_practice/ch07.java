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
		while(n -- > 0)
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
	
	static void aryIns(int[] arrA, int idx, int val) {
		if(idx >0 && idx <arrA.length) {
			for(int i = arrA.length; i>idx; i--) {
				arrA[i]=arrA[i-1];
			}
			arrA[idx] = val;
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
	
	static void aryExchng(int[] arrA, int[] arrB) {
		int n = arrA.length < arrB.length ? arrA.length : arrB.length;
		for(int i = 0;  i<n; i++ ) {
			int t = arrA[i];
			arrA[i] = arrB[i];
			arrB[i] = t;
		}
		
	}
	
	static int[] arryClone(int[] a) {
		int[] arrc = new int[a.length];
		for(int i=0; i<a.length; i++) {
			arrc[i] = a[i];
		}
		return arrc;
	}
	
	static int[] arraySrchIdx(int[] a, int n) {
		int count=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == n) {
				count++;
			}
		}
		int c[] = new int[count--];
		for(int i=a.length-1; count>=0; i--) {
			if(a[i] == n) {
				c[count--] = i;
			}
		}
		return c;
		
	}
	static int[] arrayRmvOf(int[] a, int idx) {
		if(a.length-1  <idx &&  idx<0)
			return a.clone();
		else {
			int[] c = new int[a.length-1];
			for(int i=0; i<idx; i++) {
				c[i]=a[i];
			}
			for(int i=idx; i<c.length; i++) {
				c[i]=a[i+1];
			}
			return c;
		}
	}
	
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		if(a.length<idx || idx<0 ||n<0) {
			return a.clone();
		}else {
			int[] c = new int[a.length-n];
			for(int i=0; i<idx; i++) {
				c[i] = a[i];
			}
			for(int i=0; i<c.length; i++) {
				c[i] = a[i+n];
			}
			return c;
		}
		
	}
	
	static int[] arrayInsOf(int[] a, int idx, int n) {
		if(a.length <idx || idx<0) {
			return a.clone();
		}else {
			int[] y = new int[a.length+1];
			for(int i=0; i<idx; i++) {
				y[i] = a[i];
			}
			for(int i=idx; i<y.length; i++) {
				y[i+1] = a[i];
			}
			y[idx] = n;
			return y;
		}
		
	}
	
	static void printMatrix(int[][] x) {
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		
	}

	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		if(x.length != y.length || y.length != z.length ) {
			return false;
		}
		for(int i=0; i<x.length; i++) {
			if(x[i].length != y[i].length || y[i].length != z[i].length ) {
				return false;
			}
		}
		
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return true;
	}

	static int[][] addMatrix(int[][] x, int[][] y) {
		int[][] z = new int[x.length][];
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				z[i][j] = x[i][j]+y[i][j];
			}
		}
		return z;
	}
	static int min(int[] a) {
		int min = a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]<min)
				min = a[i];
		}
		
		return min;
	}

	static int min(int x, int y) {
		return x>y ? y:x;
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
		System.out.print(" �Դϴ�.\n");
		
		//���� 7-7. ���� c�� n�� ǥ���ϴ� putChar �޼���� �� �޼��带 ���ο��� ȣ���ؼ� ���� "*"�� n�� �������� ǥ���ϴ� putStart�޼��� �ۼ��Ͽ�
		//�����ﰢ���� ������.
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ǥ���մϴ�.");
		System.out.print("�ܼ��� :");
		int n = stdIn.nextInt();
		for(int i=1; i<=n; i++) {
			putStart(i);
			System.out.println();
		} 
		
		//���� 7-8.����(a=<���� =<b)�� �����ؼ� ��ȯ�ϴ� random�޼��带 �ۼ�  (����, y<=x�� ��� x���� �״�� ��ȯ
		System.out.println("������ �����մϴ�.");
		System.out.println("���Ѱ� :"); x = stdIn.nextInt();
		System.out.println("���Ѱ� :"); int y = stdIn.nextInt();
		
		System.out.println("������ ������ "+random(y,x)+" �Դϴ�.");
		
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
		System.out.println();
		
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
		
		int[] height = new int[people];
		int[] weight = new int[people];
		
		System.out.println(people+"���� ����� ü���� �Է�����.");
		for(int i=0; i<people; i++) {
			System.out.println((i+1)+" ���� ����");
			height[people] = stdIn.nextInt();
			System.out.println((i+1)+" ���� ������");
			weight[people] = stdIn.nextInt();
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
		
		//���� 7-20. �迭 a�� ��� a[idx]�� x�� �����ϴ� aryIns �޼��带 �ۼ�����. void aryIns(int[] a, int idx, int x)
		//���� �ÿ��� a[idx] ~ a[a.length-2]�� �ϳ��� �ڷ� �̵����Ѿ��Ѵ�.
		System.out.print("��� �� : ");
		num = stdIn.nextInt();
		int[] arra = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"] : ");
			arra[i] = stdIn.nextInt();
		}
		
		System.out.print("������ ����� �ε��� : ");
		idx = stdIn.nextInt();
		System.out.print("������ �� : ");
		int val = stdIn.nextInt();
		
		aryIns(arra,idx,val);
		
		for(int i=0; i<num; i++) {
			System.out.print("arrA["+i+"] : "+arra[i]);
		}
		
		//���� 7-21. �迭 a�� �迭 b�� ��ü ��ڰ��� ��ȯ�ϴ� aryExchng �޼���  void aryExchng(int[] a, int[] b)
		//�� �迭�� ��� �� �� �����ʴٸ� ���� ���� �迭 ���� ���߾� ��ȯ�� ��
		System.out.print("�迭 a�� ��� �� : ");
		int numA = stdIn.nextInt();
		int[] arrA = new int[num];
		for(int i=0; i<numA; i++) {
			System.out.print("a["+i+"] : ");
			arrA[i] = stdIn.nextInt();
		}
		System.out.print("�迭 b�� ��� �� : ");
		int numB = stdIn.nextInt();
		int[] arrB = new int[numB];
		for(int i=0; i<numB; i++) {
			System.out.print("b["+i+"] : ");
			arrB[i] = stdIn.nextInt();
		}
		aryExchng(arrA,arrB);
		
		System.out.println("�迭 a�� b�� ��ü��Ҹ� ��ȯ�Ͽ����ϴ�.");
		for(int i=0; i<numA; i++) {
			System.out.print("a["+i+"] : "+arrA[i]);
		}
		for(int i=0; i<numB; i++) {
			System.out.print("b["+i+"] : "+arrB[i]);
		}
		
		//���� 7-22.�迭 a�� ���� �迭(��� ���� ���� ��� ����� ���� ���� �迭)�� �����ؼ� ��ȯ�ϴ� arrayClone�޼��� arryClone(int [] a)
		System.out.print("��Ҽ� : ");
		num = stdIn.nextInt();
		int[] arrx = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arrx[i] = stdIn.nextInt();
		}
		
		int arry[] = arryClone(arrx);
		System.out.println("�迭�� �����ؼ� �迭 y�� �����߽��ϴ�.");
		for(int i=0; i<arry.length; i++) {
			System.out.println("y["+i+"] = "+ arry[i]);
		}
		
		//���� 7-23. �迭 a�� ��� �߿��� ���� x�� ��� ����� �ε����� �տ������� ������� �����ؼ� ��ȯ�ϴ� arraySrchIdx�� �ۼ�����.
		System.out.print("��Ҽ� : ");
		num = stdIn.nextInt();
		int[] array = new int[num];
		
		System.out.print("Ž���� ��");
		n = stdIn.nextInt();
		
		int[] arryidx = arraySrchIdx(array , n);
		
		if(arryidx.length == 0) {
			System.out.println("��ġ�ϴ� ��Ұ� �����ϴ�.");
		}else {
			System.out.println("��ġ�ϴ� ����� �ε���");
			for(int i=0; i<arryidx.length; i++)
			System.out.println(arryidx[i]);
		}
		
		//���� 7-24. �迭 a���� ��� a[idx]�� ������ �迭�� ��ȯ�ϴ� arrayRmvOf�� �ۼ�����. int[] arrayRmvOf(int[] a,int idx)
		//���� a[idx]���� �ڿ��ִ� ��� ��� �� �ϳ��� ������ �̵���ų ��
		System.out.print("��� �� : ");
		num = stdIn.nextInt();
		int[] arrayA =  new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arrayA[i] = stdIn.nextInt();
		}
		System.out.print("������ �ε����� ?");
		index = stdIn.nextInt();
		
		int[] arrayB = arrayRmvOf(arrayA,index);
		
		for(int i=0; i<arrayB.length; i++) {
			System.out.println("b["+i+"]"+arrayB[i]);
		}
		 
		//���� 7-25. �迭 a���� ��� a[idx]���� n�� ��Ҹ� ������ �迭�� ��ȯ�ϴ� arrayRmvOfN�޼��带 �ۼ�����
		//����a[idx] ���� �ڿ��ִ� ��Ҹ� n�� ������ �̵��ؼ� �� ��.
		System.out.print("��� �� : ");
		num = stdIn.nextInt();
		int[] arryN =  new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arryN[i] = stdIn.nextInt();
		}
		
		System.out.print("������ ������ �ε��� : ");
		idx = stdIn.nextInt();
		System.out.print("������ ����� ����  : ");
		n = stdIn.nextInt();
		
		arryN = arrayRmvOfN(arryN,idx,n);
		
		for(int i=0; i<arryN.length; i++) {
			System.out.println("b["+i+"]"+arryN[i]);
		}
		
		//���� 7-26. �迭 a�� ��� a[idx]�� x�� �����ؼ� �迭�� ��ȯ�ϴ� arrayInsOf�� �ۼ�����.
		//�����Ҷ��� a[idx]�ڿ� �ִ� ��� ��Ҹ� �ϳ��� �ڷ� �̵���ų ��
		System.out.print("��� �� : ");
		num = stdIn.nextInt();
		int[] arryI =  new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arryI[i] = stdIn.nextInt();
		}
		
		System.out.print("������ �ε��� :");
		idx = stdIn.nextInt();
		System.out.print("������ �� :");
		n = stdIn.nextInt();
		
		arryI = arrayInsOf(arryI,idx,n);
		
		//���� 7-27. ��� x�� y�� ���� ���ؼ� z�� �����ϴ� addMatrix �޼��带 �ۼ�����  boolean addMatrix(int[][] x, int[][] y, int[][] z)
		//3�� �迭�� ��� ���� ������ ����ؼ� true�� ��ȯ�ϰ� ���������� ������ false�� ��ȯ�� ��
		int[][] arrayx = {{1,2,3},{4,5,6}};;
		int[][] arrayy = {{6,3,4},{1,2,5}};;
		int[][] arrayz = new int[2][3];
		
		if(addMatrix(arrayx,arrayy,arrayz)) {
			System.out.println("��� a");
			printMatrix(arrayx);
			System.out.println("��� b");
			printMatrix(arrayy);
			System.out.println("��� c");
			printMatrix(arrayz);
		}
		
		//���� 7-28. ��� x�� y�� ���� �����ؼ� 2���� �迭�� ��ȯ�ϴ� �޼��� �ۼ�  int[][] addMatrix(int[][] x, int[][] y)
		System.out.print("����� �� �� :");
		int row = stdIn.nextInt();
		System.out.print("����� �� �� :");
		int col = stdIn.nextInt();
		
		int[][] arrayX = new int[row][col];
		int[][] arrayY = new int[row][col];
		
		for(int i=0; i<arrayX.length; i++) {
			for(int j=0; j<arrayX[i].length; j++) {
				System.out.printf("a[%d][%d]",i,j);
				arrayX[i][j] = stdIn.nextInt();
			}
		}
		for(int i=0; i<arrayY.length; i++) {
			for(int j=0; j<arrayY[i].length; j++) {
				System.out.printf("b[%d][%d]",i,j);
				arrayY[i][j] = stdIn.nextInt();
			}
		}
		
		int[][] arrayZ = addMatrix(arrayX,arrayY);
		
	
		System.out.println("��� x");
		printMatrix(arrayX);
		System.out.println("��� y");
		printMatrix(arrayY);
		System.out.println("��� z");
		printMatrix(arrayZ);
		
		
		//���� 7-30. 2���� int�� ���� a,b�� �ּڰ�,3���� int�� ���� a,b,c�� �ּڰ�, �迭 a�� �ּڰ��� ���� ������.
		System.out.print("x�� : ");
		x = stdIn.nextInt();
		System.out.print("y�� : ");
		y = stdIn.nextInt();
		System.out.print("z�� : ");
		int z = stdIn.nextInt();
		
		System.out.print("�迭 a�� ��� ��  : ");
		num = stdIn.nextInt();
		int[] arrayN = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]");
			arrayN[i] = stdIn.nextInt(); 
		}
		
		//x,y �ΰ��� �ּڰ�
		System.out.println("x,y�� �ּڰ��� "+min(x,y)+"�Դϴ�.");
		//x,y,z ������ �ּڰ�
		System.out.println("x,y�� �ּڰ��� "+min(x,y,z)+"�Դϴ�.");
		//�迭�� �ּڰ�
		System.out.println("x,y�� �ּڰ��� "+min(arryN)+"�Դϴ�.");

	}

	
	

	

	

		
	
}
