package kadai;

import java.util.Scanner;

public class Story {
	public static void main(String[] args) {

		 // —EÒ‚Ì¶¬

		Hero h = new Hero();
		h.setName("ro");
		h.setHp(-200);
		h.setAt(50);
		h.setDf(80);
		

		System.out.println("ŒÖ‚è‚‚«—EÒ‚ª¡‚±‚±‚É’a¶‚µ‚½");
		System.out.println("–¼‘O:"   + h.getName());
		System.out.println("‘Ì—Í:"   + h.getHp());
		System.out.println("UŒ‚—Í:" + h.getAt());
		System.out.println("–hŒä—Í:" + h.getDf());
		

		 // ‰ö•¨‚Ì¶¬

		Monster m = new Monster();
		m.setName("kaiju");
		m.setAt(-100);
		m.setDf(120);
		

		System.out.println("‰ĞX‚µ‚¢‰ö•¨‚ª‚±‚±‚É’a¶‚µ‚½");
		System.out.println("–¼‘O:"   + m.getName());
		System.out.println("UŒ‚—Í:" + m.getAt());
		System.out.println("–hŒä—Í:" + m.getDf());

		 // –‚–@g‚¢‚Ì¶¬

		Magician mg = new Magician();
		mg.setName("medeia00000");
		mg.setHp(100);
		mg.setAt(30);
		mg.setMp(-50);
        mg.setM_at(50);
		
		System.out.println("–‚–@g‚¢‚ª‚±‚±‚É’a¶‚µ‚½");
		System.out.println("–¼‘O:"   + mg.getName());
		System.out.println("‘Ì—Í:"   + mg.getHp());
		System.out.println("UŒ‚—Í:" + mg.getAt());
		System.out.println("MP:"     + mg.getMp());
		System.out.println("UŒ‚–‚–@—Í:" + mg.getM_at());

		Scanner scanner4 = new Scanner(System.in);

		LOOP_I: for (int i = 0; i < 5; i++) {
			System.out.println("< –‚–@g‚¢‚Ììí‚ÍH >");
			System.out.println("UŒ‚:1 UŒ‚–‚–@:2 ‰ñ•œ–‚–@:3 ‹xŒe:4 I—¹:5");

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
			System.out.println("y–‚–@g‚¢:ƒXƒe[ƒ^ƒXz");
			System.out.println("‘Ì—Í:" + mg.getHp());
			System.out.println("MP:" + mg.getMp());
		}
		System.out.println("–‚–@g‚¢‚Ìƒ^[ƒ“I—¹");

		scanner4.close();
	}

}
