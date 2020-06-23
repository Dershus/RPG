import java.security.SecureRandom;
public class Game {

	public static void main(String[] args) {
		Role[] W = new Role[6];
		
		W[0] = new Warroir("戰士一",400,100);
		W[1] = new Warroir("戰士二",400,100);
		W[2] = new Warroir("戰士三",400,100);
		W[3] = new Witch("法師一",280,200);
		W[4] = new Witch("法師二",280,200);
		W[5] = new Witch("法師三",280,200);
		
		for(Role i : W) {
			System.out.println(i);
		}

		int a = 0, b = 0;
		while(W[b].getLife() > 0)
		{
			SecureRandom randomNumbers = new SecureRandom();
			a = randomNumbers.nextInt(5);
			b = randomNumbers.nextInt(5);
			if(a == b)continue;
			
			System.out.println(W[a].getName() + "打了" + W[b].getName() + "...");
			System.out.println(W[b].getName() + "'s life : " + W[b].getLife());
			System.out.println(W[a].getName() + "'s magic : " + W[b].getMagic());
			if(W[a] instanceof Warroir) {
				Warroir play1 = (Warroir) W[a];
				play1.NewMoon(W[b]);
			}
			else {
				Witch play1 = (Witch) W[a];
				play1.fire(W[b]);
			}
			int chance;
			if(W[b].getLife() < 100) {
				chance = randomNumbers.nextInt(9);
				if(chance == 0) {
					W[b].drink(new RedDrug("Large"));
					System.out.println("喝大型紅藥水");
				}else if(chance>0&&chance<=3) {
					W[b].drink(new RedDrug("Middle"));
					System.out.println("喝中型紅藥水");
				}else if(chance>3&&chance<=7) {
					W[b].drink(new RedDrug("Small"));
					System.out.println("喝小型紅藥水");
				}
			}
			if(W[a].getMagic() < 70) {
				chance=randomNumbers.nextInt(9);
				if(chance==0) {
					W[a].drink(new BlueDrug("Large"));
					System.out.println("喝大型藍藥水");
				}else if(chance>0&&chance<=3) {
					W[a].drink(new BlueDrug("Middle"));
					System.out.println("喝中型藍藥水");
				}else if(chance>3&&chance<=7) {
					W[a].drink(new BlueDrug("Small"));
					System.out.println("喝小型藍藥水");
				}
					
			}
		}
		for(Role i : W) {
			System.out.println(i);
		}
	}

}