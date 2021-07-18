

public class InfantryCastle extends Castle{

	public InfantryCastle() {
		this.CastleSkin = Castle.INFANTRY;
	}

	public double calculatePower() {
        double power = 0;
        
        for (Armies arm: this.Armies) {
            if (this.getHeroes().toString().contains(arm.ArmyType)) {
            	Integer herocount = 0;
            	for (Heroes h1 : Heroes) {
					if(h1.getHeroType() == arm.getArmyType()) {
						herocount = h1.getHeroCount();
					}
				}
            	Double boost = (double) (0.4 * herocount);
            	power += arm.numbers + arm.numbers * boost;
            }else {
                power += arm.numbers;
            }
        }
        return power;
	}
	
}
