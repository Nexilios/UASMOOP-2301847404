
public abstract class Armies {
	
    protected static final String INFANTRY = "Infantry";
    protected static final String CAVALRY = "Cavalry";
    protected static final String ARCHER = "Archer";
    protected static final String CATAPULT = "Catapult";
    
    protected String ArmyType;

    protected Integer numbers;
	
	public Armies(String armyType, Integer numbers) {
		super();
		ArmyType = armyType;
		this.numbers = numbers;
	}

	public String getArmyType() {
		return ArmyType;
	}

	public void setArmyType(String armyType) {
		ArmyType = armyType;
	}

	public Integer getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer numbers) {
		this.numbers = numbers;
	}

	public Armies() {
		// TODO Auto-generated constructor stub
	}

}
