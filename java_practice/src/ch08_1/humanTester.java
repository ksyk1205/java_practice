package ch08_1;

public class humanTester { //������ 8-1

	public static void main(String[] args) {
		//Ŭ������ ������ ���� �Ѵ�.
		human seyeon = new human();
		human seyeon2 = new human();
		
		//Ŭ������ ������ ������ �� ���������� �����ϴ� �ν��Ͻ��� ������ �� �ִ�.
		seyeon.name = "����";
		seyeon.height = 160;
		seyeon.weight = 50;
		
		seyeon2.name ="������";
		seyeon.height = 165;
		seyeon.weight = 55;
		
		System.out.println("�̸� : "+seyeon.name);
		System.out.println("���� : "+seyeon.height);
		System.out.println("������ : "+seyeon.weight);
		System.out.println();
		
		System.out.println("�̸� : "+seyeon2.name);
		System.out.println("���� : "+seyeon2.height);
		System.out.println("������ : "+seyeon2.weight);
		
		

	}

}
