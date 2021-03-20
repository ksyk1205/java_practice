package ch08_3;

public class carTester1 {

	public static void main(String[] args) {
		car k3 = new car("k3","서울999-99",1660, 1500, 3640, 40.0, 35.0, 12.0);
		car k5 = new car("k5","서울999-98",1660, 1525, 3698, 41.0, 35.0, 12.0);
		
		k3.putSpec(); //k3 사양표시
		System.out.println();
		k5.putSpec(); //k5 사양표시

	}

}
