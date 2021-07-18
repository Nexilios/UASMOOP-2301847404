package com.example.uas_usecase_2301847404.game;

import java.util.ArrayList;

public abstract class Castle {
	
    protected static final String INFANTRY = "Infantry";
    protected static final String CAVALRY = "Cavalry";
    protected static final String ARCHER = "Archer";
    protected static final String CATAPULT = "Catapult";
	
    protected static final double ARCHER_BOOST = 0.2;
    protected static final double CAVALRY_BOOST = 0.2;
    protected static final double INFANTRY_BOOST = 0.2;
    protected static final double CATAPULT_BOOST = 0.2;
    

	protected String CastleSkin;
	protected ArrayList<Heroes> Heroes;
	protected ArrayList<Armies> Armies;
	
	public String getCastleSkin() {
		return CastleSkin;
	}

	
	
	public void setCastleSkin(String castleSkin) {
		CastleSkin = castleSkin;
	}
	
	
	
	public ArrayList<Heroes> getHeroes() {
		return Heroes;
	}
	

	public Castle(String castleSkin, ArrayList<Heroes> heroes, ArrayList<Armies> armies) {
		super();
		CastleSkin = castleSkin;
		Heroes = heroes;
		Armies = armies;
	}



	public void setHeroes(ArrayList<Heroes> heroes) {
		Heroes = heroes;
	}



	public ArrayList<Armies> getArmies() {
		return Armies;
	}



	public void setArmies(ArrayList<Armies> armies) {
		Armies = armies;
	}

	protected abstract double calculatePower();
	
	public Castle() {
		// TODO Auto-generated constructor stub
	}

}
