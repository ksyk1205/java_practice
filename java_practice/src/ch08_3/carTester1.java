package ch08_3;

public class carTester1 {

	public static void main(String[] args) {
		car k3 = new car("k3","����999-99",1660, 1500, 3640, 40.0, 35.0, 12.0);
		car k5 = new car("k5","����999-98",1660, 1525, 3698, 41.0, 35.0, 12.0);
		
		k3.putSpec(); //k3 ���ǥ��
		System.out.println();
		k5.putSpec(); //k5 ���ǥ��

	}

}
