
public class Witch extends Role {

	public Witch(String name, int life, int magic) {
		super(name, life, magic);
	}
	public void fire(Role w)
	{
		if(getMagic() < 25)
		{
			System.out.println("魔力不足，無法攻擊!");
		}
		else if(w instanceof Warroir)
		{
			setMagic(getMagic() - 25);
			w.setLife(w.getLife() - 40);
		}
		else if(w instanceof Witch) {
			setMagic(getMagic() - 25);
			w.setLife(w.getLife() - 60);
		}
		if(w.getLife() < 0)
		{
			System.out.println(w.getName() + "被" + getName() + "打死了!!!");
			System.exit(0);
		}
	}
	
	public String toString() {
		return String.format("Name:%s  Life:%d   Magic:%d",getName(),getLife(),getMagic() );
	}
}
