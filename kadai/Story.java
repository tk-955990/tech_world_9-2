package kadai;

import java.util.Scanner;

public class Story {
	public static void main(String[] args) {

		 // �E�҂̐���

		Hero h = new Hero();
		h.setName("ro");
		h.setHp(-200);
		h.setAt(50);
		h.setDf(80);
		

		System.out.println("�ւ荂���E�҂��������ɒa������");
		System.out.println("���O:"   + h.getName());
		System.out.println("�̗�:"   + h.getHp());
		System.out.println("�U����:" + h.getAt());
		System.out.println("�h���:" + h.getDf());
		

		 // �����̐���

		Monster m = new Monster();
		m.setName("kaiju");
		m.setAt(-100);
		m.setDf(120);
		

		System.out.println("�ЁX���������������ɒa������");
		System.out.println("���O:"   + m.getName());
		System.out.println("�U����:" + m.getAt());
		System.out.println("�h���:" + m.getDf());

		 // ���@�g���̐���

		Magician mg = new Magician();
		mg.setName("medeia00000");
		mg.setHp(100);
		mg.setAt(30);
		mg.setMp(-50);
        mg.setM_at(50);
		
		System.out.println("���@�g���������ɒa������");
		System.out.println("���O:"   + mg.getName());
		System.out.println("�̗�:"   + mg.getHp());
		System.out.println("�U����:" + mg.getAt());
		System.out.println("MP:"     + mg.getMp());
		System.out.println("�U�����@��:" + mg.getM_at());

		Scanner scanner4 = new Scanner(System.in);

		LOOP_I: for (int i = 0; i < 5; i++) {
			System.out.println("< ���@�g���̍��́H >");
			System.out.println("�U��:1 �U�����@:2 �񕜖��@:3 �x�e:4 �I��:5");

			int getCommand = new java.util.Scanner(System.in).nextInt();

			switch (getCommand) {
			case 1:
				mg.attack();
				break;
			case 2:
				mg.magic_Attack();
				break;
			case 3:
				mg.magic_Recovery();
				break;
			case 4:
				mg.heal();
				break;
			case 5:
				break LOOP_I;
			}
			System.out.println("�y���@�g��:�X�e�[�^�X�z");
			System.out.println("�̗�:" + mg.getHp());
			System.out.println("MP:" + mg.getMp());
		}
		System.out.println("���@�g���̃^�[���I��");

		scanner4.close();
	}

}
