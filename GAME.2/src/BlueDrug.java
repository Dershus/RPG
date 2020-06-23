
public class BlueDrug extends drug{
	private int addMagic = 0;		// 100,60,30
	
	public BlueDrug() {}
	
	//constructor to determine which size the player need to drink
	public BlueDrug(String size) {
		switch(size) {
		case "Large":
			addMagic = 100;
			break;
		case "Middle":
			addMagic = 60;
			break;
		case "Small":
			addMagic = 30;
			break;
		default:
			System.out.println("No such BlueDrug Size");
			addMagic = 0;
		}
	}
	
	public int getAddMagic() {return addMagic;}
}
