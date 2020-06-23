
public abstract class Role {
	private final String name;
	private int life;
	private int magic;

	public Role(String name,int life,int magic) {
			this.name = name;
			if(life > 0)
				this.life = life;
			if(magic > 0)
				this.magic = magic;
		}

	public void setLife(int life) {this.life = life;}
	public int getLife() {return life;}
	public void setMagic(int magic) {this.magic = magic;}
	public int getMagic() {return magic;}
	public String getName() {return name;}
	
	//drink a bottle of drug
	public void drink(drug D) {
		if(D instanceof RedDrug) {
			RedDrug d = (RedDrug) D;
			setLife(d.getAddLife() + getLife());
		}else {
			BlueDrug d = (BlueDrug) D;
			setLife(d.getAddMagic() + getMagic());
		}
	}
}
