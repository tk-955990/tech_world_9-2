package kadai;

import java.util.Scanner;

public class Story {
	public static void main(String[] args) {

		 // 勇者の生成

		Hero h = new Hero();
		h.setName("null");
		h.setHp(-200);
		h.setAt(50);
		h.setDf(80);
		

		System.out.println("誇り高き勇者が今ここに誕生した");
		System.out.println("名前:"   + h.getName());
		System.out.println("体力:"   + h.getHp());
		System.out.println("攻撃力:" + h.getAt());
		System.out.println("防御力:" + h.getDf());
		

		 // 怪物の生成

		Monster m = new Monster();
		m.setName("kaiju");
		m.setAt(-100);
		m.setDf(120);
		

		System.out.println("禍々しい怪物がここに誕生した");
		System.out.println("名前:"   + m.getName());
		System.out.println("攻撃力:" + m.getAt());
		System.out.println("防御力:" + m.getDf());

		 // 魔法使いの生成

		Magician mg = new Magician();
		mg.setName("medeia");
		mg.setHp(100);
		mg.setAt(30);
		mg.setMp(-50);
        mg.setM_at(50);
		
		System.out.println("魔法使いがここに誕生した");
		System.out.println("名前:"   + mg.getName());
		System.out.println("体力:"   + mg.getHp());
		System.out.println("攻撃力:" + mg.getAt());
		System.out.println("MP:"     + mg.getMp());
		System.out.println("攻撃魔法力:" + mg.getM_at());

		Scanner scanner4 = new Scanner(System.in);

		LOOP_I: for (int i = 0; i < 5; i++) {
			System.out.println("< 魔法使いの作戦は？ >");
			System.out.println("攻撃:1 攻撃魔法:2 回復魔法:3 休憩:4 終了:5");

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
			System.out.println("【魔法使い:ステータス】");
			System.out.println("体力:" + mg.getHp());
			System.out.println("MP:" + mg.getMp());
		}
		System.out.println("魔法使いのターン終了");

		scanner4.close();
	}

}
