package com.example.uas_usecase_2301847404.game;

public abstract class Heroes {

    protected static final String INFANTRY = "Infantry";
    protected static final String CAVALRY = "Cavalry";
    protected static final String ARCHER = "Archer";
    protected static final String CATAPULT = "Catapult";
    
	protected static final Double INFANTRY_BOOST = 0.4;
    protected static final Double CAVALRY_BOOST = 0.4;
    protected static final Double ARCHER_BOOST = 0.4;
    protected static final Double CATAPULT_BOOST = 0.4;
	
	protected String HeroType;
	protected Integer HeroLevel, HeroCount;
	
	public String getHeroType() {
		return HeroType;
	}

	public Heroes(String heroType, Integer heroLevel, Integer heroCount) {
		super();
		HeroType = heroType;
		HeroLevel = heroLevel;
		HeroCount = heroCount;
	}

	public Integer getHeroCount() {
		return HeroCount;
	}

	public void setHeroCount(Integer heroCount) {
		HeroCount = heroCount;
	}

	public void setHeroType(String heroType) {
		HeroType = heroType;
	}

	public Integer getHeroLevel() {
		return HeroLevel;
	}

	public void setHeroLevel(Integer heroLevel) {
		HeroLevel = heroLevel;
	}
	
	public Heroes() {
		// TODO Auto-generated constructor stub
	}

}
