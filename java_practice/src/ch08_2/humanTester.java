package ch08_2;

public class humanTester {//���� 8-2.
	//���� 1���� ������ ���� 
	//�ʱ�ȭ�� ���õ� ���輺 ����
	//������ ��ȣ�� ���õ� ���輺 ����
	public static void main(String[] args) {
		//�ν��Ͻ��� �����Ͽ� ������ ����
		human gildong = new human("�浿",170,60);
		human chulsu = new human("ö��",166,72);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		System.out.println(gildong.getName());
		System.out.println(gildong.getWeight());
		System.out.println(gildong.getHeight());
		System.out.println();
		
		System.out.println(chulsu.getName());
		System.out.println(chulsu.getWeight());
		System.out.println(chulsu.getHeight());
		
	}

}
