
public class RedDrug extends drug {
	private int addLife=0; 		//120,80,50

	public RedDrug() {}
	
	//constructor to determine which size the player need to drink
	public RedDrug(String size) {
		switch(size) {
		case "Large":
			addLife = 120;
			break;
		case "Middle":
			addLife = 80;
			break;
		case "Small":
			addLife = 50;
			break;
		default:
			System.out.println("No such RedDrug Size");
			addLife = 0;
		}
	}
	public int getAddLife() {return addLife;}
}
