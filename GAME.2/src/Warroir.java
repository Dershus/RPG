
public class Warroir extends Role {
	public Warroir(String name, int life, int magic) {
		super(name, life, magic);
	}
	public void NewMoon(Role w)
	{
		if(getMagic() < 10)
		{
			System.out.println("�]�O�����A�L�k����!");
		}
		else if(w instanceof Warroir)
		{
			setMagic(getMagic() - 10);
			w.setLife(w.getLife() - 25);
		}else if(w instanceof Witch) {
			setMagic(getMagic() - 10);
			w.setLife(w.getLife() - 40);
		}
		if(w.getLife() < 0)
		{
			System.out.println(w.getName() + "�Q"+getName() + "�����F!!!");
			System.exit(0);
		}
	}

	public String toString() {
		return String.format("Name:%s  Life:%d   Magic:%d",getName(),getLife(),getMagic() );
	}
	
}
