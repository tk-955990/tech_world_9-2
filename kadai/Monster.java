package kadai;

public class Monster {

	private String name;
	private int hp;
	private int at;
	private int df;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name=="null") {
			throw new IllegalArgumentException("名前がnullです");
		}if ((name.length()<3)||(name.length()>10)){
			throw new IllegalArgumentException("文字数は3文字以上、１０文字以下で入力してください");
		}
		this.name = name;
	}
	public int getAt() {
		return this.at;
	}
	public void setAt(int at) {
		if (at<0){
			at=0 ;
		}
		this.at = at;
	}
	public int getDf() {
		return this.df;
	}
	public void setDf(int df) {
		if (df<0){
			df=0 ;
		}
		this.df = df;
	}


	void attack() {
		System.out.println(this.name + "の攻撃！！！");
		System.out.println(this.at + "ポイントのダメージを受けた");
	}

	void defense() {
		System.out.println(this.name + "は守りを固めた");
		this.df = this.df + 10;
		System.out.println(this.name + "の防御力が１０ポイント上がった");
	}
}
